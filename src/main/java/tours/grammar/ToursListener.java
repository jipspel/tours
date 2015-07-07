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
	 * Enter a parse tree produced by the {@code variablePrimitive}
	 * labeled alternative in {@link ToursParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariablePrimitive(@NotNull ToursParser.VariablePrimitiveContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variablePrimitive}
	 * labeled alternative in {@link ToursParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariablePrimitive(@NotNull ToursParser.VariablePrimitiveContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableArray}
	 * labeled alternative in {@link ToursParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariableArray(@NotNull ToursParser.VariableArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableArray}
	 * labeled alternative in {@link ToursParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariableArray(@NotNull ToursParser.VariableArrayContext ctx);
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
	 * Enter a parse tree produced by {@link ToursParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(@NotNull ToursParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#returnFunction}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#returnFunction}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(@NotNull ToursParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ToursParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void enterMainFunction(@NotNull ToursParser.MainFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#mainFunction}.
	 * @param ctx the parse tree
	 */
	void exitMainFunction(@NotNull ToursParser.MainFunctionContext ctx);
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
	 * Enter a parse tree produced by the {@code arrayExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpression(@NotNull ToursParser.ArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpression(@NotNull ToursParser.ArrayExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierExpression(@NotNull ToursParser.IdentifierExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identifierExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierExpression(@NotNull ToursParser.IdentifierExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpression(@NotNull ToursParser.FalseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpression(@NotNull ToursParser.FalseExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code ifElseExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIfElseExpression(@NotNull ToursParser.IfElseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIfElseExpression(@NotNull ToursParser.IfElseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerExpression(@NotNull ToursParser.IntegerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerExpression(@NotNull ToursParser.IntegerExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(@NotNull ToursParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(@NotNull ToursParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpression(@NotNull ToursParser.TrueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpression(@NotNull ToursParser.TrueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpression(@NotNull ToursParser.ArrayLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayLengthExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpression(@NotNull ToursParser.ArrayLengthExpressionContext ctx);
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
	 * Enter a parse tree produced by the {@code characterExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharacterExpression(@NotNull ToursParser.CharacterExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterExpression}
	 * labeled alternative in {@link ToursParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharacterExpression(@NotNull ToursParser.CharacterExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link ToursParser#compound}.
	 * @param ctx the parse tree
	 */
	void enterCompound(@NotNull ToursParser.CompoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#compound}.
	 * @param ctx the parse tree
	 */
	void exitCompound(@NotNull ToursParser.CompoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignmentWithInitialisation}
	 * labeled alternative in {@link ToursParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentWithInitialisation(@NotNull ToursParser.ArrayAssignmentWithInitialisationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignmentWithInitialisation}
	 * labeled alternative in {@link ToursParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentWithInitialisation(@NotNull ToursParser.ArrayAssignmentWithInitialisationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayAssignmentNew}
	 * labeled alternative in {@link ToursParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterArrayAssignmentNew(@NotNull ToursParser.ArrayAssignmentNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayAssignmentNew}
	 * labeled alternative in {@link ToursParser#arrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitArrayAssignmentNew(@NotNull ToursParser.ArrayAssignmentNewContext ctx);
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
	 * Enter a parse tree produced by {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(@NotNull ToursParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ToursParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(@NotNull ToursParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerType(@NotNull ToursParser.IntegerTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerType(@NotNull ToursParser.IntegerTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanType(@NotNull ToursParser.BooleanTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanType(@NotNull ToursParser.BooleanTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterCharacterType(@NotNull ToursParser.CharacterTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitCharacterType(@NotNull ToursParser.CharacterTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterStringType(@NotNull ToursParser.StringTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringType}
	 * labeled alternative in {@link ToursParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitStringType(@NotNull ToursParser.StringTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterIntegerArrayType(@NotNull ToursParser.IntegerArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitIntegerArrayType(@NotNull ToursParser.IntegerArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterBooleanArrayType(@NotNull ToursParser.BooleanArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitBooleanArrayType(@NotNull ToursParser.BooleanArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code characterArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterCharacterArrayType(@NotNull ToursParser.CharacterArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code characterArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitCharacterArrayType(@NotNull ToursParser.CharacterArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterStringArrayType(@NotNull ToursParser.StringArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringArrayType}
	 * labeled alternative in {@link ToursParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitStringArrayType(@NotNull ToursParser.StringArrayTypeContext ctx);
}