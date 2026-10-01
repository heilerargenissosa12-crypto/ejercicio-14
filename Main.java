package calculatorconundrum;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("  Ejercicio 14: Calculator Conundrum (Exceptions)");
        System.out.println("==================================================");

        CalculatorConundrum calc = new CalculatorConundrum();

        // 1. Suma válida
        String sum = calc.calculate(16, 51, "+");
        System.out.println("1. Suma (16 + 51): " + sum + " (Esperado: 16 + 51 = 67)");

        // 2. Multiplicación válida
        String mult = calc.calculate(32, 6, "*");
        System.out.println("2. Multiplicacion (32 * 6): " + mult + " (Esperado: 32 * 6 = 192)");

        // 3. División válida
        String div = calc.calculate(512, 4, "/");
        System.out.println("3. Division (512 / 4): " + div + " (Esperado: 512 / 4 = 128)");

        // 4. División entre cero -> IllegalOperationException
        boolean caughtDivZero = false;
        try {
            calc.calculate(10, 0, "/");
        } catch (IllegalOperationException e) {
            caughtDivZero = true;
            System.out.println("\n4. Division por cero capturada correctamente: \"" + e.getMessage() + "\"");
        }

        // 5. Operación no soportada -> IllegalOperationException
        boolean caughtBadOp = false;
        try {
            calc.calculate(10, 2, "**");
        } catch (IllegalOperationException e) {
            caughtBadOp = true;
            System.out.println("5. Operacion invalida capturada: \"" + e.getMessage() + "\"");
        }

        // 6. Operación null -> IllegalArgumentException
        boolean caughtNull = false;
        try {
            calc.calculate(10, 2, null);
        } catch (IllegalArgumentException e) {
            caughtNull = true;
            System.out.println("6. Operacion null capturada: \"" + e.getMessage() + "\"");
        }

        boolean ok = sum.equals("16 + 51 = 67") &&
                     mult.equals("32 * 6 = 192") &&
                     div.equals("512 / 4 = 128") &&
                     caughtDivZero && caughtBadOp && caughtNull;

        System.out.println("\n[RESULTADO]: " + (ok ? "TODAS LAS PRUEBAS PASARON EXITOSAMENTE" : "ERROR EN LAS PRUEBAS"));
        System.out.println("==================================================\n");
    }
}
