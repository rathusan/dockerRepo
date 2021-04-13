/**
 * generated by Xtext 2.20.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MyDslPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MyDslPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MyDslPackage.DOCKERFILE:
      {
        Dockerfile dockerfile = (Dockerfile)theEObject;
        T result = caseDockerfile(dockerfile);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.FROM:
      {
        From from = (From)theEObject;
        T result = caseFrom(from);
        if (result == null) result = caseStatement(from);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.CMD:
      {
        Cmd cmd = (Cmd)theEObject;
        T result = caseCmd(cmd);
        if (result == null) result = caseStatement(cmd);
        if (result == null) result = caseEntrypoint(cmd);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.ENTRYPOINT:
      {
        Entrypoint entrypoint = (Entrypoint)theEObject;
        T result = caseEntrypoint(entrypoint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.VOLUME:
      {
        Volume volume = (Volume)theEObject;
        T result = caseVolume(volume);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.MAINTAINER:
      {
        Maintainer maintainer = (Maintainer)theEObject;
        T result = caseMaintainer(maintainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXPOSE:
      {
        Expose expose = (Expose)theEObject;
        T result = caseExpose(expose);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.WORKDIR:
      {
        Workdir workdir = (Workdir)theEObject;
        T result = caseWorkdir(workdir);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MyDslPackage.EXEC_FORM:
      {
        EXEC_FORM exeC_FORM = (EXEC_FORM)theEObject;
        T result = caseEXEC_FORM(exeC_FORM);
        if (result == null) result = caseCmd(exeC_FORM);
        if (result == null) result = caseVolume(exeC_FORM);
        if (result == null) result = caseStatement(exeC_FORM);
        if (result == null) result = caseEntrypoint(exeC_FORM);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dockerfile</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dockerfile</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDockerfile(Dockerfile object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>From</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>From</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFrom(From object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cmd</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cmd</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCmd(Cmd object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Entrypoint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Entrypoint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEntrypoint(Entrypoint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVolume(Volume object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Maintainer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Maintainer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMaintainer(Maintainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expose</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expose</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpose(Expose object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Workdir</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Workdir</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWorkdir(Workdir object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EXEC FORM</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EXEC FORM</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEXEC_FORM(EXEC_FORM object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MyDslSwitch
