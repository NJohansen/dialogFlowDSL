package dk.sdu.mmmi.mdsd.validation

import org.eclipse.xtext.validation.Check
import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem
import dk.sdu.mmmi.mdsd.dialogFlow.Declaration
import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage
import dk.sdu.mmmi.mdsd.dialogFlow.ActionValue
import dk.sdu.mmmi.mdsd.dialogFlow.ResponseValue
import org.eclipse.xtext.EcoreUtil2
import dk.sdu.mmmi.mdsd.dialogFlow.Intent
import java.util.ArrayList
import java.util.HashSet
import java.util.Set
import dk.sdu.mmmi.mdsd.dialogFlow.Root
import dk.sdu.mmmi.mdsd.dialogFlow.Entity

class DialogFlowValidator extends AbstractDialogFlowValidator {
	
	
	@Check
	def checkUniqueIntentAndEntityName(Declaration declaration) {
		var system = EcoreUtil2.getContainerOfType(declaration, DialogFlowSystem);
		
		var timesFound = 0;
		for (Declaration de : system.declarations) {
			if (declaration.name.equals(de.name)) {
				timesFound++;
				if (timesFound > 1) {
					error ("Declaration name is not unique", DialogFlowPackage.Literals.DECLARATION__NAME, "invalidName");
					return;
				}
			}
		}
	}
	
	@Check
	def checkResponses(ResponseValue responseValue) {
		var intent = EcoreUtil2.getContainerOfType(responseValue, Intent);
			
		var actionValues = new ArrayList<String>();
		for (ActionValue action : intent.action.actions) {
			actionValues.add(action.value);
		}

		var tokens = responseValue.response.split(" ");
		for (String s : tokens) {
			if (s.startsWith("$")) {
				if (!actionValues.contains(s.substring(1))) {
					error ("Action value: " + s + " is not valid", DialogFlowPackage.Literals.RESPONSE_VALUE__RESPONSE, "invalidActionValue");
					return;
				}
			}
		}
	}
	
	@Check
	def boolean checkIfSelfExtend(DialogFlowSystem nextDialogFlow, Set<String> seen) {
		if(nextDialogFlow===null){
			return false 
		}
		else if(seen.contains(nextDialogFlow.name)){
			return true
		} 
		else { 
			seen.add(nextDialogFlow.name) 
			nextDialogFlow.superType.checkIfSelfExtend(seen)
		}
	}
	
	@Check 
	def checkForCyclicExtension (DialogFlowSystem dialogFlowSystem) {
		val dialogFlowSystems = new HashSet<String>
		dialogFlowSystems.add(dialogFlowSystem.name)
		
		if(dialogFlowSystem.superType.checkIfSelfExtend(dialogFlowSystems)){
			error('Cyclic extension: Name equals inherited name', DialogFlowPackage.Literals.DIALOG_FLOW_SYSTEM__SUPER_TYPE, "cyclicInheritance")
		}
	}
	
	@Check
	def checkUniqueSystemName(DialogFlowSystem dialogFlowSystem) {
		var system = EcoreUtil2.getContainerOfType(dialogFlowSystem, Root);
		var count = 0;
		
		for (DialogFlowSystem df : system.dialogFlowSystems) {
			if (dialogFlowSystem.name.equals(df.name)) {
				count++;
				if (count > 1) {
					error ("DialogFlowSystem name is not unique!", DialogFlowPackage.Literals.DIALOG_FLOW_SYSTEM__NAME, "invalidName");
					return;
				}
			}
		}
	}
	
	@Check
	def checkIfParentHasEntity(Entity entity) {
		var system = EcoreUtil2.getContainerOfType(entity, DialogFlowSystem);
		
		if (system.superType !== null){
		var seen = new HashSet<String>
			for (Entity en : system.superType.declarations.filter(Entity)) {
				seen.add(en.name)
				if (seen.contains(entity.name)) {
					error ("Parent has entity with same name", DialogFlowPackage.Literals.DECLARATION__NAME, "invalidName");
				}
			}
		}
	}
	
}
