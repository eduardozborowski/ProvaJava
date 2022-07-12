
public class Assalariado extends Empregado {
    private String nome;
    private double salario;
    
    public Assalariado() {
        
    }
    
    public Assalariado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularSalario() {
        return salario;
    }

}
