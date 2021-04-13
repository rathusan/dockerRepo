/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getStatementAccess().getAlternatives(), "rule__Statement__Alternatives");
			builder.put(grammarAccess.getFromAccess().getTag_or_digestAlternatives_3_0(), "rule__From__Tag_or_digestAlternatives_3_0");
			builder.put(grammarAccess.getCmdAccess().getAlternatives_1(), "rule__Cmd__Alternatives_1");
			builder.put(grammarAccess.getEntrypointAccess().getAlternatives_1(), "rule__Entrypoint__Alternatives_1");
			builder.put(grammarAccess.getVolumeAccess().getAlternatives_1(), "rule__Volume__Alternatives_1");
			builder.put(grammarAccess.getIMAGE_TAGAccess().getAlternatives_1(), "rule__IMAGE_TAG__Alternatives_1");
			builder.put(grammarAccess.getIMAGE_TAGAccess().getAlternatives_2(), "rule__IMAGE_TAG__Alternatives_2");
			builder.put(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_1(), "rule__IMAGE_DIGEST__Alternatives_1");
			builder.put(grammarAccess.getIMAGE_DIGESTAccess().getAlternatives_2(), "rule__IMAGE_DIGEST__Alternatives_2");
			builder.put(grammarAccess.getFromAccess().getGroup(), "rule__From__Group__0");
			builder.put(grammarAccess.getCmdAccess().getGroup(), "rule__Cmd__Group__0");
			builder.put(grammarAccess.getCmdAccess().getGroup_1_1(), "rule__Cmd__Group_1_1__0");
			builder.put(grammarAccess.getEntrypointAccess().getGroup(), "rule__Entrypoint__Group__0");
			builder.put(grammarAccess.getEntrypointAccess().getGroup_1_1(), "rule__Entrypoint__Group_1_1__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup(), "rule__Volume__Group__0");
			builder.put(grammarAccess.getVolumeAccess().getGroup_1_1(), "rule__Volume__Group_1_1__0");
			builder.put(grammarAccess.getMaintainerAccess().getGroup(), "rule__Maintainer__Group__0");
			builder.put(grammarAccess.getExposeAccess().getGroup(), "rule__Expose__Group__0");
			builder.put(grammarAccess.getWorkdirAccess().getGroup(), "rule__Workdir__Group__0");
			builder.put(grammarAccess.getIMAGE_NAMEAccess().getGroup(), "rule__IMAGE_NAME__Group__0");
			builder.put(grammarAccess.getIMAGE_NAMEAccess().getGroup_1(), "rule__IMAGE_NAME__Group_1__0");
			builder.put(grammarAccess.getIMAGE_TAGAccess().getGroup(), "rule__IMAGE_TAG__Group__0");
			builder.put(grammarAccess.getIMAGE_DIGESTAccess().getGroup(), "rule__IMAGE_DIGEST__Group__0");
			builder.put(grammarAccess.getPLATFORM_OPTIONAccess().getGroup(), "rule__PLATFORM_OPTION__Group__0");
			builder.put(grammarAccess.getEXEC_FORMAccess().getGroup(), "rule__EXEC_FORM__Group__0");
			builder.put(grammarAccess.getSHELL_FORMAccess().getGroup(), "rule__SHELL_FORM__Group__0");
			builder.put(grammarAccess.getSHELL_FORMAccess().getGroup_1(), "rule__SHELL_FORM__Group_1__0");
			builder.put(grammarAccess.getDockerfileAccess().getStatementsAssignment(), "rule__Dockerfile__StatementsAssignment");
			builder.put(grammarAccess.getFromAccess().getPlatform_optionAssignment_1(), "rule__From__Platform_optionAssignment_1");
			builder.put(grammarAccess.getFromAccess().getNameAssignment_2(), "rule__From__NameAssignment_2");
			builder.put(grammarAccess.getFromAccess().getTag_or_digestAssignment_3(), "rule__From__Tag_or_digestAssignment_3");
			builder.put(grammarAccess.getMaintainerAccess().getNameAssignment_1(), "rule__Maintainer__NameAssignment_1");
			builder.put(grammarAccess.getExposeAccess().getPortsAssignment_1(), "rule__Expose__PortsAssignment_1");
			builder.put(grammarAccess.getWorkdirAccess().getPathAssignment_1(), "rule__Workdir__PathAssignment_1");
			builder.put(grammarAccess.getEXEC_FORMAccess().getExecutableAssignment_1(), "rule__EXEC_FORM__ExecutableAssignment_1");
			builder.put(grammarAccess.getEXEC_FORMAccess().getParametersAssignment_2(), "rule__EXEC_FORM__ParametersAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] {  };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
