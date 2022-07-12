public class Quadrado {
    //Crie uma classe chamada Quadrado que possua os atributos double lado, implemente a Interface FormaGeometrica realizando a sobrescrita (Overload) do método calculaArea() calculando e exibindo o sua respectiva área. A classe cubo é filha da classe quadrado.
    protected double lado;
    public Quadrado(double lado){
        this.lado = lado;
    }
    public double calculaArea(){
        return lado * lado;
    }
    


}
