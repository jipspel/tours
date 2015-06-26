// Generated from C:/Users/Jip/Documents/tours/src/main/java/tours/grammar\Tours.g4 by ANTLR 4.5
package tours.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ToursParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ToursVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ToursParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull ToursParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull ToursParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull ToursParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull ToursParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(@NotNull ToursParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ToursParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStatement}
	 * labeled alternative in {@link ToursParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(@NotNull ToursParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputStatement}
	 * labeled alternative in {@link ToursParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(@NotNull ToursParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link ToursParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(@NotNull ToursParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatement}
	 * labeled alternative in {@link ToursParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(@NotNull ToursParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStatement}
	 * labeled alternative in {@link ToursParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(@NotNull ToursParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStatement}
	 * labeled alternative in {@link ToursParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(@NotNull ToursParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpr(@NotNull ToursParser.IntegerExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpr(@NotNull ToursParser.TrueExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanOrExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOrExpression(@NotNull ToursParser.BooleanOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(@NotNull ToursParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpr(@NotNull ToursParser.StringExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpression(@NotNull ToursParser.CompareExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code prefixExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixExpression(@NotNull ToursParser.PrefixExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compoundExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundExpression(@NotNull ToursParser.CompoundExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterExpr(@NotNull ToursParser.CharacterExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpr(@NotNull ToursParser.FalseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(@NotNull ToursParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpr}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpr(@NotNull ToursParser.IdentifierExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#prefixOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixOperator(@NotNull ToursParser.PrefixOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#multiplyOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyOperator(@NotNull ToursParser.MultiplyOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#plusOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusOperator(@NotNull ToursParser.PlusOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#booleanOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanOperator(@NotNull ToursParser.BooleanOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#compareOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareOperator(@NotNull ToursParser.CompareOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntType(@NotNull ToursParser.IntTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolType(@NotNull ToursParser.BoolTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharType(@NotNull ToursParser.CharTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strType}
	 * labeled alternative in {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrType(@NotNull ToursParser.StrTypeContext ctx);
}