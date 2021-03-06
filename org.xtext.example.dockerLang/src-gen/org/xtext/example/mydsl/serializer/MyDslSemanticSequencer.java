/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.example.mydsl.myDsl.Dockerfile;
import org.xtext.example.mydsl.myDsl.EXEC_FORM;
import org.xtext.example.mydsl.myDsl.Instruction;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.DOCKERFILE:
				sequence_Dockerfile(context, (Dockerfile) semanticObject); 
				return; 
			case MyDslPackage.EXEC_FORM:
				sequence_EXEC_FORM(context, (EXEC_FORM) semanticObject); 
				return; 
			case MyDslPackage.INSTRUCTION:
				sequence_Instruction(context, (Instruction) semanticObject); 
				return; 
			case MyDslPackage.STATEMENT:
				if (rule == grammarAccess.getAddRule()) {
					sequence_Add(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getCmdRule()) {
					sequence_Cmd(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getCopyRule()) {
					sequence_Copy(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getEntrypointRule()) {
					sequence_Entrypoint(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getEnvRule()) {
					sequence_Env(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getExposeRule()) {
					sequence_Expose(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getFromRule()) {
					sequence_From(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getLabelRule()) {
					sequence_Label(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getMaintainerRule()) {
					sequence_Maintainer(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getOnbuildRule()) {
					sequence_Onbuild(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getRunRule()) {
					sequence_Run(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getVolumeRule()) {
					sequence_Volume(context, (Statement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getWorkdirRule()) {
					sequence_Workdir(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Add returns Statement
	 *
	 * Constraint:
	 *     (key='ADD ' chown_options=CHOWN_OPTION? file=ID directory=SHELL_CMD)
	 */
	protected void sequence_Add(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Cmd returns Statement
	 *
	 * Constraint:
	 *     (key='CMD' (exec_form=EXEC_FORM | shell_form=SHELL_CMD))
	 */
	protected void sequence_Cmd(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Copy returns Statement
	 *
	 * Constraint:
	 *     (key='COPY ' chown_options=CHOWN_OPTION? file=ID directory=SHELL_CMD)
	 */
	protected void sequence_Copy(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dockerfile returns Dockerfile
	 *
	 * Constraint:
	 *     (statements+=Instruction | comments+=COMMENT)+
	 */
	protected void sequence_Dockerfile(ISerializationContext context, Dockerfile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EXEC_FORM returns EXEC_FORM
	 *
	 * Constraint:
	 *     (executable=STRING parameters+=EXEC_FORM_PARAMETER*)
	 */
	protected void sequence_EXEC_FORM(ISerializationContext context, EXEC_FORM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entrypoint returns Statement
	 *
	 * Constraint:
	 *     (key='ENTRYPOINT' (exec_form=EXEC_FORM | shell_form=SHELL_CMD))
	 */
	protected void sequence_Entrypoint(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Env returns Statement
	 *
	 * Constraint:
	 *     (key='ENV ' key_value_pairs+=KV_PAIR_EQUALS+)
	 */
	protected void sequence_Env(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expose returns Statement
	 *
	 * Constraint:
	 *     (key='EXPOSE' ports=SHELL_CMD)
	 */
	protected void sequence_Expose(ISerializationContext context, Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATEMENT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATEMENT__KEY));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATEMENT__PORTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATEMENT__PORTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExposeAccess().getKeyEXPOSEKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getExposeAccess().getPortsSHELL_CMDTerminalRuleCall_1_0(), semanticObject.getPorts());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     From returns Statement
	 *
	 * Constraint:
	 *     (key='FROM ' platform_option=PLATFORM_OPTION? name=IMAGE_NAME (tag_or_digest=IMAGE_TAG | tag_or_digest=IMAGE_DIGEST)?)
	 */
	protected void sequence_From(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Instruction returns Instruction
	 *
	 * Constraint:
	 *     (
	 *         statement=From | 
	 *         statement=Cmd | 
	 *         statement=Entrypoint | 
	 *         statement=Volume | 
	 *         statement=Maintainer | 
	 *         statement=Expose | 
	 *         statement=Workdir | 
	 *         statement=Run | 
	 *         statement=Env | 
	 *         statement=Label | 
	 *         statement=Add | 
	 *         statement=Copy | 
	 *         statement=Onbuild
	 *     )
	 */
	protected void sequence_Instruction(ISerializationContext context, Instruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Label returns Statement
	 *
	 * Constraint:
	 *     (key='LABEL ' key_value_pairs+=KV_PAIR_EQUALS+)
	 */
	protected void sequence_Label(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Maintainer returns Statement
	 *
	 * Constraint:
	 *     (key='MAINTAINER' name=SHELL_CMD)
	 */
	protected void sequence_Maintainer(ISerializationContext context, Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATEMENT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATEMENT__KEY));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMaintainerAccess().getKeyMAINTAINERKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getMaintainerAccess().getNameSHELL_CMDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Onbuild returns Statement
	 *
	 * Constraint:
	 *     (key='ONBUILD ' statement=Instruction)
	 */
	protected void sequence_Onbuild(ISerializationContext context, Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATEMENT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATEMENT__KEY));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATEMENT__STATEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATEMENT__STATEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOnbuildAccess().getKeyONBUILDKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getOnbuildAccess().getStatementInstructionParserRuleCall_1_0(), semanticObject.getStatement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Run returns Statement
	 *
	 * Constraint:
	 *     (key='RUN' (exec_form=EXEC_FORM | shell_form=SHELL_CMD))
	 */
	protected void sequence_Run(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Volume returns Statement
	 *
	 * Constraint:
	 *     (key='VOLUME' (exec_form=EXEC_FORM | shell_form=SHELL_CMD))
	 */
	protected void sequence_Volume(ISerializationContext context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Workdir returns Statement
	 *
	 * Constraint:
	 *     (key='WORKDIR' path=SHELL_CMD)
	 */
	protected void sequence_Workdir(ISerializationContext context, Statement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATEMENT__KEY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATEMENT__KEY));
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.STATEMENT__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.STATEMENT__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWorkdirAccess().getKeyWORKDIRKeyword_0_0(), semanticObject.getKey());
		feeder.accept(grammarAccess.getWorkdirAccess().getPathSHELL_CMDTerminalRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
}
