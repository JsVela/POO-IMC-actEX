/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imc;

import javax.swing.JOptionPane;

/**
 *
 * @author JESUS PARGA VELA
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        // TODO code application logic here
        Calculo calculadora = new Calculo();
        JOptionPane.showMessageDialog(null, "Calculadora del Índice de Masa Corporal");
        String opc;
        int ventana=0 ;
        while (ventana != 4) {
           
            opc = JOptionPane.showInputDialog("Opciones:"+'\n'+"   1-peso"+'\n'+"   2-estatura"+'\n'+"   3-imc"+'\n'+"   4-salir"+'\n'+"¿Cuál opción deseas: ?");
            ventana = Integer.parseInt(opc);
            Calculo.mensajes(ventana, calculadora);
        }
    }
}
