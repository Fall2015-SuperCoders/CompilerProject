/* Generated By:JJTree: Do not edit this line. ASTElsePart.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTElsePart extends SimpleNode {
  public ASTElsePart(int id) {
    super(id);
  }

  public ASTElsePart(ExprParser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExprParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=58c04bafc064dffae9a7d9ef06a32987 (do not edit this line) */
