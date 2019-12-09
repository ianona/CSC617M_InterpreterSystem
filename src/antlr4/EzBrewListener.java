// Generated from /Users/ianona/Desktop/CSC617M/InterpreterSystem/src/EzBrew.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EzBrewParser}.
 */
public interface EzBrewListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(EzBrewParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(EzBrewParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(EzBrewParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(EzBrewParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(EzBrewParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(EzBrewParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(EzBrewParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(EzBrewParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(EzBrewParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(EzBrewParser.ClassBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(EzBrewParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(EzBrewParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(EzBrewParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(EzBrewParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(EzBrewParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(EzBrewParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(EzBrewParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(EzBrewParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(EzBrewParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(EzBrewParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(EzBrewParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(EzBrewParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(EzBrewParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(EzBrewParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodModifier(EzBrewParser.InterfaceMethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#interfaceMethodModifier}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodModifier(EzBrewParser.InterfaceMethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(EzBrewParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(EzBrewParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link EzBrewParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(EzBrewParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarAssignment}
	 * labeled alternative in {@link EzBrewParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(EzBrewParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarDeclarator}
	 * labeled alternative in {@link EzBrewParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclarator(EzBrewParser.VarDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarDeclarator}
	 * labeled alternative in {@link EzBrewParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclarator(EzBrewParser.VarDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrInit}
	 * labeled alternative in {@link EzBrewParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrInit(EzBrewParser.ArrInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrInit}
	 * labeled alternative in {@link EzBrewParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrInit(EzBrewParser.ArrInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInit}
	 * labeled alternative in {@link EzBrewParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterExprInit(EzBrewParser.ExprInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInit}
	 * labeled alternative in {@link EzBrewParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitExprInit(EzBrewParser.ExprInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(EzBrewParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(EzBrewParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(EzBrewParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(EzBrewParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(EzBrewParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(EzBrewParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(EzBrewParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(EzBrewParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(EzBrewParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(EzBrewParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(EzBrewParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(EzBrewParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FormalParam}
	 * labeled alternative in {@link EzBrewParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(EzBrewParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FormalParam}
	 * labeled alternative in {@link EzBrewParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(EzBrewParser.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(EzBrewParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(EzBrewParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(EzBrewParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(EzBrewParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(EzBrewParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(EzBrewParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLit}
	 * labeled alternative in {@link EzBrewParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntLit(EzBrewParser.IntLitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLit}
	 * labeled alternative in {@link EzBrewParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntLit(EzBrewParser.IntLitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(EzBrewParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(EzBrewParser.FloatLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#annotation}.
	 * @param ctx the parse tree
	 */
	void enterAnnotation(EzBrewParser.AnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#annotation}.
	 * @param ctx the parse tree
	 */
	void exitAnnotation(EzBrewParser.AnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePairs(EzBrewParser.ElementValuePairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#elementValuePairs}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePairs(EzBrewParser.ElementValuePairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void enterElementValuePair(EzBrewParser.ElementValuePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#elementValuePair}.
	 * @param ctx the parse tree
	 */
	void exitElementValuePair(EzBrewParser.ElementValuePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void enterElementValue(EzBrewParser.ElementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#elementValue}.
	 * @param ctx the parse tree
	 */
	void exitElementValue(EzBrewParser.ElementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterElementValueArrayInitializer(EzBrewParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#elementValueArrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitElementValueArrayInitializer(EzBrewParser.ElementValueArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EzBrewParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EzBrewParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(EzBrewParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(EzBrewParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(EzBrewParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(EzBrewParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ElseStmt}
	 * labeled alternative in {@link EzBrewParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStmt(EzBrewParser.ElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ElseStmt}
	 * labeled alternative in {@link EzBrewParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStmt(EzBrewParser.ElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(EzBrewParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(EzBrewParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(EzBrewParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(EzBrewParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStmt2}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt2(EzBrewParser.IfStmt2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStmt2}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt2(EzBrewParser.IfStmt2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(EzBrewParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(EzBrewParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(EzBrewParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(EzBrewParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(EzBrewParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoWhileStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(EzBrewParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TryStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTryStmt(EzBrewParser.TryStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TryStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTryStmt(EzBrewParser.TryStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SwitchStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(EzBrewParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SwitchStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(EzBrewParser.SwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(EzBrewParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(EzBrewParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(EzBrewParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(EzBrewParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(EzBrewParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrintStmt}
	 * labeled alternative in {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(EzBrewParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CatchBlock}
	 * labeled alternative in {@link EzBrewParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchBlock(EzBrewParser.CatchBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CatchBlock}
	 * labeled alternative in {@link EzBrewParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchBlock(EzBrewParser.CatchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(EzBrewParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(EzBrewParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(EzBrewParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(EzBrewParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(EzBrewParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(EzBrewParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(EzBrewParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(EzBrewParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(EzBrewParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(EzBrewParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(EzBrewParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(EzBrewParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(EzBrewParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(EzBrewParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(EzBrewParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(EzBrewParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(EzBrewParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(EzBrewParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParExp}
	 * labeled alternative in {@link EzBrewParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExp(EzBrewParser.ParExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParExp}
	 * labeled alternative in {@link EzBrewParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExp(EzBrewParser.ParExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(EzBrewParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(EzBrewParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(EzBrewParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(EzBrewParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(EzBrewParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(EzBrewParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(EzBrewParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(EzBrewParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(EzBrewParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(EzBrewParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pri}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPri(EzBrewParser.PriContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pri}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPri(EzBrewParser.PriContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MthdCall}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMthdCall(EzBrewParser.MthdCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MthdCall}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMthdCall(EzBrewParser.MthdCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IncDec}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIncDec(EzBrewParser.IncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IncDec}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIncDec(EzBrewParser.IncDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EzBrewParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EzBrewParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Input}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInput(EzBrewParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Input}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInput(EzBrewParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(EzBrewParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(EzBrewParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare1}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare1(EzBrewParser.Compare1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare1}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare1(EzBrewParser.Compare1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(EzBrewParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(EzBrewParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare2}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare2(EzBrewParser.Compare2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare2}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare2(EzBrewParser.Compare2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code NewCreator}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewCreator(EzBrewParser.NewCreatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewCreator}
	 * labeled alternative in {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewCreator(EzBrewParser.NewCreatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParEps}
	 * labeled alternative in {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterParEps(EzBrewParser.ParEpsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParEps}
	 * labeled alternative in {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitParEps(EzBrewParser.ParEpsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterLit(EzBrewParser.LitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Lit}
	 * labeled alternative in {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitLit(EzBrewParser.LitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(EzBrewParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(EzBrewParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(EzBrewParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(EzBrewParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(EzBrewParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(EzBrewParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(EzBrewParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(EzBrewParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(EzBrewParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(EzBrewParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(EzBrewParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(EzBrewParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(EzBrewParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(EzBrewParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(EzBrewParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(EzBrewParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(EzBrewParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(EzBrewParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(EzBrewParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(EzBrewParser.ArgumentsContext ctx);
}