public class Principal {
    public static void main(String[] args) throws Exception {
        //Em uma classe principal crie objetos do tipo Aluno, para cada objeto criado salve suas informações (nome, email,matricula) em um arquivo de texto “.txt” onde o nome do arquivo deverá ser o mesmo do objeto aluno criado.
        //Em uma classe principal crie um objeto do tipo Manipulacao, para cada objeto criado salve suas informações (nome, email,matricula) em um arquivo de texto “.txt” onde o nome do arquivo deverá ser o mesmo do objeto aluno criado.
        //Em uma classe principal crie um objeto do tipo Manipulacao, para cada objeto criado salve suas informações (nome, email,matricula) em um arquivo de texto “.txt” onde o nome do arquivo deverá ser o mesmo do objeto aluno criado.

        Aluno aluno = new Aluno("João", "jaozinho@live.com", "12345");
        Manipulacao manipulacao = new Manipulacao();
        manipulacao.salvar(aluno);
        Aluno aluno2 = new Aluno("Maria", "mariazinha@live.com", "54321");
        manipulacao.salvar(aluno2);
        Aluno aluno3 = new Aluno("Pedro", "pedrozinho@live.com", "98765");
        manipulacao.salvar(aluno3);
        Aluno aluno4 = new Aluno("Birubiru", "biru@live.com", "983765");
        manipulacao.salvar(aluno4);
    }
}

