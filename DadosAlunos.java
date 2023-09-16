public class DadosAlunos {
    int RA;
    String nome;
    String endereco;
    String curso;

public static void main (String args[]){
    DadosAlunos aluno = new DadosAlunos();

    aluno.RA = 1234567;
    aluno.nome= "Mariana";
    aluno.endereco= "Campanário, Diadema";
    aluno.curso = "Desenvolvimento de Software";


    System.out.println("RA do aluno: " + aluno.RA);
    System.out.println("Nome do aluno: " + aluno.nome);
    System.out.println("Endereço do aluno: " + aluno.endereco);
    System.out.println("Curso do aluno: " + aluno.curso);

    aluno.alterarEndereco("Montanhao, SBC");
    System.out.println("Endereço atualizado: " + aluno.endereco);

    aluno.alterarCurso("Cosméticos");
    System.out.println("Curso atual: " + aluno.curso);

}

public void alterarEndereco (String adress){
    endereco = adress;

}

public void alterarCurso (String course){
    curso = course;
}

}

