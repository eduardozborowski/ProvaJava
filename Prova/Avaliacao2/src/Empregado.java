
public class Empregado {
    private String nome;
    private double salario;
    
    public Empregado() {
        
    }
    
    public Empregado(String nome, double salario) {
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
    //exibe salario
    public void exibirSalario() {
        System.out.println("Salario: " + salario);
    }

    void setValorHora(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setHorasTrabalhadas(double parseDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
