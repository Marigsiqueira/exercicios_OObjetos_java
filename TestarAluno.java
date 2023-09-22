public class TestarAluno {
    public static void main (String args[]){

        Aluno estudante = new Aluno();

        estudante.setNome("Mariana");
        estudante.setMatricula("2222223");
        estudante.setNota1(5.0);
        estudante.setNota2(8.5);
        estudante.setNotaReavaliacao(8.0);
        estudante.calcularMedia();
        estudante.calcularMediaFinal();

        System.out.println(estudante.toString());



    }
}
