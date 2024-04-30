public class ParameterizedTypeVisitor {
    private int cbo;

    public int getCbo() {
        return cbo;
    }

    public void visit(ParameterizedType node) {
        // Lógica para visitar o ParameterizedType
        cbo++;
    }
}
