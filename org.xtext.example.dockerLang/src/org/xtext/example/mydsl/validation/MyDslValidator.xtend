package org.xtext.example.mydsl.validation
import org.eclipse.xtext.validation.Check

import org.xtext.example.mydsl.myDsl.Dockerfile

class MyDslValidator extends AbstractMyDslValidator {
	
	public static val MISSING_FROM_STATEMENT = 'MISSING_FROM_STATEMENT'
	public static val REDUNDANT_FROM_STATEMENT= "REDUNDANT_FROM_STATEMENT"

	@Check
	def checkFirstStatement(Dockerfile dockerfile) {
		var firstStatement = dockerfile.getStatements().get(0).getStatement()
		if (!firstStatement.getKey().equals('FROM ')) {
    		warning('Missing FROM statement!', null, MISSING_FROM_STATEMENT)
		}
	}
	
	@Check
	def checkLastStatement(Dockerfile dockerfile) {
		var lastStatement = dockerfile.getStatements().get(dockerfile.getStatements().size-1).getStatement()
		if (lastStatement.getKey().equals('FROM ')) {
    		warning('Redundant FROM statement!', null, MISSING_FROM_STATEMENT)
		}
	}
	
}
 