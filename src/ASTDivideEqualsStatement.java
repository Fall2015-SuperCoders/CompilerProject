/* Generated By:JJTree: Do not edit this line. ASTDivideEqualsStatement.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTDivideEqualsStatement extends SimpleNode {
  public ASTDivideEqualsStatement(int id) {
    super(id);
  }

  public ASTDivideEqualsStatement(ExprParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExprParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=192f0733933cc584c7c0d302eacf95cd (do not edit this line) */
