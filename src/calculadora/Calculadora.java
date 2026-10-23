package calculadora;

/**
 * Calculadora de operações matemáticas básicas para o FinançApp.
 *
 * @author FinançApp
 * @version 1.0
 */
public class Calculadora {

    /** Cria a calculadora. */
    public Calculadora() { }

    /**
     * Executa uma operação aritmética entre dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param op operador: +, -, * ou /
     * @return resultado inteiro; zero para operador inválido
     * @throws ArithmeticException quando houver tentativa de divisão por zero
     */
    public int calc(int a, int b, String op) {
        if (op == null) {
            System.out.println("Operação inválida: informe +, -, * ou /.");
            return 0;
        }
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Não é possível dividir por zero.");
                }
                return a / b;
            default:
                System.out.println("Operação inválida: informe +, -, * ou /.");
                return 0;
        }
    }
}
