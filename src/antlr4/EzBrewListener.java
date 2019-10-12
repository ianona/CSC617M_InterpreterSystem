// Generated from /Users/ianona/Desktop/CSC617M/InterpreterSystem/src/EzBrew.g4 by ANTLR 4.7.2
package antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EzBrewParser}.
 */
public interface EzBrewListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(EzBrewParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(EzBrewParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(EzBrewParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(EzBrewParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(EzBrewParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(EzBrewParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(EzBrewParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(EzBrewParser.TypeDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(EzBrewParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(EzBrewParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(EzBrewParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(EzBrewParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(EzBrewParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(EzBrewParser.TypeParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(EzBrewParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(EzBrewParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(EzBrewParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(EzBrewParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(EzBrewParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(EzBrewParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(EzBrewParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(EzBrewParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(EzBrewParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(EzBrewParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(EzBrewParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(EzBrewParser.InterfaceDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(EzBrewParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(EzBrewParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(EzBrewParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(EzBrewParser.InterfaceBodyContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(EzBrewParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(EzBrewParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(EzBrewParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(EzBrewParser.GenericConstructorDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(EzBrewParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(EzBrewParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(EzBrewParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(EzBrewParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(EzBrewParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(EzBrewParser.InterfaceMemberDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(EzBrewParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(EzBrewParser.InterfaceMethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(EzBrewParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(EzBrewParser.GenericInterfaceMethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(EzBrewParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(EzBrewParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(EzBrewParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(EzBrewParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(EzBrewParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(EzBrewParser.VariableInitializerContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(EzBrewParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(EzBrewParser.FormalParameterContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(EzBrewParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(EzBrewParser.IntegerLiteralContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeDeclaration(EzBrewParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#annotationTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeDeclaration(EzBrewParser.AnnotationTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeBody(EzBrewParser.AnnotationTypeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#annotationTypeBody}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeBody(EzBrewParser.AnnotationTypeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementDeclaration(EzBrewParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#annotationTypeElementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementDeclaration(EzBrewParser.AnnotationTypeElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationTypeElementRest(EzBrewParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#annotationTypeElementRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationTypeElementRest(EzBrewParser.AnnotationTypeElementRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodOrConstantRest(EzBrewParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#annotationMethodOrConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodOrConstantRest(EzBrewParser.AnnotationMethodOrConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationMethodRest(EzBrewParser.AnnotationMethodRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#annotationMethodRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationMethodRest(EzBrewParser.AnnotationMethodRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationConstantRest(EzBrewParser.AnnotationConstantRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#annotationConstantRest}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationConstantRest(EzBrewParser.AnnotationConstantRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(EzBrewParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(EzBrewParser.DefaultValueContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalTypeDeclaration(EzBrewParser.LocalTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#localTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalTypeDeclaration(EzBrewParser.LocalTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EzBrewParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EzBrewParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(EzBrewParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(EzBrewParser.CatchClauseContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(EzBrewParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(EzBrewParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(EzBrewParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(EzBrewParser.ParExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EzBrewParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EzBrewParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExpression(EzBrewParser.LambdaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#lambdaExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExpression(EzBrewParser.LambdaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void enterLambdaParameters(EzBrewParser.LambdaParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#lambdaParameters}.
	 * @param ctx the parse tree
	 */
	void exitLambdaParameters(EzBrewParser.LambdaParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void enterLambdaBody(EzBrewParser.LambdaBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#lambdaBody}.
	 * @param ctx the parse tree
	 */
	void exitLambdaBody(EzBrewParser.LambdaBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(EzBrewParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(EzBrewParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#classType}.
	 * @param ctx the parse tree
	 */
	void enterClassType(EzBrewParser.ClassTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#classType}.
	 * @param ctx the parse tree
	 */
	void exitClassType(EzBrewParser.ClassTypeContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(EzBrewParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(EzBrewParser.InnerCreatorContext ctx);
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
	 * Enter a parse tree produced by {@link EzBrewParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(EzBrewParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(EzBrewParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(EzBrewParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(EzBrewParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(EzBrewParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(EzBrewParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(EzBrewParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(EzBrewParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(EzBrewParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(EzBrewParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EzBrewParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(EzBrewParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EzBrewParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(EzBrewParser.TypeListContext ctx);
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