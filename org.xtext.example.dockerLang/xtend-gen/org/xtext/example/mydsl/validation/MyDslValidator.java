package org.xtext.example.mydsl.validation;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl.Dockerfile;
import org.xtext.example.mydsl.myDsl.Instruction;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.validation.AbstractMyDslValidator;

@SuppressWarnings("all")
public class MyDslValidator extends AbstractMyDslValidator {
  public static final String MISSING_FROM_STATEMENT = "MISSING_FROM_STATEMENT";
  
  public static final String REDUNDANT_FROM_STATEMENT = "REDUNDANT_FROM_STATEMENT";
  
  public static final String MISSING_IMAGE_TAG = "MISSING_IMAGE_TAG";
  
  public static final String TOO_MANY_CMD_STATEMENTS = "TOO_MANY_CMD_STATEMENTS";
  
  public static final String Too_MANY_ENTRYPOINT_STATEMENTS = "TOO_MANY_ENTRYPOINT_STATEMENTS";
  
  public static final String ONBUILD_FROM_STATEMENT = "ONBUILD_FROM_STATEMENT";
  
  public static final String ONBUILD_MAINTAINER_STATEMENT = "ONBUILD_MAINTAINER_STATEMENT";
  
  public static final String ONBUILD_ONBUILD_STATEMENT = "ONBUILD_ONBUILD_STATEMENT";
  
  @Check
  public void checkFirstStatement(final Dockerfile dockerfile) {
    Statement firstStatement = dockerfile.getStatements().get(0).getStatement();
    boolean _equals = firstStatement.getKey().equals("FROM ");
    boolean _not = (!_equals);
    if (_not) {
      this.warning("Missing FROM statement!", MyDslPackage.Literals.DOCKERFILE__STATEMENTS, MyDslValidator.MISSING_FROM_STATEMENT);
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
  
  @Check
  public void checkFromStatementImage(final Statement statement) {
    boolean _equals = statement.getKey().equals("FROM ");
    if (_equals) {
      String tagOrDigest = statement.getTag_or_digest();
      if ((tagOrDigest == null)) {
        this.warning("Image names should include a tag", null, MyDslValidator.MISSING_IMAGE_TAG);
      }
    }
  }
  
  @Check
  public void checkNumberOfCmdStatements(final Dockerfile dockerfile) {
    int numberOfCmdStatements = 0;
    for (int i = 0; (i < dockerfile.getStatements().size()); i++) {
      {
        Statement statement = dockerfile.getStatements().get(i).getStatement();
        boolean _equals = statement.getKey().equals("CMD");
        if (_equals) {
          int _numberOfCmdStatements = numberOfCmdStatements;
          numberOfCmdStatements = (_numberOfCmdStatements + 1);
          if ((numberOfCmdStatements > 1)) {
            this.warning("A dockerfile should only contain one CMD statement!", null, MyDslValidator.TOO_MANY_CMD_STATEMENTS);
          }
        }
      }
    }
  }
  
  @Check
  public void checkNumberOfEntrypointStatements(final Dockerfile dockerfile) {
    int numberOfEntrypointStatements = 0;
    for (int i = 0; (i < dockerfile.getStatements().size()); i++) {
      {
        Statement statement = dockerfile.getStatements().get(i).getStatement();
        boolean _equals = statement.getKey().equals("ENTRYPOINT");
        if (_equals) {
          int _numberOfEntrypointStatements = numberOfEntrypointStatements;
          numberOfEntrypointStatements = (_numberOfEntrypointStatements + 1);
          if ((numberOfEntrypointStatements > 1)) {
            this.warning("A dockerfile should only contain one ENTRYPOINT statement!", null, MyDslValidator.Too_MANY_ENTRYPOINT_STATEMENTS);
          }
        }
      }
    }
  }
  
  @Check
  public void checkOnbuildInstruction(final Statement statement) {
    String _key = statement.getKey();
    boolean _equals = Objects.equal(_key, "ONBUILD ");
    if (_equals) {
      Statement onbuildInstruction = statement.getStatement().getStatement();
      boolean _equals_1 = onbuildInstruction.getKey().equals("FROM ");
      if (_equals_1) {
        this.warning("An ONBUILD statement cannot contain a FROM statement", null, MyDslValidator.ONBUILD_FROM_STATEMENT);
      }
      boolean _equals_2 = onbuildInstruction.getKey().equals("MAINTAINER");
      if (_equals_2) {
        this.warning("An ONBUILD statement cannot contain a MAINTAINER statement", null, MyDslValidator.ONBUILD_MAINTAINER_STATEMENT);
      }
      boolean _equals_3 = onbuildInstruction.getKey().equals("ONBUILD ");
      if (_equals_3) {
        this.warning("An ONBUILD statement cannot contain an ONBUILD statement", null, MyDslValidator.ONBUILD_ONBUILD_STATEMENT);
      }
    }
  }
}
