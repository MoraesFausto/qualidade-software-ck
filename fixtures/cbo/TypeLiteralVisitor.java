public class TypeLiteralVisitor {
    private int cbo;

    public int getCbo() {
        return cbo;
    }

    public void visit(TypeLiteral node) {
        // Lógica para visitar o TypeLiteral
        cbo++;
    }
}
