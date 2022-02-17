/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.sergiomateospuerta.sergiomateos_ej2.exud4;

/**
 *
 * @author Sergio Mateos
 */
public class conversor {
    public static void main(String[] argumentos) {
        float celsius = 0f;
        // Cálculo conversión
        float fahrenheit = celsiusAFahrenheit(celsius);
        System.out.printf("%f grados celsius son %f grados fahrenheit", celsius, fahrenheit);
    }

    public static float celsiusAFahrenheit(float celsius) {
        return (celsius * 1.8f) + 32.0f;
    }

    public static float fahrenheitACelsius(float fahrenheit) {
        return (fahrenheit - 32.0f) / 1.8f;
    }
}