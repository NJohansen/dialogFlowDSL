package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.dialogFlow.Intent
import org.eclipse.xtext.generator.IFileSystemAccess2
import java.util.UUID

class IntentCreator {
	String systemName

	new(String systemName) {
		this.systemName = systemName
	}

	def generateIntent(Intent intent, IFileSystemAccess2 fsa){
		generateUsersays(intent,fsa)
		generateResponse(intent,fsa)
	}

	def private generateUsersays(Intent intent, IFileSystemAccess2 fsa){
		fsa.generateFile(
			systemName + "/intents/" + intent.name + "_usersays_en.json",
			intent.compileUserSays
		)
	}

	def private generateResponse(Intent intent, IFileSystemAccess2 fsa){
		fsa.generateFile(
			systemName + "/intents/" + intent.name + ".json",
			intent.compilePhrases
		)

	}

	def private compileUserSays(Intent intent){
		var id = UUID.randomUUID().toString()
		'''
		[
		«FOR expression : intent.phrase.phrases SEPARATOR ','»
			{
			    "id": "«id»",
			    "data": [
			    
			    	«FOR value : expression.mapping SEPARATOR ','»
						{
							"text": "«value.value»",
							«IF value.entity !== null»
							"meta": "@«value.entity.name»",
							"alias": "«value.entity.name»",						
							«ENDIF»
							"userDefined": false
						}
					«ENDFOR»
			    ],
			    "isTemplate": false,
			    "count": 0,
			    "lang": "en",
			    "updated": 0
		  	}
		  «ENDFOR»
		]
		'''
	}

	def private compilePhrases(Intent intent){
		var id = UUID.randomUUID().toString()
		'''
		{
		  "id": "«id»",
		  "name": "«intent.name»",
		  "auto": true,
		  "contexts": [],
		  "responses": [
		    {
		      "resetContexts": true,
		      "action": "",
		      "affectedContexts": [],
		      "parameters": [
		      «IF intent.action !== null»
		      «FOR parameter : intent.action.actions SEPARATOR ','»
		        {
		          "id": "«UUID.randomUUID().toString()»",
		          "name": "«parameter.name»",
		          "required": false,
		          "dataType": "@«parameter.type.name»",
		          "value": "$«parameter.value»",
		          "defaultValue": "",
		          "isList": «IF parameter.list !== null»"true"«ELSE»"false"«ENDIF»,
		          "prompts": [],
		          "promptMessages": [],
		          "noMatchPromptMessages": [],
		          "noInputPromptMessages": [],
		          "outputDialogContexts": []
		        }
		      «ENDFOR»
		      «ENDIF»
		      ],
		      "messages": [
		        {
		          "type": "0",
		          "title": "",
		          "textToSpeech": "",
		          "lang": "en",
		          "speech": [
		          «FOR reply : intent.response.responses SEPARATOR ','»
		            "«reply.response»"
		          «ENDFOR»
		          ],
		          "condition": ""
		        }
		      ],
		      "speech": []
		    }
		  ],
		  "priority": 500000,
		  "webhookUsed": true,
		  "webhookForSlotFilling": false,
		  "fallbackIntent": false,
		  "events": [],
		  "conditionalResponses": [],
		  "condition": "",
		  "conditionalFollowupEvents": []
		}
		'''
	}

} 
