public class TestaConta {

    public static void main (String args[]){

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta();

        conta1.setNome("Fernando");
        conta1.setNumeroConta("1234");
        conta1.setSaldo(1500);
        conta1.setContaConjunta("Não");
        conta1.setSexo("Masculino");
        conta1.setIdade("29");

        conta2.setNome("Maria");
        conta2.setNumeroConta("5312");
        conta2.setSaldo(530);
        conta2.setContaConjunta("Sim");
        conta2.setSexo("Feminino");
        conta2.setIdade("45");

        conta3.setNome("Joao");
        conta3.setNumeroConta("9621");
        conta3.setSaldo(4325);
        conta3.setContaConjunta("Sim");
        conta3.setSexo("Masculino");
        conta3.setIdade("54");

        System.out.println(conta1.toString());

        System.out.println("\nInformações da Conta 2:");
        System.out.println(conta2.toString());
    
        System.out.println("\nInformações da Conta 3:");
        System.out.println(conta3.toString());
}
    }
    
    
