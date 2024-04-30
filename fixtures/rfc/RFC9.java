// Classe para o teste RFC9
package rfc;

import java.util.function.Consumer;

public class RFC9 {
    public void method1() {
        method2(() -> {
            method3();
        });
    }

    public void method2(Consumer<Void> consumer) {
        consumer.accept(null);
    }

    public void method3() {
        // Este método não faz nenhuma invocação, mas é contado
    }
}
