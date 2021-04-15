package org.xtext.example.mydsl.validation
import org.eclipse.xtext.validation.Check

import org.xtext.example.mydsl.myDsl.Dockerfile
import org.xtext.example.mydsl.myDsl.MyDslPackage
import org.xtext.example.mydsl.myDsl.Statement

class MyDslValidator extends AbstractMyDslValidator {
	
	public static val MISSING_FROM_STATEMENT = 'MISSING_FROM_STATEMENT'
	public static val REDUNDANT_FROM_STATEMENT= "REDUNDANT_FROM_STATEMENT"
	public static val MISSING_IMAGE_TAG = "MISSING_IMAGE_TAG"
	public static val TOO_MANY_CMD_STATEMENTS = "TOO_MANY_CMD_STATEMENTS"
	public static val Too_MANY_ENTRYPOINT_STATEMENTS = "TOO_MANY_ENTRYPOINT_STATEMENTS"
	public static val ONBUILD_FROM_STATEMENT = "ONBUILD_FROM_STATEMENT"
	public static val ONBUILD_MAINTAINER_STATEMENT = "ONBUILD_MAINTAINER_STATEMENT"
	public static val ONBUILD_ONBUILD_STATEMENT = "ONBUILD_ONBUILD_STATEMENT"

	@Check
	def checkFirstStatement(Dockerfile dockerfile) {
		var firstStatement = dockerfile.getStatements().get(0).getStatement()
		if (!firstStatement.getKey().equals('FROM ')) {
    		warning('Missing FROM statement!', MyDslPackage.Literals.DOCKERFILE__STATEMENTS, MISSING_FROM_STATEMENT)
		}
	}
	
	@Check
	def checkLastStatement(Dockerfile dockerfile) {
		var lastStatement = dockerfile.getStatements().get(dockerfile.getStatements().size-1).getStatement()
		if (lastStatement.getKey().equals('FROM ')) {
    		warning('Redundant FROM statement!', null, MISSING_FROM_STATEMENT)
		}
	}
	
	@Check
	def checkFromStatementImage(Statement statement) {
		if (statement.getKey().equals('FROM ')) {
			var tagOrDigest = statement.getTag_or_digest()
			if (tagOrDigest === (null)) {
				warning('Image names should include a tag', null, MISSING_IMAGE_TAG)
			}
		}
	}
	
	@Check
	def checkNumberOfCmdStatements(Dockerfile dockerfile) {
		var numberOfCmdStatements = 0
		for (var i = 0 ; i < dockerfile.getStatements().size; i++) {
			var statement = dockerfile.getStatements().get(i).getStatement()
			if (statement.getKey().equals('CMD')) {
				numberOfCmdStatements += 1
				if (numberOfCmdStatements > 1) {
					warning('A dockerfile should only contain one CMD statement!', null, TOO_MANY_CMD_STATEMENTS)
				}
			}
		}
	}
	
	@Check
	def checkNumberOfEntrypointStatements(Dockerfile dockerfile) {
		var numberOfEntrypointStatements = 0
		for (var i = 0 ; i < dockerfile.getStatements().size; i++) {
			var statement = dockerfile.getStatements().get(i).getStatement()
			if (statement.getKey().equals('ENTRYPOINT')) {
				numberOfEntrypointStatements += 1
				if (numberOfEntrypointStatements > 1) {
					warning('A dockerfile should only contain one ENTRYPOINT statement!', null, Too_MANY_ENTRYPOINT_STATEMENTS)
				}
			}
		}
	}
	 
	@Check
	def checkOnbuildInstruction(Statement statement) {
		if (statement.getKey() == 'ONBUILD ') {
			var onbuildInstruction = statement.getStatement().getStatement
			if (onbuildInstruction.getKey.equals('FROM ')) {
				warning('An ONBUILD statement cannot contain a FROM statement', null, ONBUILD_FROM_STATEMENT)
			}
			if (onbuildInstruction.getKey.equals('MAINTAINER')) {
				warning('An ONBUILD statement cannot contain a MAINTAINER statement', null, ONBUILD_MAINTAINER_STATEMENT)
			}
			if (onbuildInstruction.getKey.equals('ONBUILD ')) {
				warning('An ONBUILD statement cannot contain an ONBUILD statement', null, ONBUILD_ONBUILD_STATEMENT)
			}
		} 
	}
	
	
}