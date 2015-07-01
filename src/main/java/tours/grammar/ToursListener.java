// Generated from C:/Users/Jip/Documents/tours/src/main/java/tours/grammar\Tours.g4 by ANTLR 4.5
package tours.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ToursParser}.
 */
public interface ToursListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ToursParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull ToursParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull ToursParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull ToursParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull ToursParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull ToursParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull ToursParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull ToursParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull ToursParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link ToursParser#function}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link ToursParser#function}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link ToursParser#function}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link ToursParser#function}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull ToursParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull ToursParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlock(@NotNull ToursParser.ReturnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlock(@NotNull ToursParser.ReturnBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link ToursParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(@NotNull ToursParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link ToursParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(@NotNull ToursParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputStatement}
	 * labeled alternative in {@link ToursParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(@NotNull ToursParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputStatement}
	 * labeled alternative in {@link ToursParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(@NotNull ToursParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link ToursParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(@NotNull ToursParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link ToursParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(@NotNull ToursParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link ToursParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(@NotNull ToursParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link ToursParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(@NotNull ToursParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link ToursParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(@NotNull ToursParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link ToursParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(@NotNull ToursParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link ToursParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(@NotNull ToursParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link ToursParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(@NotNull ToursParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(@NotNull ToursParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(@NotNull ToursParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpr(@NotNull ToursParser.IntegerExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpr(@NotNull ToursParser.IntegerExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpr(@NotNull ToursParser.TrueExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpr(@NotNull ToursParser.TrueExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpression(@NotNull ToursParser.PrintExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpression(@NotNull ToursParser.PrintExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpression(@NotNull ToursParser.FunctionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpression(@NotNull ToursParser.FunctionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(@NotNull ToursParser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(@NotNull ToursParser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compoundExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compoundExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharacterExpr(@NotNull ToursParser.CharacterExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharacterExpr(@NotNull ToursParser.CharacterExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpr(@NotNull ToursParser.FalseExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpr(@NotNull ToursParser.FalseExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(@NotNull ToursParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(@NotNull ToursParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInputExpression(@NotNull ToursParser.InputExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInputExpression(@NotNull ToursParser.InputExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpr(@NotNull ToursParser.IdentifierExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpr(@NotNull ToursParser.IdentifierExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(@NotNull ToursParser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(@NotNull ToursParser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#multiplyOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyOperator(@NotNull ToursParser.MultiplyOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#multiplyOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyOperator(@NotNull ToursParser.MultiplyOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#plusOperator}.
	 * @param ctx the parse tree
	 */
	void enterPlusOperator(@NotNull ToursParser.PlusOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#plusOperator}.
	 * @param ctx the parse tree
	 */
	void exitPlusOperator(@NotNull ToursParser.PlusOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void enterBooleanOperator(@NotNull ToursParser.BooleanOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#booleanOperator}.
	 * @param ctx the parse tree
	 */
	void exitBooleanOperator(@NotNull ToursParser.BooleanOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#compareOperator}.
	 * @param ctx the parse tree
	 */
	void enterCompareOperator(@NotNull ToursParser.CompareOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#compareOperator}.
	 * @param ctx the parse tree
	 */
	void exitCompareOperator(@NotNull ToursParser.CompareOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterIntType(@NotNull ToursParser.IntTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitIntType(@NotNull ToursParser.IntTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterBoolType(@NotNull ToursParser.BoolTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitBoolType(@NotNull ToursParser.BoolTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterCharType(@NotNull ToursParser.CharTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitCharType(@NotNull ToursParser.CharTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterStrType(@NotNull ToursParser.StrTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitStrType(@NotNull ToursParser.StrTypeContext ctx);
}