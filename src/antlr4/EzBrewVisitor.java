// Generated from /Users/ianona/Desktop/CSC617M/InterpreterSystem/src/EzBrew.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EzBrewParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EzBrewVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(EzBrewParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#packageDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPackageDeclaration(EzBrewParser.PackageDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#importDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportDeclaration(EzBrewParser.ImportDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#typeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDeclaration(EzBrewParser.TypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(EzBrewParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceModifier(EzBrewParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(EzBrewParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(EzBrewParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#typeParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameters(EzBrewParser.TypeParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#typeParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeParameter(EzBrewParser.TypeParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(EzBrewParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#enumDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumDeclaration(EzBrewParser.EnumDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#enumConstants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstants(EzBrewParser.EnumConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#enumConstant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumConstant(EzBrewParser.EnumConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumBodyDeclarations(EzBrewParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceDeclaration(EzBrewParser.InterfaceDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(EzBrewParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#interfaceBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBody(EzBrewParser.InterfaceBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(EzBrewParser.ClassBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(EzBrewParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(EzBrewParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(EzBrewParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(EzBrewParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericMethodDeclaration(EzBrewParser.GenericMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericConstructorDeclaration(EzBrewParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(EzBrewParser.ConstructorDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(EzBrewParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceBodyDeclaration(EzBrewParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMemberDeclaration(EzBrewParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(EzBrewParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(EzBrewParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodDeclaration(EzBrewParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(EzBrewParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericInterfaceMethodDeclaration(EzBrewParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(EzBrewParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(EzBrewParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(EzBrewParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(EzBrewParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(EzBrewParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(EzBrewParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(EzBrewParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(EzBrewParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(EzBrewParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(EzBrewParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(EzBrewParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(EzBrewParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(EzBrewParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(EzBrewParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(EzBrewParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(EzBrewParser.FloatLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(EzBrewParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#elementValuePairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePairs(EzBrewParser.ElementValuePairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#elementValuePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValuePair(EzBrewParser.ElementValuePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#elementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValue(EzBrewParser.ElementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementValueArrayInitializer(EzBrewParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeDeclaration(EzBrewParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeBody(EzBrewParser.AnnotationTypeBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementDeclaration(EzBrewParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationTypeElementRest(EzBrewParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodOrConstantRest(EzBrewParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationMethodRest(EzBrewParser.AnnotationMethodRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotationConstantRest(EzBrewParser.AnnotationConstantRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(EzBrewParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(EzBrewParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(EzBrewParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(EzBrewParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalTypeDeclaration(EzBrewParser.LocalTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(EzBrewParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#catchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchClause(EzBrewParser.CatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#catchType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchType(EzBrewParser.CatchTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#finallyBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinallyBlock(EzBrewParser.FinallyBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#resourceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceSpecification(EzBrewParser.ResourceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#resources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResources(EzBrewParser.ResourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(EzBrewParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(EzBrewParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(EzBrewParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(EzBrewParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(EzBrewParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(EzBrewParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(EzBrewParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(EzBrewParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(EzBrewParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EzBrewParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#lambdaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExpression(EzBrewParser.LambdaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#lambdaParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameters(EzBrewParser.LambdaParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#lambdaBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaBody(EzBrewParser.LambdaBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(EzBrewParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#classType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassType(EzBrewParser.ClassTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(EzBrewParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(EzBrewParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#innerCreator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerCreator(EzBrewParser.InnerCreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(EzBrewParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#classCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassCreatorRest(EzBrewParser.ClassCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocation(EzBrewParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgumentsOrDiamond(EzBrewParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArgumentsOrDiamond(EzBrewParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonWildcardTypeArguments(EzBrewParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(EzBrewParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(EzBrewParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(EzBrewParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(EzBrewParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#superSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuperSuffix(EzBrewParser.SuperSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplicitGenericInvocationSuffix(EzBrewParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(EzBrewParser.ArgumentsContext ctx);
}