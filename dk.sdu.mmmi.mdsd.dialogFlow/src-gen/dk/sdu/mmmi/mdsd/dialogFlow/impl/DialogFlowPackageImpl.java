/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.dialogFlow.impl;

import dk.sdu.mmmi.mdsd.dialogFlow.ActionValue;
import dk.sdu.mmmi.mdsd.dialogFlow.Actions;
import dk.sdu.mmmi.mdsd.dialogFlow.Declaration;
import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowFactory;
import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage;
import dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem;
import dk.sdu.mmmi.mdsd.dialogFlow.Entity;
import dk.sdu.mmmi.mdsd.dialogFlow.EntitySynonyms;
import dk.sdu.mmmi.mdsd.dialogFlow.EntityValue;
import dk.sdu.mmmi.mdsd.dialogFlow.Intent;
import dk.sdu.mmmi.mdsd.dialogFlow.Mapping;
import dk.sdu.mmmi.mdsd.dialogFlow.PhraseValue;
import dk.sdu.mmmi.mdsd.dialogFlow.Phrases;
import dk.sdu.mmmi.mdsd.dialogFlow.ResponseValue;
import dk.sdu.mmmi.mdsd.dialogFlow.Responses;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DialogFlowPackageImpl extends EPackageImpl implements DialogFlowPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dialogFlowSystemEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass declarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass intentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phrasesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phraseValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass responsesEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass responseValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass actionValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entityValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass entitySynonymsEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DialogFlowPackageImpl()
  {
    super(eNS_URI, DialogFlowFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link DialogFlowPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DialogFlowPackage init()
  {
    if (isInited) return (DialogFlowPackage)EPackage.Registry.INSTANCE.getEPackage(DialogFlowPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredDialogFlowPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    DialogFlowPackageImpl theDialogFlowPackage = registeredDialogFlowPackage instanceof DialogFlowPackageImpl ? (DialogFlowPackageImpl)registeredDialogFlowPackage : new DialogFlowPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theDialogFlowPackage.createPackageContents();

    // Initialize created meta-data
    theDialogFlowPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDialogFlowPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DialogFlowPackage.eNS_URI, theDialogFlowPackage);
    return theDialogFlowPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDialogFlowSystem()
  {
    return dialogFlowSystemEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDialogFlowSystem_Name()
  {
    return (EAttribute)dialogFlowSystemEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDialogFlowSystem_Declarations()
  {
    return (EReference)dialogFlowSystemEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDeclaration()
  {
    return declarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDeclaration_Name()
  {
    return (EAttribute)declarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntent()
  {
    return intentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIntent_Phrase()
  {
    return (EReference)intentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIntent_Response()
  {
    return (EReference)intentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getIntent_Action()
  {
    return (EReference)intentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPhrases()
  {
    return phrasesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPhrases_Phrases()
  {
    return (EReference)phrasesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPhraseValue()
  {
    return phraseValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPhraseValue_Mapping()
  {
    return (EReference)phraseValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMapping()
  {
    return mappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMapping_Value()
  {
    return (EAttribute)mappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMapping_Entity()
  {
    return (EReference)mappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getResponses()
  {
    return responsesEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getResponses_Responses()
  {
    return (EReference)responsesEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getResponseValue()
  {
    return responseValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getResponseValue_Response()
  {
    return (EAttribute)responseValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getActions()
  {
    return actionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getActions_Actions()
  {
    return (EReference)actionsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getActionValue()
  {
    return actionValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getActionValue_Name()
  {
    return (EAttribute)actionValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getActionValue_Type()
  {
    return (EReference)actionValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getActionValue_Value()
  {
    return (EAttribute)actionValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getActionValue_List()
  {
    return (EAttribute)actionValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEntity()
  {
    return entityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEntity_Entities()
  {
    return (EReference)entityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEntityValue()
  {
    return entityValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEntityValue_Values()
  {
    return (EAttribute)entityValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEntityValue_Synonyms()
  {
    return (EReference)entityValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEntitySynonyms()
  {
    return entitySynonymsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEntitySynonyms_Values()
  {
    return (EAttribute)entitySynonymsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DialogFlowFactory getDialogFlowFactory()
  {
    return (DialogFlowFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dialogFlowSystemEClass = createEClass(DIALOG_FLOW_SYSTEM);
    createEAttribute(dialogFlowSystemEClass, DIALOG_FLOW_SYSTEM__NAME);
    createEReference(dialogFlowSystemEClass, DIALOG_FLOW_SYSTEM__DECLARATIONS);

    declarationEClass = createEClass(DECLARATION);
    createEAttribute(declarationEClass, DECLARATION__NAME);

    intentEClass = createEClass(INTENT);
    createEReference(intentEClass, INTENT__PHRASE);
    createEReference(intentEClass, INTENT__RESPONSE);
    createEReference(intentEClass, INTENT__ACTION);

    phrasesEClass = createEClass(PHRASES);
    createEReference(phrasesEClass, PHRASES__PHRASES);

    phraseValueEClass = createEClass(PHRASE_VALUE);
    createEReference(phraseValueEClass, PHRASE_VALUE__MAPPING);

    mappingEClass = createEClass(MAPPING);
    createEAttribute(mappingEClass, MAPPING__VALUE);
    createEReference(mappingEClass, MAPPING__ENTITY);

    responsesEClass = createEClass(RESPONSES);
    createEReference(responsesEClass, RESPONSES__RESPONSES);

    responseValueEClass = createEClass(RESPONSE_VALUE);
    createEAttribute(responseValueEClass, RESPONSE_VALUE__RESPONSE);

    actionsEClass = createEClass(ACTIONS);
    createEReference(actionsEClass, ACTIONS__ACTIONS);

    actionValueEClass = createEClass(ACTION_VALUE);
    createEAttribute(actionValueEClass, ACTION_VALUE__NAME);
    createEReference(actionValueEClass, ACTION_VALUE__TYPE);
    createEAttribute(actionValueEClass, ACTION_VALUE__VALUE);
    createEAttribute(actionValueEClass, ACTION_VALUE__LIST);

    entityEClass = createEClass(ENTITY);
    createEReference(entityEClass, ENTITY__ENTITIES);

    entityValueEClass = createEClass(ENTITY_VALUE);
    createEAttribute(entityValueEClass, ENTITY_VALUE__VALUES);
    createEReference(entityValueEClass, ENTITY_VALUE__SYNONYMS);

    entitySynonymsEClass = createEClass(ENTITY_SYNONYMS);
    createEAttribute(entitySynonymsEClass, ENTITY_SYNONYMS__VALUES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    intentEClass.getESuperTypes().add(this.getDeclaration());
    entityEClass.getESuperTypes().add(this.getDeclaration());

    // Initialize classes and features; add operations and parameters
    initEClass(dialogFlowSystemEClass, DialogFlowSystem.class, "DialogFlowSystem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDialogFlowSystem_Name(), ecorePackage.getEString(), "name", null, 0, 1, DialogFlowSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDialogFlowSystem_Declarations(), this.getDeclaration(), null, "declarations", null, 0, -1, DialogFlowSystem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(declarationEClass, Declaration.class, "Declaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, Declaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(intentEClass, Intent.class, "Intent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIntent_Phrase(), this.getPhrases(), null, "phrase", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntent_Response(), this.getResponses(), null, "response", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIntent_Action(), this.getActions(), null, "action", null, 0, 1, Intent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(phrasesEClass, Phrases.class, "Phrases", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPhrases_Phrases(), this.getPhraseValue(), null, "phrases", null, 0, -1, Phrases.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(phraseValueEClass, PhraseValue.class, "PhraseValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPhraseValue_Mapping(), this.getMapping(), null, "mapping", null, 0, -1, PhraseValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMapping_Value(), ecorePackage.getEString(), "value", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMapping_Entity(), this.getEntity(), null, "entity", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(responsesEClass, Responses.class, "Responses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getResponses_Responses(), this.getResponseValue(), null, "responses", null, 0, -1, Responses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(responseValueEClass, ResponseValue.class, "ResponseValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getResponseValue_Response(), ecorePackage.getEString(), "response", null, 0, 1, ResponseValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionsEClass, Actions.class, "Actions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getActions_Actions(), this.getActionValue(), null, "actions", null, 0, -1, Actions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(actionValueEClass, ActionValue.class, "ActionValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActionValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, ActionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getActionValue_Type(), this.getEntity(), null, "type", null, 0, 1, ActionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, ActionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActionValue_List(), ecorePackage.getEString(), "list", null, 0, 1, ActionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityEClass, Entity.class, "Entity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEntity_Entities(), this.getEntityValue(), null, "entities", null, 0, -1, Entity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entityValueEClass, EntityValue.class, "EntityValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntityValue_Values(), ecorePackage.getEString(), "values", null, 0, -1, EntityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEntityValue_Synonyms(), this.getEntitySynonyms(), null, "synonyms", null, 0, -1, EntityValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(entitySynonymsEClass, EntitySynonyms.class, "EntitySynonyms", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEntitySynonyms_Values(), ecorePackage.getEString(), "values", null, 0, -1, EntitySynonyms.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DialogFlowPackageImpl
