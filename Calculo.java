/*Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar a tela o 
valor da sua área, perímetro e diagonal. */

import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        double largura;
        double altura;
        double area;
        double perimetro;
        double diagonal;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a largura do retângulo: ");
        largura = sc.nextDouble();

        System.out.print("Digite a altura do retângulo: ");
        altura = sc.nextDouble();

        area = calcularArea(largura, altura);
        perimetro = calcularPerimetro(largura, altura);
        diagonal = calcularDiagonal(largura, altura);

        System.out.println("Área: " + area);
        System.out.println("Perímetro: " + perimetro);
        System.out.println("Diagonal : " + diagonal);
    }

    public static double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public static double calcularPerimetro(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public static double calcularDiagonal(double largura, double altura) {
        return Math.sqrt(largura * largura + altura * altura); //math.sqrt tira a raiz quadrada
    }
}


