/**
 * generated by Xtext 2.20.0
 */
package org.xtext.example.mydsl.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dockerfile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Dockerfile#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Dockerfile#getComments <em>Comments</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDockerfile()
 * @model
 * @generated
 */
public interface Dockerfile extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.myDsl.Instruction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDockerfile_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getStatements();

  /**
   * Returns the value of the '<em><b>Comments</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' attribute list.
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getDockerfile_Comments()
   * @model unique="false"
   * @generated
   */
  EList<String> getComments();

} // Dockerfile
