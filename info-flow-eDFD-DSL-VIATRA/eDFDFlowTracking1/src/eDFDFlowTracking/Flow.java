/**
 */
package eDFDFlowTracking;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eDFDFlowTracking.Flow#getChannel <em>Channel</em>}</li>
 *   <li>{@link eDFDFlowTracking.Flow#getTarget <em>Target</em>}</li>
 *   <li>{@link eDFDFlowTracking.Flow#getSource <em>Source</em>}</li>
 *   <li>{@link eDFDFlowTracking.Flow#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see eDFDFlowTracking.EDFDFlowTracking1Package#getFlow()
 * @model
 * @generated
 */
public interface Flow extends Element {
	/**
	 * Returns the value of the '<em><b>Channel</b></em>' attribute.
	 * The literals are from the enumeration {@link eDFDFlowTracking.Channel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' attribute.
	 * @see eDFDFlowTracking.Channel
	 * @see #setChannel(Channel)
	 * @see eDFDFlowTracking.EDFDFlowTracking1Package#getFlow_Channel()
	 * @model
	 * @generated
	 */
	Channel getChannel();

	/**
	 * Sets the value of the '{@link eDFDFlowTracking.Flow#getChannel <em>Channel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' attribute.
	 * @see eDFDFlowTracking.Channel
	 * @see #getChannel()
	 * @generated
	 */
	void setChannel(Channel value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference list.
	 * The list contents are of type {@link eDFDFlowTracking.Element}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference list.
	 * @see eDFDFlowTracking.EDFDFlowTracking1Package#getFlow_Target()
	 * @model
	 * @generated
	 */
	EList<Element> getTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Element)
	 * @see eDFDFlowTracking.EDFDFlowTracking1Package#getFlow_Source()
	 * @model
	 * @generated
	 */
	Element getSource();

	/**
	 * Sets the value of the '{@link eDFDFlowTracking.Flow#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Element value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(int)
	 * @see eDFDFlowTracking.EDFDFlowTracking1Package#getFlow_Label()
	 * @model
	 * @generated
	 */
	int getLabel();

	/**
	 * Sets the value of the '{@link eDFDFlowTracking.Flow#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(int value);

} // Flow
