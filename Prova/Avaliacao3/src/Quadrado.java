    //Crie uma classe chamada Quadrado que possua os atributos double lado e implementa a interface FormaGeometrica e realiza a sobrescrita (Overload) do método calculaArea() calculando e exibindo o sua respectiva área.
    public class Quadrado implements FormaGeometrica {
        protected double lado;
        
        public Quadrado(double lado) {
            this.lado = lado;
        }
        
        @Override
        public double calculaArea() {
            return lado * lado;
        }
    }
