public class ExpressionVisitor {
    private int cbo;

    public int getCbo() {
        return cbo;
    }

    public void visit(Expression node) {
        // Lógica para visitar a Expressão
        cbo++;
    }
}
