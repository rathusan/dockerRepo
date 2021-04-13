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
import org.xtext.example.mydsl.myDsl.Cmd;
import org.xtext.example.mydsl.myDsl.Dockerfile;
import org.xtext.example.mydsl.myDsl.EXEC_FORM;
import org.xtext.example.mydsl.myDsl.Expose;
import org.xtext.example.mydsl.myDsl.From;
import org.xtext.example.mydsl.myDsl.Maintainer;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.Volume;
import org.xtext.example.mydsl.myDsl.Workdir;
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
			case MyDslPackage.CMD:
				sequence_Cmd_Entrypoint(context, (Cmd) semanticObject); 
				return; 
			case MyDslPackage.DOCKERFILE:
				sequence_Dockerfile(context, (Dockerfile) semanticObject); 
				return; 
			case MyDslPackage.EXEC_FORM:
				sequence_EXEC_FORM(context, (EXEC_FORM) semanticObject); 
				return; 
			case MyDslPackage.EXPOSE:
				sequence_Expose(context, (Expose) semanticObject); 
				return; 
			case MyDslPackage.FROM:
				sequence_From(context, (From) semanticObject); 
				return; 
			case MyDslPackage.MAINTAINER:
				sequence_Maintainer(context, (Maintainer) semanticObject); 
				return; 
			case MyDslPackage.VOLUME:
				sequence_Volume(context, (Volume) semanticObject); 
				return; 
			case MyDslPackage.WORKDIR:
				sequence_Workdir(context, (Workdir) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns Cmd
	 *     Cmd returns Cmd
	 *     Entrypoint returns Cmd
	 *
	 * Constraint:
	 *     {Cmd}
	 */
	protected void sequence_Cmd_Entrypoint(ISerializationContext context, Cmd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dockerfile returns Dockerfile
	 *
	 * Constraint:
	 *     statements+=Statement+
	 */
	protected void sequence_Dockerfile(ISerializationContext context, Dockerfile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns EXEC_FORM
	 *     Cmd returns EXEC_FORM
	 *     Entrypoint returns EXEC_FORM
	 *     Volume returns EXEC_FORM
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
	 *     Expose returns Expose
	 *
	 * Constraint:
	 *     ports=SHELL_FORM
	 */
	protected void sequence_Expose(ISerializationContext context, Expose semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.EXPOSE__PORTS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.EXPOSE__PORTS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExposeAccess().getPortsSHELL_FORMParserRuleCall_1_0(), semanticObject.getPorts());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns From
	 *     From returns From
	 *
	 * Constraint:
	 *     (platform_option=PLATFORM_OPTION? name=IMAGE_NAME (tag_or_digest=IMAGE_TAG | tag_or_digest=IMAGE_DIGEST)?)
	 */
	protected void sequence_From(ISerializationContext context, From semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Maintainer returns Maintainer
	 *
	 * Constraint:
	 *     name=SHELL_FORM
	 */
	protected void sequence_Maintainer(ISerializationContext context, Maintainer semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.MAINTAINER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.MAINTAINER__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMaintainerAccess().getNameSHELL_FORMParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Volume returns Volume
	 *
	 * Constraint:
	 *     {Volume}
	 */
	protected void sequence_Volume(ISerializationContext context, Volume semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Workdir returns Workdir
	 *
	 * Constraint:
	 *     path=SHELL_FORM
	 */
	protected void sequence_Workdir(ISerializationContext context, Workdir semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.WORKDIR__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.WORKDIR__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getWorkdirAccess().getPathSHELL_FORMParserRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
}
