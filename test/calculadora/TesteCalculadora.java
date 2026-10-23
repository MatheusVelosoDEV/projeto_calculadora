package calculadora;

/**
 * Testes executáveis da calculadora, sem dependências externas.
 * Execute com {@code java -ea -cp out calculadora.TesteCalculadora}.
 *
 * @author FinançApp
 * @version 1.0
 */
public final class TesteCalculadora {
    private static int aprovados;

    private TesteCalculadora() { }

    /** Executa todos os casos de teste e encerra com erro se algum falhar.
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        verificar("soma", 7, calculadora.calc(3, 4, "+"));
        verificar("subtração", 6, calculadora.calc(10, 4, "-"));
        verificar("multiplicação", 42, calculadora.calc(6, 7, "*"));
        verificar("divisão inteira", 4, calculadora.calc(20, 5, "/"));
        verificar("divisão com resto", 2, calculadora.calc(7, 3, "/"));
        verificarDivisaoPorZero(calculadora);
        verificarOperacaoInvalida(calculadora);
        System.out.println("Resultado: " + aprovados + "/7 testes aprovados.");
    }

    private static void verificar(String caso, int esperado, int obtido) {
        if (esperado != obtido) {
            throw new AssertionError(caso + ": esperado " + esperado + ", obtido " + obtido);
        }
        aprovados++;
        System.out.println("[PASSOU] " + caso + " | esperado=" + esperado + " | obtido=" + obtido);
    }

    private static void verificarDivisaoPorZero(Calculadora calculadora) {
        try {
            calculadora.calc(8, 0, "/");
            throw new AssertionError("divisão por zero deveria lançar ArithmeticException");
        } catch (ArithmeticException esperada) {
            aprovados++;
            System.out.println("[PASSOU] divisão por zero | exceção=" + esperada.getClass().getSimpleName());
        }
    }

    private static void verificarOperacaoInvalida(Calculadora calculadora) {
        verificar("operação inválida", 0, calculadora.calc(2, 2, "%"));
    }
}



