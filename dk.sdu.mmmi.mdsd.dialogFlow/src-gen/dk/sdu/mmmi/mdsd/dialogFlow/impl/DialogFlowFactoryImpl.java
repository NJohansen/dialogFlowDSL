/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.dialogFlow.impl;

import dk.sdu.mmmi.mdsd.dialogFlow.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DialogFlowFactoryImpl extends EFactoryImpl implements DialogFlowFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DialogFlowFactory init()
  {
    try
    {
      DialogFlowFactory theDialogFlowFactory = (DialogFlowFactory)EPackage.Registry.INSTANCE.getEFactory(DialogFlowPackage.eNS_URI);
      if (theDialogFlowFactory != null)
      {
        return theDialogFlowFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DialogFlowFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DialogFlowFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DialogFlowPackage.DIALOG_FLOW_SYSTEM: return createDialogFlowSystem();
      case DialogFlowPackage.DECLARATION: return createDeclaration();
      case DialogFlowPackage.INTENT: return createIntent();
      case DialogFlowPackage.PHRASES: return createPhrases();
      case DialogFlowPackage.PHRASE_VALUE: return createPhraseValue();
      case DialogFlowPackage.MAPPING: return createMapping();
      case DialogFlowPackage.RESPONSES: return createResponses();
      case DialogFlowPackage.RESPONSE_VALUE: return createResponseValue();
      case DialogFlowPackage.ACTIONS: return createActions();
      case DialogFlowPackage.ACTION_VALUE: return createActionValue();
      case DialogFlowPackage.ENTITY: return createEntity();
      case DialogFlowPackage.ENTITY_VALUE: return createEntityValue();
      case DialogFlowPackage.ENTITY_SYNONYMS: return createEntitySynonyms();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DialogFlowSystem createDialogFlowSystem()
  {
    DialogFlowSystemImpl dialogFlowSystem = new DialogFlowSystemImpl();
    return dialogFlowSystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Declaration createDeclaration()
  {
    DeclarationImpl declaration = new DeclarationImpl();
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Intent createIntent()
  {
    IntentImpl intent = new IntentImpl();
    return intent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Phrases createPhrases()
  {
    PhrasesImpl phrases = new PhrasesImpl();
    return phrases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PhraseValue createPhraseValue()
  {
    PhraseValueImpl phraseValue = new PhraseValueImpl();
    return phraseValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mapping createMapping()
  {
    MappingImpl mapping = new MappingImpl();
    return mapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Responses createResponses()
  {
    ResponsesImpl responses = new ResponsesImpl();
    return responses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ResponseValue createResponseValue()
  {
    ResponseValueImpl responseValue = new ResponseValueImpl();
    return responseValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Actions createActions()
  {
    ActionsImpl actions = new ActionsImpl();
    return actions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionValue createActionValue()
  {
    ActionValueImpl actionValue = new ActionValueImpl();
    return actionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntityValue createEntityValue()
  {
    EntityValueImpl entityValue = new EntityValueImpl();
    return entityValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntitySynonyms createEntitySynonyms()
  {
    EntitySynonymsImpl entitySynonyms = new EntitySynonymsImpl();
    return entitySynonyms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DialogFlowPackage getDialogFlowPackage()
  {
    return (DialogFlowPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DialogFlowPackage getPackage()
  {
    return DialogFlowPackage.eINSTANCE;
  }

} //DialogFlowFactoryImpl