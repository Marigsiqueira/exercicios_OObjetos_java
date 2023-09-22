public class Conta {
    private String nome;
    private String sexo;
    private String idade;
    private String numeroConta;
    private int saldo;
    private String contaConjunta;

    public static void main (String args[]){


    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo( int valor){
        saldo= valor;
    }   

    public String getNumeroConta(){
            return numeroConta;
        }

        public void setNumeroConta(String valor){
            numeroConta = valor;
        }
    
    public String getIdade(){
            return idade;
        }

        public void setIdade(String IdaDe){
            idade = IdaDe;
        }

    public String getSexo(){
            return sexo;
        }

        public void setSexo(String SeXo){
            sexo = SeXo;
        }

    public String getNome(){
            return nome;
        }

        public void setNome(String NomE){
            nome = NomE;
        }

    public String getContaConjunta(){
            return contaConjunta;
        }

        public void setContaConjunta(String CC){
            contaConjunta = CC;
        }

        public void Sacar( int valor){
        if (saldo >0){
            saldo= saldo - valor;
        }
  
    }
    public void depositar( int valorDeposito){
        saldo= saldo + valorDeposito;
    }

    public String toString() {

        return "nome= " + nome + "\n" + "sexo= " + sexo + "\n"+ "idade= " + idade +"\n"+ "conta conjunta= "+ 
        contaConjunta +"\n"+ "Numero conta= "+ numeroConta +"\n"+ "Saldo= " + saldo + "\n";

    }

}
