/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.dialogFlow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowFactory
 * @model kind="package"
 * @generated
 */
public interface DialogFlowPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dialogFlow";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sdu.dk/mmmi/mdsd/DialogFlow";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dialogFlow";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DialogFlowPackage eINSTANCE = dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl.init();

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowSystemImpl <em>System</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowSystemImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getDialogFlowSystem()
   * @generated
   */
  int DIALOG_FLOW_SYSTEM = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_FLOW_SYSTEM__NAME = 0;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_FLOW_SYSTEM__DECLARATIONS = 1;

  /**
   * The number of structural features of the '<em>System</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALOG_FLOW_SYSTEM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.DeclarationImpl <em>Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DeclarationImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getDeclaration()
   * @generated
   */
  int DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.IntentImpl <em>Intent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.IntentImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getIntent()
   * @generated
   */
  int INTENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Phrase</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__PHRASE = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__RESPONSE = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT__ACTION = DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Intent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTENT_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.PhrasesImpl <em>Phrases</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.PhrasesImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getPhrases()
   * @generated
   */
  int PHRASES = 3;

  /**
   * The feature id for the '<em><b>Phrases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASES__PHRASES = 0;

  /**
   * The number of structural features of the '<em>Phrases</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.PhraseValueImpl <em>Phrase Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.PhraseValueImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getPhraseValue()
   * @generated
   */
  int PHRASE_VALUE = 4;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE_VALUE__MAPPING = 0;

  /**
   * The number of structural features of the '<em>Phrase Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHRASE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.MappingImpl <em>Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.MappingImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getMapping()
   * @generated
   */
  int MAPPING = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__VALUE = 0;

  /**
   * The feature id for the '<em><b>Entity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING__ENTITY = 1;

  /**
   * The number of structural features of the '<em>Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAPPING_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.ResponsesImpl <em>Responses</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.ResponsesImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getResponses()
   * @generated
   */
  int RESPONSES = 6;

  /**
   * The feature id for the '<em><b>Responses</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSES__RESPONSES = 0;

  /**
   * The number of structural features of the '<em>Responses</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSES_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.ResponseValueImpl <em>Response Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.ResponseValueImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getResponseValue()
   * @generated
   */
  int RESPONSE_VALUE = 7;

  /**
   * The feature id for the '<em><b>Response</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_VALUE__RESPONSE = 0;

  /**
   * The number of structural features of the '<em>Response Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESPONSE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.ActionsImpl <em>Actions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.ActionsImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getActions()
   * @generated
   */
  int ACTIONS = 8;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIONS__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>Actions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIONS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.ActionValueImpl <em>Action Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.ActionValueImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getActionValue()
   * @generated
   */
  int ACTION_VALUE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_VALUE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_VALUE__TYPE = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_VALUE__VALUE = 2;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_VALUE__LIST = 3;

  /**
   * The number of structural features of the '<em>Action Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_VALUE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__ENTITIES = DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityValueImpl <em>Entity Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityValueImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getEntityValue()
   * @generated
   */
  int ENTITY_VALUE = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_VALUE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Synonyms</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_VALUE__SYNONYMS = 1;

  /**
   * The number of structural features of the '<em>Entity Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.EntitySynonymsImpl <em>Entity Synonyms</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.EntitySynonymsImpl
   * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getEntitySynonyms()
   * @generated
   */
  int ENTITY_SYNONYMS = 12;

  /**
   * The feature id for the '<em><b>Values</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_SYNONYMS__VALUES = 0;

  /**
   * The number of structural features of the '<em>Entity Synonyms</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_SYNONYMS_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem <em>System</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>System</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem
   * @generated
   */
  EClass getDialogFlowSystem();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem#getName()
   * @see #getDialogFlowSystem()
   * @generated
   */
  EAttribute getDialogFlowSystem_Name();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowSystem#getDeclarations()
   * @see #getDialogFlowSystem()
   * @generated
   */
  EReference getDialogFlowSystem_Declarations();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.Declaration <em>Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Declaration</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Declaration
   * @generated
   */
  EClass getDeclaration();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.dialogFlow.Declaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Declaration#getName()
   * @see #getDeclaration()
   * @generated
   */
  EAttribute getDeclaration_Name();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.Intent <em>Intent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intent</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Intent
   * @generated
   */
  EClass getIntent();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.dialogFlow.Intent#getPhrase <em>Phrase</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Phrase</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Intent#getPhrase()
   * @see #getIntent()
   * @generated
   */
  EReference getIntent_Phrase();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.dialogFlow.Intent#getResponse <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Response</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Intent#getResponse()
   * @see #getIntent()
   * @generated
   */
  EReference getIntent_Response();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.dialogFlow.Intent#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Intent#getAction()
   * @see #getIntent()
   * @generated
   */
  EReference getIntent_Action();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.Phrases <em>Phrases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phrases</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Phrases
   * @generated
   */
  EClass getPhrases();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.mdsd.dialogFlow.Phrases#getPhrases <em>Phrases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Phrases</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Phrases#getPhrases()
   * @see #getPhrases()
   * @generated
   */
  EReference getPhrases_Phrases();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.PhraseValue <em>Phrase Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phrase Value</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.PhraseValue
   * @generated
   */
  EClass getPhraseValue();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.mdsd.dialogFlow.PhraseValue#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mapping</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.PhraseValue#getMapping()
   * @see #getPhraseValue()
   * @generated
   */
  EReference getPhraseValue_Mapping();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.Mapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Mapping
   * @generated
   */
  EClass getMapping();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.dialogFlow.Mapping#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Mapping#getValue()
   * @see #getMapping()
   * @generated
   */
  EAttribute getMapping_Value();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.mdsd.dialogFlow.Mapping#getEntity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Entity</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Mapping#getEntity()
   * @see #getMapping()
   * @generated
   */
  EReference getMapping_Entity();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.Responses <em>Responses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Responses</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Responses
   * @generated
   */
  EClass getResponses();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.mdsd.dialogFlow.Responses#getResponses <em>Responses</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Responses</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Responses#getResponses()
   * @see #getResponses()
   * @generated
   */
  EReference getResponses_Responses();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.ResponseValue <em>Response Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Response Value</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.ResponseValue
   * @generated
   */
  EClass getResponseValue();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.dialogFlow.ResponseValue#getResponse <em>Response</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Response</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.ResponseValue#getResponse()
   * @see #getResponseValue()
   * @generated
   */
  EAttribute getResponseValue_Response();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.Actions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actions</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Actions
   * @generated
   */
  EClass getActions();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.mdsd.dialogFlow.Actions#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Actions#getActions()
   * @see #getActions()
   * @generated
   */
  EReference getActions_Actions();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.ActionValue <em>Action Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Value</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.ActionValue
   * @generated
   */
  EClass getActionValue();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.dialogFlow.ActionValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.ActionValue#getName()
   * @see #getActionValue()
   * @generated
   */
  EAttribute getActionValue_Name();

  /**
   * Returns the meta object for the reference '{@link dk.sdu.mmmi.mdsd.dialogFlow.ActionValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.ActionValue#getType()
   * @see #getActionValue()
   * @generated
   */
  EReference getActionValue_Type();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.dialogFlow.ActionValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.ActionValue#getValue()
   * @see #getActionValue()
   * @generated
   */
  EAttribute getActionValue_Value();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.dialogFlow.ActionValue#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.ActionValue#getList()
   * @see #getActionValue()
   * @generated
   */
  EAttribute getActionValue_List();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the containment reference list '{@link dk.sdu.mmmi.mdsd.dialogFlow.Entity#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.Entity#getEntities()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Entities();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.EntityValue <em>Entity Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Value</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.EntityValue
   * @generated
   */
  EClass getEntityValue();

  /**
   * Returns the meta object for the attribute '{@link dk.sdu.mmmi.mdsd.dialogFlow.EntityValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.EntityValue#getValue()
   * @see #getEntityValue()
   * @generated
   */
  EAttribute getEntityValue_Value();

  /**
   * Returns the meta object for the containment reference '{@link dk.sdu.mmmi.mdsd.dialogFlow.EntityValue#getSynonyms <em>Synonyms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Synonyms</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.EntityValue#getSynonyms()
   * @see #getEntityValue()
   * @generated
   */
  EReference getEntityValue_Synonyms();

  /**
   * Returns the meta object for class '{@link dk.sdu.mmmi.mdsd.dialogFlow.EntitySynonyms <em>Entity Synonyms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity Synonyms</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.EntitySynonyms
   * @generated
   */
  EClass getEntitySynonyms();

  /**
   * Returns the meta object for the attribute list '{@link dk.sdu.mmmi.mdsd.dialogFlow.EntitySynonyms#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Values</em>'.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.EntitySynonyms#getValues()
   * @see #getEntitySynonyms()
   * @generated
   */
  EAttribute getEntitySynonyms_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DialogFlowFactory getDialogFlowFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowSystemImpl <em>System</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowSystemImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getDialogFlowSystem()
     * @generated
     */
    EClass DIALOG_FLOW_SYSTEM = eINSTANCE.getDialogFlowSystem();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIALOG_FLOW_SYSTEM__NAME = eINSTANCE.getDialogFlowSystem_Name();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALOG_FLOW_SYSTEM__DECLARATIONS = eINSTANCE.getDialogFlowSystem_Declarations();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.DeclarationImpl <em>Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DeclarationImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getDeclaration()
     * @generated
     */
    EClass DECLARATION = eINSTANCE.getDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECLARATION__NAME = eINSTANCE.getDeclaration_Name();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.IntentImpl <em>Intent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.IntentImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getIntent()
     * @generated
     */
    EClass INTENT = eINSTANCE.getIntent();

    /**
     * The meta object literal for the '<em><b>Phrase</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENT__PHRASE = eINSTANCE.getIntent_Phrase();

    /**
     * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENT__RESPONSE = eINSTANCE.getIntent_Response();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INTENT__ACTION = eINSTANCE.getIntent_Action();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.PhrasesImpl <em>Phrases</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.PhrasesImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getPhrases()
     * @generated
     */
    EClass PHRASES = eINSTANCE.getPhrases();

    /**
     * The meta object literal for the '<em><b>Phrases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PHRASES__PHRASES = eINSTANCE.getPhrases_Phrases();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.PhraseValueImpl <em>Phrase Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.PhraseValueImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getPhraseValue()
     * @generated
     */
    EClass PHRASE_VALUE = eINSTANCE.getPhraseValue();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PHRASE_VALUE__MAPPING = eINSTANCE.getPhraseValue_Mapping();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.MappingImpl <em>Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.MappingImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getMapping()
     * @generated
     */
    EClass MAPPING = eINSTANCE.getMapping();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAPPING__VALUE = eINSTANCE.getMapping_Value();

    /**
     * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAPPING__ENTITY = eINSTANCE.getMapping_Entity();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.ResponsesImpl <em>Responses</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.ResponsesImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getResponses()
     * @generated
     */
    EClass RESPONSES = eINSTANCE.getResponses();

    /**
     * The meta object literal for the '<em><b>Responses</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESPONSES__RESPONSES = eINSTANCE.getResponses_Responses();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.ResponseValueImpl <em>Response Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.ResponseValueImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getResponseValue()
     * @generated
     */
    EClass RESPONSE_VALUE = eINSTANCE.getResponseValue();

    /**
     * The meta object literal for the '<em><b>Response</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RESPONSE_VALUE__RESPONSE = eINSTANCE.getResponseValue_Response();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.ActionsImpl <em>Actions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.ActionsImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getActions()
     * @generated
     */
    EClass ACTIONS = eINSTANCE.getActions();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIONS__ACTIONS = eINSTANCE.getActions_Actions();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.ActionValueImpl <em>Action Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.ActionValueImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getActionValue()
     * @generated
     */
    EClass ACTION_VALUE = eINSTANCE.getActionValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_VALUE__NAME = eINSTANCE.getActionValue_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_VALUE__TYPE = eINSTANCE.getActionValue_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_VALUE__VALUE = eINSTANCE.getActionValue_Value();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION_VALUE__LIST = eINSTANCE.getActionValue_List();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__ENTITIES = eINSTANCE.getEntity_Entities();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityValueImpl <em>Entity Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.EntityValueImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getEntityValue()
     * @generated
     */
    EClass ENTITY_VALUE = eINSTANCE.getEntityValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_VALUE__VALUE = eINSTANCE.getEntityValue_Value();

    /**
     * The meta object literal for the '<em><b>Synonyms</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY_VALUE__SYNONYMS = eINSTANCE.getEntityValue_Synonyms();

    /**
     * The meta object literal for the '{@link dk.sdu.mmmi.mdsd.dialogFlow.impl.EntitySynonymsImpl <em>Entity Synonyms</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.EntitySynonymsImpl
     * @see dk.sdu.mmmi.mdsd.dialogFlow.impl.DialogFlowPackageImpl#getEntitySynonyms()
     * @generated
     */
    EClass ENTITY_SYNONYMS = eINSTANCE.getEntitySynonyms();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY_SYNONYMS__VALUES = eINSTANCE.getEntitySynonyms_Values();

  }

} //DialogFlowPackage