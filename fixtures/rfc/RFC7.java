// Classe para o teste RFC7
package rfc;

public class RFC7 {
    public void method1() {
        method2();
    }

    public void method2() {
        method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        method5();
    }

    public void method5() {
        // Este método não faz nenhuma invocação, mas é contado
    }
}
