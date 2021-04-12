package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem
import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.UUID

class RootElementCreator {
	String systemName
	
	new(String systemName) {
		this.systemName = systemName
	}
	
	def generateElements(DialogFlowSystem sys, IFileSystemAccess2 fsa) {
		fsa.generateFile(
			systemName + "/package.json",
			createPackageFile
		)
		
		fsa.generateFile(
			systemName + "/agent.json",
			createAgentFile
		)
	}
	
	def createPackageFile() {
		'''
		{
			"version": "1.0.0"
		}
		'''
	}
	
	def createAgentFile() {
		val secondaryKey = UUID.randomUUID()
		
		'''
		{
		  "description": "",
		  "language": "en",
		  "shortDescription": "",
		  "examples": "",
		  "linkToDocs": "",
		  "displayName": "«systemName»",
		  "disableInteractionLogs": false,
		  "disableStackdriverLogs": true,
		  "defaultTimezone": "Europe/Kaliningrad",
		  "isPrivate": true,
		  "mlMinConfidence": 0.3,
		  "supportedLanguages": [],
		  "enableOnePlatformApi": true,
		  "onePlatformApiVersion": "v2",
		  "secondaryKey": "«secondaryKey.toString()»",
		  "analyzeQueryTextSentiment": false,
		  "enabledKnowledgeBaseNames": [],
		  "knowledgeServiceConfidenceAdjustment": 0.0,
		  "dialogBuilderMode": false,
		  "baseActionPackagesUrl": "",
		  "enableSpellCorrection": false
		}
		'''
	}
}
