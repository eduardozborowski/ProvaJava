public class Cubo extends Quadrado{

    public Cubo(double lado) {
        super(lado);
    }
    //Crie uma classe chamada Cubo que herde as características do quadro e possua um método calculaVolume() calcule e exiba o seu respectivo volume.
        public double calculaVolume() {
        return super.calculaArea() * lado;
    }
}
