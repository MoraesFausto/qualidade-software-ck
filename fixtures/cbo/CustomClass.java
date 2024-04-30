package cbo;

import com.google.common.reflect.TypeLiteral;

public class CustomClass {

    // Método que sobrescreve visit(TypeLiteral node) com a anotação @Override
    @Override
    public void visit(TypeLiteral node) {
        // Conteúdo fornecido: criação de array de B[] com instâncias de C[]
        B[] b = new C[10];
        // Retorno do array de B[]
        coupleTo(b);
    }

    // Classes A, B e C para fins de exemplo
    static class A {}
    static class B extends A {}
    static class C extends B {}
}
