public class Aluno {
    //Crie uma Classe do tipo Aluno que contenha os atributos: nome, email, matrícula, e um método construtor contendo todos os argumentos da classe.
    private String nome;
    private String email;
    private String matricula;

    public Aluno(String nome, String email, String matricula) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
