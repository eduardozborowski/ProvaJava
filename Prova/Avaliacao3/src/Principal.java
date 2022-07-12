
import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado do quadrado: "));
        Quadrado quadrado = new Quadrado(lado);
        Cubo cubo = new Cubo(lado);
        JOptionPane.showMessageDialog(null, "Área do quadrado: " + quadrado.calculaArea());
        JOptionPane.showMessageDialog(null, "Volume do cubo: " + cubo.calculaVolume());
    }
    
}
