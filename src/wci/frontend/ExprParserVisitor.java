/* Generated By:JavaCC: Do not edit this line. ExprParserVisitor.java Version 5.0 */
package wci.frontend;

public interface ExprParserVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTProgram node, Object data);
  public Object visit(ASTPrimitiveType node, Object data);
  public Object visit(ASTExpr node, Object data);
  public Object visit(ASTSimpleExpr node, Object data);
  public Object visit(ASTTerm node, Object data);
  public Object visit(ASTFactor node, Object data);
  public Object visit(ASTStatement node, Object data);
  public Object visit(ASTIfPart node, Object data);
  public Object visit(ASTElseIfPart node, Object data);
  public Object visit(ASTElsePart node, Object data);
  public Object visit(ASTLiteral node, Object data);
  public Object visit(ASTIntegerConst node, Object data);
  public Object visit(ASTRealConst node, Object data);
  public Object visit(ASTStringConst node, Object data);
  public Object visit(ASTSwitchPart node, Object data);
  public Object visit(ASTComparisonOperator node, Object data);
  public Object visit(ASTCases node, Object data);
  public Object visit(ASTAssignment node, Object data);
  public Object visit(ASTDeclaration node, Object data);
  public Object visit(ASTIncrementStatement node, Object data);
  public Object visit(ASTDecrementStatement node, Object data);
  public Object visit(ASTPlusEqualsStatement node, Object data);
  public Object visit(ASTMinusEqualsStatement node, Object data);
  public Object visit(ASTStarEqualsStatement node, Object data);
  public Object visit(ASTDivideEqualsStatement node, Object data);
  public Object visit(ASTDataTypes node, Object data);
  public Object visit(ASTHashmap node, Object data);
  public Object visit(ASTSet node, Object data);
  public Object visit(ASTList node, Object data);
}
/* JavaCC - OriginalChecksum=80f9dda529f0bb6f8b903a7fd1e0caec (do not edit this line) */
