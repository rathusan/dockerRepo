package org.xtext.example.mydsl.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.xtext.example.mydsl.myDsl.Dockerfile;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.validation.AbstractMyDslValidator;

@SuppressWarnings("all")
public class MyDslValidatorXtend extends AbstractMyDslValidator {
  private String tempString;
  
  private EList statementList;
  
  private String fromString;
  
  public static final String INVALID_FIRST_STATEMENT = "org.xtext.example.mydsl.INVALID_FIRST_STATEMENT";
  
  @Check
  public void checkFROM(final Dockerfile tempFile, final Statement statement) {
    this.statementList = tempFile.getStatements();
    this.fromString = this.statementList.get(0).toString().substring(0, 3);
    System.out.println(this.fromString);
    System.out.println("ha");
    InputOutput.<String>println("Hello World");
    boolean _equals = this.fromString.equals("FROM");
    boolean _not = (!_equals);
    if (_not) {
      this.warning("The first statement should be a FROM command", MyDslPackage.Literals.DOCKERFILE__STATEMENTS, MyDslValidatorXtend.INVALID_FIRST_STATEMENT);
    }
  }
}
