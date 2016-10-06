
package boletin2_10;

import javax.swing.JOptionPane;


public class Boletin2_10 {

    
    public static void main(String[] args) {
    int billetes100,billetes20,billetes5,moedas1,cantidad;
    cantidad=Integer.parseInt(JOptionPane.showInputDialog("cantidad de dinero"));
    billetes100=cantidad/100;
    billetes20=cantidad%100/20;
    billetes5=cantidad%20/5;
    moedas1=cantidad%5/1;
    JOptionPane.showMessageDialog(null, "El total de billetes de 100="+billetes100+"cantidad de billetes de 20="+billetes20+"cantidad de billetes de 5="+billetes5+"cantidad de moedas de 1 euro="+moedas1);
     }
    
}
