package calculatorconundrum;

/**
 * Ejercicio 14: Calculator Conundrum
 * Concepto: Exceptions / Nullability (Manejo de excepciones y validación de nulls)
 *
 * Implementa una calculadora básica que valida entradas nulas, vacías
 * u operaciones desconocidas, y maneja división entre cero mediante excepciones personalizadas.
 */
public class CalculatorConundrum {

    /**
     * Realiza la operación aritmética y devuelve el cálculo formateado.
     * Ejemplo: calculate(10, 20, "+") -> "10 + 20 = 30"
     */
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        int result;
        switch (operation) {
            case "+":
                result = operand1 + operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                try {
                    result = operand1 / operand2;
                } catch (ArithmeticException e) {
                    throw new IllegalOperationException("Division by zero is not allowed", e);
                }
                break;
            default:
                throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }

        return operand1 + " " + operation + " " + operand2 + " = " + result;
    }
}
