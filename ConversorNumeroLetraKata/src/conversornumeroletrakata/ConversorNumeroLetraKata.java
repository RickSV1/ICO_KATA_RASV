/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversornumeroletrakata;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel Santos
 */
public class ConversorNumeroLetraKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje;
        int numero;
        int cont = 0;
        Conversor conversor = new Conversor();

        mensaje = JOptionPane.showInputDialog("Dame un numero");
        numero = Integer.parseInt(mensaje);

        while (cont != -1) {
            if (numero > 999999999) {

                numero = Integer.parseInt(JOptionPane.showInputDialog("El numero es muy largo escribe uno menor o igual a 999,999,999"));

            } else {
                cont = -1;
            }
        }
        if (numero > 999999) {
            mensaje = (conversor.getMillones((int) numero / 1000000)
                    + conversor.getMiles((int) (numero / 1000) % 1000)
                    + conversor.getCientos((int) numero % 1000)
                    + conversor.getDecenas((int) numero % 100)
                    + conversor.getUnidad((int) numero % 100)
                    + " (numero en palabras)\n"
                    + numero
                    + " (numero en cifra)");
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            if (numero > 999) {
                mensaje = (conversor.getMiles((int) numero / 1000)
                        + conversor.getCientos((int) numero % 1000)
                        + conversor.getDecenas((int) numero % 100)
                        + conversor.getUnidad((int) numero % 100)
                        + " (numero en palabras)\n"
                        + numero
                        + " (numero en cifra)");
                JOptionPane.showMessageDialog(null, mensaje);
            } else {
                if (numero > 99) {

                    mensaje = (conversor.getCientos((int) numero)
                            + conversor.getDecenas((int) numero % 100)
                            + conversor.getUnidad((int) numero % 100) + " (numero en palabras)\n"
                            + numero
                            + " (numero en cifra)");
                    JOptionPane.showMessageDialog(null, mensaje);
                } else {
                    if (numero > 9) {
                        mensaje = (conversor.getDecenas((int) numero)
                                + conversor.getUnidad((int) numero % 10) + " (numero en palabras)\n"
                                + numero
                                + " (numero en cifra)");
                        JOptionPane.showMessageDialog(null, mensaje);
                    } else {
                        if (numero > 0) {
                            mensaje = (conversor.getUnidad((int) numero) + " (numero en palabras)\n"
                                    + numero
                                    + " (numero en cifra)");
                            JOptionPane.showMessageDialog(null, mensaje);
                        } else {
                            mensaje = (" cero (numero en palabras)\n"
                                    + numero
                                    + " (numero en cifra)");
                            JOptionPane.showMessageDialog(null, mensaje);

                        }

                    }

                }
            }

        }
    }

}
