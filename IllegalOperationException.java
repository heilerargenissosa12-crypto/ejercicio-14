package calculatorconundrum;

/**
 * Excepción personalizada no comprobada (unchecked exception)
 * para operaciones matemáticas inválidas o no soportadas.
 */
public class IllegalOperationException extends RuntimeException {

    public IllegalOperationException(String errorMessage) {
        super(errorMessage);
    }

    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
