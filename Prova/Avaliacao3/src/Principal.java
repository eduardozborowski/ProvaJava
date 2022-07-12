
import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado do quadrado: "));
        Quadrado quadrado = new Quadrado(lado);
        JOptionPane.showMessageDialog(null, "Área do quadrado: " + quadrado.calculaArea());
        lado = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado do cubo: "));
        Cubo cubo = new Cubo(lado);
        JOptionPane.showMessageDialog(null, "Volume do cubo: " + cubo.calculaVolume());
    }
    
}
