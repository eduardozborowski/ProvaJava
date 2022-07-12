
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Manipulacao {
    //Crie também uma classe para manipulação de arquivos .txt que vai manter o registo dos cadastros de alunos, arquivo de texto “.txt” onde o nome do arquivo deverá ser o mesmo do objeto aluno criado. E o
    //Crie um método para salvar os dados do aluno no arquivo de texto.
    public void salvar(Aluno aluno) throws Exception {
        String nomeArquivo = aluno.getNome() + ".txt";
        FileWriter fw = new FileWriter(nomeArquivo);
        fw.write(aluno.getNome());
        fw.write("\n");
        fw.write(aluno.getEmail());
        fw.write("\n");
        fw.write(aluno.getMatricula());
        fw.close();
    }




}