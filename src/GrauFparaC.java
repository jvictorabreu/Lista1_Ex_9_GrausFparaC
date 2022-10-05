import java.util.Scanner;

// 8- Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
//      C = 5 * ((F-32) / 9).

public class GrauFparaC {
    public static void main(String[] args){

        // Requisito 1: Solicitar a temperatura em Fahrenheit.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Digite a temperatura em grau Fahrenheit: ");
        double grauF = userInput.nextDouble();
        userInput.close();

        // Requisito 2: Transformar a temperatura em Celsius.
        double celsius = 5 * ((grauF - 32) / 9);

        System.out.println(grauF + "ºF equivalem a " + celsius + "ºC.");
    }
}