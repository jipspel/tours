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
	 * Visit a parse tree produced by the {@code variablePrimitive}
	 * labeled alternative in {@link ToursParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariablePrimitive(@NotNull ToursParser.VariablePrimitiveContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableArray}
	 * labeled alternative in {@link ToursParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableArray(@NotNull ToursParser.VariableArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(@NotNull ToursParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#voidFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#returnFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#mainFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunction(@NotNull ToursParser.MainFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull ToursParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#returnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlock(@NotNull ToursParser.ReturnBlockContext ctx);
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
	 * Visit a parse tree produced by {@link ToursParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(@NotNull ToursParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpression(@NotNull ToursParser.ArrayExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpression(@NotNull ToursParser.PrintExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierExpression(@NotNull ToursParser.IdentifierExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseExpression(@NotNull ToursParser.FalseExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code ifElseExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseExpression(@NotNull ToursParser.IfElseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerExpression(@NotNull ToursParser.IntegerExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpression(@NotNull ToursParser.FunctionExpressionContext ctx);
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
	 * Visit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringExpression(@NotNull ToursParser.StringExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueExpression(@NotNull ToursParser.TrueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthExpression(@NotNull ToursParser.ArrayLengthExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(@NotNull ToursParser.PlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterExpression(@NotNull ToursParser.CharacterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(@NotNull ToursParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputExpression(@NotNull ToursParser.InputExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanAndExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanAndExpression(@NotNull ToursParser.BooleanAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ToursParser#compound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound(@NotNull ToursParser.CompoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignmentWithInitialisation}
	 * labeled alternative in {@link ToursParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignmentWithInitialisation(@NotNull ToursParser.ArrayAssignmentWithInitialisationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignmentNew}
	 * labeled alternative in {@link ToursParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignmentNew(@NotNull ToursParser.ArrayAssignmentNewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignmentExpression}
	 * labeled alternative in {@link ToursParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignmentExpression(@NotNull ToursParser.ArrayAssignmentExpressionContext ctx);
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
	 * Visit a parse tree produced by {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableType(@NotNull ToursParser.VariableTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerType(@NotNull ToursParser.IntegerTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanType(@NotNull ToursParser.BooleanTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterType(@NotNull ToursParser.CharacterTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringType(@NotNull ToursParser.StringTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerArrayType(@NotNull ToursParser.IntegerArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanArrayType(@NotNull ToursParser.BooleanArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code characterArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterArrayType(@NotNull ToursParser.CharacterArrayTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringArrayType(@NotNull ToursParser.StringArrayTypeContext ctx);
}