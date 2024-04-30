// Classe para o teste RFC10
package rfc;

public class RFC10 {
    public void method1() {
        method2(1);
        method2("test");
    }

    public void method2(int a) {
        // Este método não faz nenhuma invocação, mas é contado
    }

    public void method2(String s) {
        method3();
    }

    public void method3() {
        // Este método não faz nenhuma invocação, mas é contado
    }
}
