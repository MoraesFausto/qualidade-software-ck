// Classe para o teste RFC8
package rfc;

public class RFC8 {
    public void method1() {
        method2();
    }

    public void method2() {
        int a = 0;
        if (a == 0) {
            method3();
        }
    }

    public void method3() {
        // Este método não faz nenhuma invocação, mas é contado
    }
}
