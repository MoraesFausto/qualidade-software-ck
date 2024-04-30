public class TypeDeclarationVisitor {
    private int cbo;

    public int getCbo() {
        return cbo;
    }

    public void visit(TypeDeclaration node) {
        // Lógica para visitar o TypeDeclaration
        cbo++;
    }
}
