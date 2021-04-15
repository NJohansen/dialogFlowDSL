/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.dialogFlow;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.dialogFlow.Entity#getEntities <em>Entities</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends Declaration
{
  /**
   * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
   * The list contents are of type {@link dk.sdu.mmmi.mdsd.dialogFlow.EntityValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Entities</em>' containment reference list.
   * @see dk.sdu.mmmi.mdsd.dialogFlow.DialogFlowPackage#getEntity_Entities()
   * @model containment="true"
   * @generated
   */
  EList<EntityValue> getEntities();

} // Entity