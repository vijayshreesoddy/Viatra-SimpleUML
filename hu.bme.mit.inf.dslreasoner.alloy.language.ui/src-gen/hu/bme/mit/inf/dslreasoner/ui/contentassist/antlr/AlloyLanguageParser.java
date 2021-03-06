/*
 * generated by Xtext
 */
package hu.bme.mit.inf.dslreasoner.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import hu.bme.mit.inf.dslreasoner.services.AlloyLanguageGrammarAccess;

public class AlloyLanguageParser extends AbstractContentAssistParser {
	
	@Inject
	private AlloyLanguageGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected hu.bme.mit.inf.dslreasoner.ui.contentassist.antlr.internal.InternalAlloyLanguageParser createParser() {
		hu.bme.mit.inf.dslreasoner.ui.contentassist.antlr.internal.InternalAlloyLanguageParser result = new hu.bme.mit.inf.dslreasoner.ui.contentassist.antlr.internal.InternalAlloyLanguageParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getALSDocumentAccess().getAlternatives_0(), "rule__ALSDocument__Alternatives_0");
					put(grammarAccess.getALSRelationDeclarationAccess().getAlternatives(), "rule__ALSRelationDeclaration__Alternatives");
					put(grammarAccess.getALSTypeDeclarationAccess().getAlternatives(), "rule__ALSTypeDeclaration__Alternatives");
					put(grammarAccess.getALSSignatureBodyAccess().getAlternatives_4(), "rule__ALSSignatureBody__Alternatives_4");
					put(grammarAccess.getALSDefinitionAccess().getAlternatives(), "rule__ALSDefinition__Alternatives");
					put(grammarAccess.getALSQuantifiedAccess().getAlternatives(), "rule__ALSQuantified__Alternatives");
					put(grammarAccess.getALSOrAccess().getAlternatives_1_1(), "rule__ALSOr__Alternatives_1_1");
					put(grammarAccess.getALSIffAccess().getAlternatives_1_1(), "rule__ALSIff__Alternatives_1_1");
					put(grammarAccess.getALSImplAccess().getAlternatives_1_1(), "rule__ALSImpl__Alternatives_1_1");
					put(grammarAccess.getALSAndAccess().getAlternatives_1_1(), "rule__ALSAnd__Alternatives_1_1");
					put(grammarAccess.getALSComparisonAccess().getAlternatives_1_0(), "rule__ALSComparison__Alternatives_1_0");
					put(grammarAccess.getALSPreficedAccess().getAlternatives(), "rule__ALSPreficed__Alternatives");
					put(grammarAccess.getALSPreficedAccess().getAlternatives_0_1_0(), "rule__ALSPreficed__Alternatives_0_1_0");
					put(grammarAccess.getALSPreficedAccess().getAlternatives_7_1(), "rule__ALSPreficed__Alternatives_7_1");
					put(grammarAccess.getALSBasicRelationTermAccess().getAlternatives(), "rule__ALSBasicRelationTerm__Alternatives");
					put(grammarAccess.getALSTypeScopeAccess().getAlternatives(), "rule__ALSTypeScope__Alternatives");
					put(grammarAccess.getALSMultiplicityAccess().getAlternatives(), "rule__ALSMultiplicity__Alternatives");
					put(grammarAccess.getALSNumericOperatorAccess().getAlternatives(), "rule__ALSNumericOperator__Alternatives");
					put(grammarAccess.getALSDocumentAccess().getGroup(), "rule__ALSDocument__Group__0");
					put(grammarAccess.getALSEnumDeclarationAccess().getGroup(), "rule__ALSEnumDeclaration__Group__0");
					put(grammarAccess.getALSEnumDeclarationAccess().getGroup_4(), "rule__ALSEnumDeclaration__Group_4__0");
					put(grammarAccess.getALSSignatureBodyAccess().getGroup(), "rule__ALSSignatureBody__Group__0");
					put(grammarAccess.getALSSignatureBodyAccess().getGroup_3(), "rule__ALSSignatureBody__Group_3__0");
					put(grammarAccess.getALSSignatureBodyAccess().getGroup_4_0(), "rule__ALSSignatureBody__Group_4_0__0");
					put(grammarAccess.getALSSignatureBodyAccess().getGroup_4_1(), "rule__ALSSignatureBody__Group_4_1__0");
					put(grammarAccess.getALSSignatureBodyAccess().getGroup_4_1_2(), "rule__ALSSignatureBody__Group_4_1_2__0");
					put(grammarAccess.getALSSignatureBodyAccess().getGroup_6(), "rule__ALSSignatureBody__Group_6__0");
					put(grammarAccess.getALSSignatureBodyAccess().getGroup_6_1(), "rule__ALSSignatureBody__Group_6_1__0");
					put(grammarAccess.getALSFieldDeclarationAccess().getGroup(), "rule__ALSFieldDeclaration__Group__0");
					put(grammarAccess.getALSFunctionDefinitionAccess().getGroup(), "rule__ALSFunctionDefinition__Group__0");
					put(grammarAccess.getALSFunctionDefinitionAccess().getGroup_4(), "rule__ALSFunctionDefinition__Group_4__0");
					put(grammarAccess.getALSRelationDefinitionAccess().getGroup(), "rule__ALSRelationDefinition__Group__0");
					put(grammarAccess.getALSRelationDefinitionAccess().getGroup_4(), "rule__ALSRelationDefinition__Group_4__0");
					put(grammarAccess.getALSFactDeclarationAccess().getGroup(), "rule__ALSFactDeclaration__Group__0");
					put(grammarAccess.getALSQuantifiedAccess().getGroup_0(), "rule__ALSQuantified__Group_0__0");
					put(grammarAccess.getALSQuantifiedAccess().getGroup_0_4(), "rule__ALSQuantified__Group_0_4__0");
					put(grammarAccess.getALSOrAccess().getGroup(), "rule__ALSOr__Group__0");
					put(grammarAccess.getALSOrAccess().getGroup_1(), "rule__ALSOr__Group_1__0");
					put(grammarAccess.getALSIffAccess().getGroup(), "rule__ALSIff__Group__0");
					put(grammarAccess.getALSIffAccess().getGroup_1(), "rule__ALSIff__Group_1__0");
					put(grammarAccess.getALSImplAccess().getGroup(), "rule__ALSImpl__Group__0");
					put(grammarAccess.getALSImplAccess().getGroup_1(), "rule__ALSImpl__Group_1__0");
					put(grammarAccess.getALSImplAccess().getGroup_1_3(), "rule__ALSImpl__Group_1_3__0");
					put(grammarAccess.getALSAndAccess().getGroup(), "rule__ALSAnd__Group__0");
					put(grammarAccess.getALSAndAccess().getGroup_1(), "rule__ALSAnd__Group_1__0");
					put(grammarAccess.getALSComparisonAccess().getGroup(), "rule__ALSComparison__Group__0");
					put(grammarAccess.getALSComparisonAccess().getGroup_1(), "rule__ALSComparison__Group_1__0");
					put(grammarAccess.getALSComparisonAccess().getGroup_1_0_0(), "rule__ALSComparison__Group_1_0_0__0");
					put(grammarAccess.getALSComparisonAccess().getGroup_1_0_1(), "rule__ALSComparison__Group_1_0_1__0");
					put(grammarAccess.getALSComparisonAccess().getGroup_1_0_2(), "rule__ALSComparison__Group_1_0_2__0");
					put(grammarAccess.getALSComparisonAccess().getGroup_1_0_3(), "rule__ALSComparison__Group_1_0_3__0");
					put(grammarAccess.getALSComparisonAccess().getGroup_1_0_4(), "rule__ALSComparison__Group_1_0_4__0");
					put(grammarAccess.getALSComparisonAccess().getGroup_1_0_5(), "rule__ALSComparison__Group_1_0_5__0");
					put(grammarAccess.getALSComparisonAccess().getGroup_1_0_6(), "rule__ALSComparison__Group_1_0_6__0");
					put(grammarAccess.getALSOverrideAccess().getGroup(), "rule__ALSOverride__Group__0");
					put(grammarAccess.getALSOverrideAccess().getGroup_1(), "rule__ALSOverride__Group_1__0");
					put(grammarAccess.getALSRangeRestrictionRightAccess().getGroup(), "rule__ALSRangeRestrictionRight__Group__0");
					put(grammarAccess.getALSRangeRestrictionRightAccess().getGroup_1(), "rule__ALSRangeRestrictionRight__Group_1__0");
					put(grammarAccess.getALSRangeRestrictionLeftAccess().getGroup(), "rule__ALSRangeRestrictionLeft__Group__0");
					put(grammarAccess.getALSRangeRestrictionLeftAccess().getGroup_1(), "rule__ALSRangeRestrictionLeft__Group_1__0");
					put(grammarAccess.getALSJoinAccess().getGroup(), "rule__ALSJoin__Group__0");
					put(grammarAccess.getALSJoinAccess().getGroup_1(), "rule__ALSJoin__Group_1__0");
					put(grammarAccess.getALSMinusAccess().getGroup(), "rule__ALSMinus__Group__0");
					put(grammarAccess.getALSMinusAccess().getGroup_1(), "rule__ALSMinus__Group_1__0");
					put(grammarAccess.getALSPlusAccess().getGroup(), "rule__ALSPlus__Group__0");
					put(grammarAccess.getALSPlusAccess().getGroup_1(), "rule__ALSPlus__Group_1__0");
					put(grammarAccess.getALSIntersectionAccess().getGroup(), "rule__ALSIntersection__Group__0");
					put(grammarAccess.getALSIntersectionAccess().getGroup_1(), "rule__ALSIntersection__Group_1__0");
					put(grammarAccess.getALSDirectProductAccess().getGroup(), "rule__ALSDirectProduct__Group__0");
					put(grammarAccess.getALSDirectProductAccess().getGroup_1(), "rule__ALSDirectProduct__Group_1__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_0(), "rule__ALSPreficed__Group_0__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_0_1(), "rule__ALSPreficed__Group_0_1__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_1(), "rule__ALSPreficed__Group_1__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_2(), "rule__ALSPreficed__Group_2__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_3(), "rule__ALSPreficed__Group_3__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_4(), "rule__ALSPreficed__Group_4__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_5(), "rule__ALSPreficed__Group_5__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_6(), "rule__ALSPreficed__Group_6__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_6_3(), "rule__ALSPreficed__Group_6_3__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_7(), "rule__ALSPreficed__Group_7__0");
					put(grammarAccess.getALSPreficedAccess().getGroup_7_4(), "rule__ALSPreficed__Group_7_4__0");
					put(grammarAccess.getALSVariableDeclarationAccess().getGroup(), "rule__ALSVariableDeclaration__Group__0");
					put(grammarAccess.getALSBasicRelationTermAccess().getGroup_0(), "rule__ALSBasicRelationTerm__Group_0__0");
					put(grammarAccess.getALSBasicRelationTermAccess().getGroup_1(), "rule__ALSBasicRelationTerm__Group_1__0");
					put(grammarAccess.getALSBasicRelationTermAccess().getGroup_2(), "rule__ALSBasicRelationTerm__Group_2__0");
					put(grammarAccess.getALSBasicRelationTermAccess().getGroup_3(), "rule__ALSBasicRelationTerm__Group_3__0");
					put(grammarAccess.getALSBasicRelationTermAccess().getGroup_4(), "rule__ALSBasicRelationTerm__Group_4__0");
					put(grammarAccess.getALSBasicRelationTermAccess().getGroup_5(), "rule__ALSBasicRelationTerm__Group_5__0");
					put(grammarAccess.getALSBasicRelationTermAccess().getGroup_6(), "rule__ALSBasicRelationTerm__Group_6__0");
					put(grammarAccess.getALSBasicRelationTermAccess().getGroup_7(), "rule__ALSBasicRelationTerm__Group_7__0");
					put(grammarAccess.getALSBasicRelationTermAccess().getGroup_8(), "rule__ALSBasicRelationTerm__Group_8__0");
					put(grammarAccess.getALSRunCommandAccess().getGroup(), "rule__ALSRunCommand__Group__0");
					put(grammarAccess.getALSRunCommandAccess().getGroup_4(), "rule__ALSRunCommand__Group_4__0");
					put(grammarAccess.getALSRunCommandAccess().getGroup_4_2(), "rule__ALSRunCommand__Group_4_2__0");
					put(grammarAccess.getALSSigScopeAccess().getGroup(), "rule__ALSSigScope__Group__0");
					put(grammarAccess.getALSIntScopeAccess().getGroup(), "rule__ALSIntScope__Group__0");
					put(grammarAccess.getALSStringScopeAccess().getGroup(), "rule__ALSStringScope__Group__0");
					put(grammarAccess.getALSDocumentAccess().getEnumDeclarationsAssignment_0_0(), "rule__ALSDocument__EnumDeclarationsAssignment_0_0");
					put(grammarAccess.getALSDocumentAccess().getSignatureBodiesAssignment_0_1(), "rule__ALSDocument__SignatureBodiesAssignment_0_1");
					put(grammarAccess.getALSDocumentAccess().getFunctionDefinitionsAssignment_0_2(), "rule__ALSDocument__FunctionDefinitionsAssignment_0_2");
					put(grammarAccess.getALSDocumentAccess().getRelationDefinitionsAssignment_0_3(), "rule__ALSDocument__RelationDefinitionsAssignment_0_3");
					put(grammarAccess.getALSDocumentAccess().getFactDeclarationsAssignment_0_4(), "rule__ALSDocument__FactDeclarationsAssignment_0_4");
					put(grammarAccess.getALSDocumentAccess().getRunCommandAssignment_1(), "rule__ALSDocument__RunCommandAssignment_1");
					put(grammarAccess.getALSEnumDeclarationAccess().getNameAssignment_1(), "rule__ALSEnumDeclaration__NameAssignment_1");
					put(grammarAccess.getALSEnumDeclarationAccess().getLiteralAssignment_3(), "rule__ALSEnumDeclaration__LiteralAssignment_3");
					put(grammarAccess.getALSEnumDeclarationAccess().getLiteralAssignment_4_1(), "rule__ALSEnumDeclaration__LiteralAssignment_4_1");
					put(grammarAccess.getALSEnumLiteralAccess().getNameAssignment(), "rule__ALSEnumLiteral__NameAssignment");
					put(grammarAccess.getALSSignatureDeclarationAccess().getNameAssignment(), "rule__ALSSignatureDeclaration__NameAssignment");
					put(grammarAccess.getALSSignatureBodyAccess().getMultiplicityAssignment_0_0(), "rule__ALSSignatureBody__MultiplicityAssignment_0_0");
					put(grammarAccess.getALSSignatureBodyAccess().getAbstractAssignment_0_1(), "rule__ALSSignatureBody__AbstractAssignment_0_1");
					put(grammarAccess.getALSSignatureBodyAccess().getDeclarationsAssignment_2(), "rule__ALSSignatureBody__DeclarationsAssignment_2");
					put(grammarAccess.getALSSignatureBodyAccess().getDeclarationsAssignment_3_1(), "rule__ALSSignatureBody__DeclarationsAssignment_3_1");
					put(grammarAccess.getALSSignatureBodyAccess().getSupertypeAssignment_4_0_1(), "rule__ALSSignatureBody__SupertypeAssignment_4_0_1");
					put(grammarAccess.getALSSignatureBodyAccess().getSupersetAssignment_4_1_1(), "rule__ALSSignatureBody__SupersetAssignment_4_1_1");
					put(grammarAccess.getALSSignatureBodyAccess().getSupersetAssignment_4_1_2_1(), "rule__ALSSignatureBody__SupersetAssignment_4_1_2_1");
					put(grammarAccess.getALSSignatureBodyAccess().getFieldsAssignment_6_0(), "rule__ALSSignatureBody__FieldsAssignment_6_0");
					put(grammarAccess.getALSSignatureBodyAccess().getFieldsAssignment_6_1_1(), "rule__ALSSignatureBody__FieldsAssignment_6_1_1");
					put(grammarAccess.getALSFieldDeclarationAccess().getNameAssignment_0(), "rule__ALSFieldDeclaration__NameAssignment_0");
					put(grammarAccess.getALSFieldDeclarationAccess().getMultiplicityAssignment_2(), "rule__ALSFieldDeclaration__MultiplicityAssignment_2");
					put(grammarAccess.getALSFieldDeclarationAccess().getTypeAssignment_3(), "rule__ALSFieldDeclaration__TypeAssignment_3");
					put(grammarAccess.getALSFunctionDefinitionAccess().getNameAssignment_1(), "rule__ALSFunctionDefinition__NameAssignment_1");
					put(grammarAccess.getALSFunctionDefinitionAccess().getVariablesAssignment_3(), "rule__ALSFunctionDefinition__VariablesAssignment_3");
					put(grammarAccess.getALSFunctionDefinitionAccess().getVariablesAssignment_4_1(), "rule__ALSFunctionDefinition__VariablesAssignment_4_1");
					put(grammarAccess.getALSFunctionDefinitionAccess().getTypeAssignment_7(), "rule__ALSFunctionDefinition__TypeAssignment_7");
					put(grammarAccess.getALSFunctionDefinitionAccess().getValueAssignment_9(), "rule__ALSFunctionDefinition__ValueAssignment_9");
					put(grammarAccess.getALSRelationDefinitionAccess().getNameAssignment_1(), "rule__ALSRelationDefinition__NameAssignment_1");
					put(grammarAccess.getALSRelationDefinitionAccess().getVariablesAssignment_3(), "rule__ALSRelationDefinition__VariablesAssignment_3");
					put(grammarAccess.getALSRelationDefinitionAccess().getVariablesAssignment_4_1(), "rule__ALSRelationDefinition__VariablesAssignment_4_1");
					put(grammarAccess.getALSRelationDefinitionAccess().getValueAssignment_7(), "rule__ALSRelationDefinition__ValueAssignment_7");
					put(grammarAccess.getALSFactDeclarationAccess().getNameAssignment_2(), "rule__ALSFactDeclaration__NameAssignment_2");
					put(grammarAccess.getALSFactDeclarationAccess().getTermAssignment_4(), "rule__ALSFactDeclaration__TermAssignment_4");
					put(grammarAccess.getALSQuantifiedAccess().getTypeAssignment_0_1(), "rule__ALSQuantified__TypeAssignment_0_1");
					put(grammarAccess.getALSQuantifiedAccess().getDisjAssignment_0_2(), "rule__ALSQuantified__DisjAssignment_0_2");
					put(grammarAccess.getALSQuantifiedAccess().getVariablesAssignment_0_3(), "rule__ALSQuantified__VariablesAssignment_0_3");
					put(grammarAccess.getALSQuantifiedAccess().getVariablesAssignment_0_4_1(), "rule__ALSQuantified__VariablesAssignment_0_4_1");
					put(grammarAccess.getALSQuantifiedAccess().getExpressionAssignment_0_6(), "rule__ALSQuantified__ExpressionAssignment_0_6");
					put(grammarAccess.getALSOrAccess().getRightOperandAssignment_1_2(), "rule__ALSOr__RightOperandAssignment_1_2");
					put(grammarAccess.getALSIffAccess().getRightOperandAssignment_1_2(), "rule__ALSIff__RightOperandAssignment_1_2");
					put(grammarAccess.getALSImplAccess().getRightOperandAssignment_1_2(), "rule__ALSImpl__RightOperandAssignment_1_2");
					put(grammarAccess.getALSImplAccess().getElseOperandAssignment_1_3_1(), "rule__ALSImpl__ElseOperandAssignment_1_3_1");
					put(grammarAccess.getALSAndAccess().getRightOperandAssignment_1_2(), "rule__ALSAnd__RightOperandAssignment_1_2");
					put(grammarAccess.getALSComparisonAccess().getRightOperandAssignment_1_1(), "rule__ALSComparison__RightOperandAssignment_1_1");
					put(grammarAccess.getALSOverrideAccess().getRightOperandAssignment_1_2(), "rule__ALSOverride__RightOperandAssignment_1_2");
					put(grammarAccess.getALSRangeRestrictionRightAccess().getFilterAssignment_1_2(), "rule__ALSRangeRestrictionRight__FilterAssignment_1_2");
					put(grammarAccess.getALSRangeRestrictionLeftAccess().getRelationAssignment_1_2(), "rule__ALSRangeRestrictionLeft__RelationAssignment_1_2");
					put(grammarAccess.getALSJoinAccess().getRightOperandAssignment_1_2(), "rule__ALSJoin__RightOperandAssignment_1_2");
					put(grammarAccess.getALSMinusAccess().getRightOperandAssignment_1_2(), "rule__ALSMinus__RightOperandAssignment_1_2");
					put(grammarAccess.getALSPlusAccess().getRightOperandAssignment_1_2(), "rule__ALSPlus__RightOperandAssignment_1_2");
					put(grammarAccess.getALSIntersectionAccess().getRightOperandAssignment_1_2(), "rule__ALSIntersection__RightOperandAssignment_1_2");
					put(grammarAccess.getALSDirectProductAccess().getLeftMultiplicitAssignment_1_1(), "rule__ALSDirectProduct__LeftMultiplicitAssignment_1_1");
					put(grammarAccess.getALSDirectProductAccess().getRightMultiplicitAssignment_1_3(), "rule__ALSDirectProduct__RightMultiplicitAssignment_1_3");
					put(grammarAccess.getALSDirectProductAccess().getRightOperandAssignment_1_4(), "rule__ALSDirectProduct__RightOperandAssignment_1_4");
					put(grammarAccess.getALSPreficedAccess().getOperandAssignment_0_2(), "rule__ALSPreficed__OperandAssignment_0_2");
					put(grammarAccess.getALSPreficedAccess().getOperandAssignment_1_2(), "rule__ALSPreficed__OperandAssignment_1_2");
					put(grammarAccess.getALSPreficedAccess().getOperandAssignment_2_2(), "rule__ALSPreficed__OperandAssignment_2_2");
					put(grammarAccess.getALSPreficedAccess().getOperandAssignment_3_2(), "rule__ALSPreficed__OperandAssignment_3_2");
					put(grammarAccess.getALSPreficedAccess().getOperandAssignment_4_2(), "rule__ALSPreficed__OperandAssignment_4_2");
					put(grammarAccess.getALSPreficedAccess().getOperandAssignment_5_2(), "rule__ALSPreficed__OperandAssignment_5_2");
					put(grammarAccess.getALSPreficedAccess().getVariablesAssignment_6_2(), "rule__ALSPreficed__VariablesAssignment_6_2");
					put(grammarAccess.getALSPreficedAccess().getVariablesAssignment_6_3_1(), "rule__ALSPreficed__VariablesAssignment_6_3_1");
					put(grammarAccess.getALSPreficedAccess().getExpressionAssignment_6_5(), "rule__ALSPreficed__ExpressionAssignment_6_5");
					put(grammarAccess.getALSPreficedAccess().getReferredDefinitionAssignment_7_1_0(), "rule__ALSPreficed__ReferredDefinitionAssignment_7_1_0");
					put(grammarAccess.getALSPreficedAccess().getReferredNumericOperatorAssignment_7_1_1(), "rule__ALSPreficed__ReferredNumericOperatorAssignment_7_1_1");
					put(grammarAccess.getALSPreficedAccess().getParamsAssignment_7_3(), "rule__ALSPreficed__ParamsAssignment_7_3");
					put(grammarAccess.getALSPreficedAccess().getParamsAssignment_7_4_1(), "rule__ALSPreficed__ParamsAssignment_7_4_1");
					put(grammarAccess.getALSVariableDeclarationAccess().getNameAssignment_0(), "rule__ALSVariableDeclaration__NameAssignment_0");
					put(grammarAccess.getALSVariableDeclarationAccess().getRangeAssignment_2(), "rule__ALSVariableDeclaration__RangeAssignment_2");
					put(grammarAccess.getALSBasicRelationTermAccess().getReferredAssignment_5_1(), "rule__ALSBasicRelationTerm__ReferredAssignment_5_1");
					put(grammarAccess.getALSBasicRelationTermAccess().getValueAssignment_6_1(), "rule__ALSBasicRelationTerm__ValueAssignment_6_1");
					put(grammarAccess.getALSBasicRelationTermAccess().getValueAssignment_7_1(), "rule__ALSBasicRelationTerm__ValueAssignment_7_1");
					put(grammarAccess.getALSRunCommandAccess().getTypeScopesAssignment_4_1(), "rule__ALSRunCommand__TypeScopesAssignment_4_1");
					put(grammarAccess.getALSRunCommandAccess().getTypeScopesAssignment_4_2_1(), "rule__ALSRunCommand__TypeScopesAssignment_4_2_1");
					put(grammarAccess.getALSSigScopeAccess().getExactlyAssignment_0(), "rule__ALSSigScope__ExactlyAssignment_0");
					put(grammarAccess.getALSSigScopeAccess().getNumberAssignment_1(), "rule__ALSSigScope__NumberAssignment_1");
					put(grammarAccess.getALSSigScopeAccess().getTypeAssignment_2(), "rule__ALSSigScope__TypeAssignment_2");
					put(grammarAccess.getALSIntScopeAccess().getNumberAssignment_0(), "rule__ALSIntScope__NumberAssignment_0");
					put(grammarAccess.getALSStringScopeAccess().getNumberAssignment_1(), "rule__ALSStringScope__NumberAssignment_1");
					put(grammarAccess.getALSSignatureBodyAccess().getUnorderedGroup_0(), "rule__ALSSignatureBody__UnorderedGroup_0");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			hu.bme.mit.inf.dslreasoner.ui.contentassist.antlr.internal.InternalAlloyLanguageParser typedParser = (hu.bme.mit.inf.dslreasoner.ui.contentassist.antlr.internal.InternalAlloyLanguageParser) parser;
			typedParser.entryRuleALSDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AlloyLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AlloyLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
