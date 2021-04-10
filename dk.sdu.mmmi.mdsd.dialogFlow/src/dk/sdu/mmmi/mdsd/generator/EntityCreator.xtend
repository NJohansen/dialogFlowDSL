package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.dialogFlow.Entity
import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.UUID

class EntityCreator {
	
	String systemName
	
	new(String systemName) {
		this.systemName = systemName
	}
	
	def generateEntity(Entity entity, IFileSystemAccess2 fsa) {
		createValues(entity, fsa)
		createMeta(entity, fsa)
	}
	
	def private createValues(Entity entity, IFileSystemAccess2 fsa) {
		fsa.generateFile(
			systemName + "/entities/" + entity.name + "_entries_en.json",
			entity.compileValues
		)
	}
	
	def private compileValues(Entity entity) {
		'''
		[
			«FOR value : entity.entities SEPARATOR ','»
			{
				"value": "«value.value»",
				"synonyms": [
					«IF value.synonyms !== null»
						«FOR synonym : value.synonyms.values SEPARATOR ','»
							"«synonym»"
						«ENDFOR»
					«ENDIF»
				]
			}
			«ENDFOR»
		]
		'''
	}
	
	def private createMeta(Entity entity, IFileSystemAccess2 fsa) {
		fsa.generateFile(
			systemName + "/entities/" + entity.name + ".json",
			entity.compileMeta
		)
	}
	
	def private compileMeta(Entity entity) {
		var id = UUID.randomUUID().toString()
		'''
		{
			"id": "«id»",
			"name": "«entity.name»",
			"isOverridable": true,
			"isEnum": false,
			"isRegexp": false,
			"automatedExpansion": false,
			"allowFuzzyExtraction": false
		}
		'''
	}
}