public class Banco { // nome da Classe
    int numConta; //atributos
    String nmCliente;
    String cpfCliente;
    int saldoConta;

    public static void main (String args[]){
        Banco bc = new Banco(); //instancia do objeto da Classe banco

        bc.numConta = 123;  
        bc.nmCliente = "Mariana Gonçalves de Siqueira";
        bc.cpfCliente = "50050050050";
        bc.saldoConta = 10000;

        System.out.println( "Numero da conta: " + bc.numConta);
        System.out.println("Nome do cliente: " + bc.nmCliente);
        System.out.println("CPF do cliente: " + bc.cpfCliente);
        System.out.println("Saldo da conta: " + bc.saldoConta);


        bc.depositar(1000); //utilizar o método dentro do main
        System.out.println("Saldo da conta após depósito: " + bc.saldoConta);

        bc.sacar(2000);
        System.out.println("Saldo da conta após saque: " + bc.saldoConta);
    } 

    public void depositar( int valor){ //método depositar
    saldoConta = saldoConta + valor;    
    }

    public void sacar( int valor){
        saldoConta= saldoConta - valor;
    }
}

    