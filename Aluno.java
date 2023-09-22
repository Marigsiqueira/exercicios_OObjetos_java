public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;
    private double notaReavaliacao;

    public static void main (String args[]){
        

    }
    
    public Aluno(){
        
    }

    public Aluno(String nome, String matricula, double nota1, double nota2, double notaReavaliacao) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaReavaliacao = notaReavaliacao;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String NomeEstudante){
        nome= NomeEstudante;
    }   

    public String getMatricula(){
            return matricula;
        }

        public void setMatricula(String numMatricula){
            matricula = numMatricula;
        }
    
    public double getNota1(){
            return nota1;
        }

        public void setNota1(double valorNota1){
            nota1 = valorNota1;
        }
    public double getNota2(){
            return nota2;
        }

        public void setNota2(double valorNota2){
            nota2 = valorNota2;
        }
    
    public double getNotaReavaliacao(){
            return notaReavaliacao;
        }
    
    public void setNotaReavaliacao(double valorNotaReavaliacao){
            notaReavaliacao = valorNotaReavaliacao;
        }


    public double calcularMedia(){
        return (nota1+nota2)/2;

    }

    public double calcularMediaFinal(){
        if( calcularMedia() >= 6){
            return calcularMedia();
        } else {
            return (calcularMedia() + notaReavaliacao) / 2;
        }
    }

    public String toString() {
        return "nome= " + nome + "\n" + "matricula= " + matricula + "\n"+ "nota1= " + nota1 +"\n"+ "nota2= "+ 
        nota2 +"\n"+ "nota reavaliacao= "+ notaReavaliacao +"\n"+ "Media = "+ calcularMedia() +"\n" +
         "Media Final= "+ calcularMediaFinal() +"\n";

    }
}
