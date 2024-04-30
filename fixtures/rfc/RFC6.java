// Classe para o teste RFC6
package rfc;

public class RFC6 {
    public void method1() {
        method2();
        method3();
        method4();
    }

    public void method2() {
        method3();
    }

    public void method3() {
        // Este método não faz nenhuma invocação, mas é contado
    }

    public void method4() {
        method3();
    }
}
