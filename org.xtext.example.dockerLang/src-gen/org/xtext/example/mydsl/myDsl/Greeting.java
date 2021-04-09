/**
 * generated by Xtext 2.20.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Greeting</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Greeting#getGreeting <em>Greeting</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Greeting#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreeting()
 * @model
 * @generated
 */
public interface Greeting extends EObject
{
  /**
   * Returns the value of the '<em><b>Greeting</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.myDsl.TypeOfGreeting}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greeting</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.TypeOfGreeting
   * @see #setGreeting(TypeOfGreeting)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreeting_Greeting()
   * @model
   * @generated
   */
  TypeOfGreeting getGreeting();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Greeting#getGreeting <em>Greeting</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Greeting</em>' attribute.
   * @see org.xtext.example.mydsl.myDsl.TypeOfGreeting
   * @see #getGreeting()
   * @generated
   */
  void setGreeting(TypeOfGreeting value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getGreeting_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Greeting#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // Greeting
