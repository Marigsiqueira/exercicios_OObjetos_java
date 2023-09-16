/*Fazer um programa para ler os dados de um funcionário (nome, salário Bruto e Desconto). Em seguida, mostrar 
os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em 
uma porcentagem dada e mostrar novamente os dados do funcionário. */

import java.util.Scanner;

public class Funcionario {
    String nmFuncionario;
    double salarioBruto;
    double desconto;
    double porcentagem;
    
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        Funcionario pessoa= new Funcionario();

        pessoa.nmFuncionario = "Mariana Gonçalves de Siqueira"; 
        pessoa.salarioBruto = 5000;
        pessoa.desconto= 1000;

        System.out.println( "Nome: " + pessoa.nmFuncionario);
        System.out.println("Salário: " + pessoa.salarioBruto);
        System.out.println("CPF do cliente: " + pessoa.desconto);
        System.out.println("Dados do funcioário: " + pessoa.nmFuncionario + "," + pessoa.salarioBruto);

        System.out.println("Deseja aumentar o salário em qual porcentagem?: ");
        pessoa.porcentagem = sc.nextDouble();

        pessoa.aumentarSalario();
        System.out.println("Dados do funcionário: " + pessoa.nmFuncionario+ ", " + pessoa.salarioBruto);
        
    } 

    public void aumentarSalario( ){ 
    salarioBruto = salarioBruto + (salarioBruto * porcentagem/100);
    }

   
}
