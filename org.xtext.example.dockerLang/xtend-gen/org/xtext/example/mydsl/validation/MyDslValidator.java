package org.xtext.example.mydsl.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl.Dockerfile;
import org.xtext.example.mydsl.myDsl.Instruction;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.validation.AbstractMyDslValidator;

@SuppressWarnings("all")
public class MyDslValidator extends AbstractMyDslValidator {
  public static final String MISSING_FROM_STATEMENT = "MISSING_FROM_STATEMENT";
  
  public static final String REDUNDANT_FROM_STATEMENT = "REDUNDANT_FROM_STATEMENT";
  
  @Check
  public void checkFirstStatement(final Dockerfile dockerfile) {
    Statement firstStatement = dockerfile.getStatements().get(0).getStatement();
    boolean _equals = firstStatement.getKey().equals("FROM ");
    boolean _not = (!_equals);
    if (_not) {
      this.warning("Missing FROM statement!", null, MyDslValidator.MISSING_FROM_STATEMENT);
    }
  }
  
  @Check
  public void checkLastStatement(final Dockerfile dockerfile) {
    EList<Instruction> _statements = dockerfile.getStatements();
    int _size = dockerfile.getStatements().size();
    int _minus = (_size - 1);
    Statement lastStatement = _statements.get(_minus).getStatement();
    boolean _equals = lastStatement.getKey().equals("FROM ");
    if (_equals) {
      this.warning("Redundant FROM statement!", null, MyDslValidator.MISSING_FROM_STATEMENT);
    }
  }
}
