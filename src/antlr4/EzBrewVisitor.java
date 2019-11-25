// Generated from /Users/wonsukcho/Documents/GitHub/CSC617M_InterpreterSystem/src/EzBrew.g4 by ANTLR 4.7.2
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
	 * Visit a parse tree produced by {@link EzBrewParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(EzBrewParser.StartContext ctx);
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
	 * Visit a parse tree produced by {@link EzBrewParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclaration(EzBrewParser.ConstructorDeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link EzBrewParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceMethodModifier(EzBrewParser.InterfaceMethodModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(EzBrewParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link EzBrewParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignment(EzBrewParser.VarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarator}
	 * labeled alternative in {@link EzBrewParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarator(EzBrewParser.VarDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrInit}
	 * labeled alternative in {@link EzBrewParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrInit(EzBrewParser.ArrInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInit}
	 * labeled alternative in {@link EzBrewParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInit(EzBrewParser.ExprInitContext ctx);
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
	 * Visit a parse tree produced by the {@code IntLit}
	 * labeled alternative in {@link EzBrewParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLit(EzBrewParser.IntLitContext ctx);
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
	 * Visit a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(EzBrewParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(EzBrewParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfStmt2}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt2(EzBrewParser.IfStmt2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(EzBrewParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(EzBrewParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmt(EzBrewParser.DoWhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SwitchStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(EzBrewParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(EzBrewParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(EzBrewParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(EzBrewParser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(EzBrewParser.PrintStmtContext ctx);
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
	 * Visit a parse tree produced by the {@code ParExp}
	 * labeled alternative in {@link EzBrewParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExp(EzBrewParser.ParExpContext ctx);
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
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(EzBrewParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(EzBrewParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(EzBrewParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(EzBrewParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(EzBrewParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pri}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPri(EzBrewParser.PriContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Compare1}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare1(EzBrewParser.Compare1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(EzBrewParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Compare2}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare2(EzBrewParser.Compare2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code ParEps}
	 * labeled alternative in {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParEps(EzBrewParser.ParEpsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLit(EzBrewParser.LitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(EzBrewParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link EzBrewParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(EzBrewParser.ArrayCreatorRestContext ctx);
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