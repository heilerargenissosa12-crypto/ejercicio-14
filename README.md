# Ejercicio 14: Calculator Conundrum

- **Concepto:** Exceptions / Nullability (Manejo de excepciones en Java)
- **Plataforma:** Exercism (Java Track)

## Descripción del Problema
Construir una calculadora elemental que valide exhaustivamente sus parámetros de entrada:
1. Si la operación es `null`: lanza `IllegalArgumentException("Operation cannot be null")`.
2. Si la operación está vacía `""`: lanza `IllegalArgumentException("Operation cannot be empty")`.
3. Si la operación no es `"+"`, `"*"`, ni `"/"`: lanza `IllegalOperationException("Operation '{operation}' does not exist")`.
4. Si se divide por cero: captura la `ArithmeticException` y lanza `IllegalOperationException("Division by zero is not allowed", e)`.
5. Si la operación es válida: retorna `"{op1} {operacion} {op2} = {resultado}"`.

## Cómo ejecutar en Visual Studio / VS Code:
Abre `Main.java` y haz clic en **Run** o presiona `F5`.
