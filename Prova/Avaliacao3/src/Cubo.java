public class Cubo extends Quadrado {

    public Cubo(double lado) {
        super(lado);
    }

    public double calculaVolume() {
        return super.calculaArea() * lado;
    }
   }