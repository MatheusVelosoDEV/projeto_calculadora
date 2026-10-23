package calculadora;

/**
 * Calculadora de operações matemáticas básicas para o FinançApp.
 *
 * @author FinançApp
 * @version 2.0
 */
public class Calculadora {

    /** Cria a calculadora. */
    public Calculadora() { }

    /**
     * Executa uma operação aritmética entre dois números inteiros.
     * A divisão retorna um inteiro, preservando o contrato do método da atividade.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param op operador: +, -, * ou /
     * @return resultado inteiro da operação; retorna zero para operador inválido
     * @throws ArithmeticException quando houver tentativa de divisão por zero
     */
    public int calc(int a, int b, String op) {
        if (op == null) return operacaoInvalida();
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return dividir(a, b);
            default: return operacaoInvalida();
        }
    }

    /**
     * Divide os operandos e preserva a divisão inteira da API.
     *
     * @param dividendo valor a dividir
     * @param divisor valor pelo qual dividir
     * @return quociente inteiro
     * @throws ArithmeticException se o divisor for zero
     */
    private int dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return dividendo / divisor;
    }

    /** Informa erro de operador e mantém o retorno definido pela atividade. */
    private int operacaoInvalida() {
        System.out.println("Operação inválida: informe +, -, * ou /.");
        return 0;
    }
}
