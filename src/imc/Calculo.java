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
public class Calculo {

    //Atributos: declaras las variables con sus respectivos modificadores de acceso
    private double estatura;
    private double peso;

    //Constructor: les das(inicializas) valores a las variables
    public Calculo() {

    }

    public Calculo(double estatura, double peso) {
        this.estatura = estatura;
        this.peso = peso;

    }
    //Métodos: son las acciones que realizará e objeto

    /**
     *
     * @return
     */
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double calcularIMC() {

        return peso / (estatura * estatura);

    }

   public static void mensajes(int ventana, Calculo calculadora) {
        String p;
        String e;
        double imc;
        
        switch (ventana) {
            case 1:
                p = JOptionPane.showInputDialog("Dame tu peso?: ");
                calculadora.setPeso(Double.parseDouble(p));
                break;
            case 2:
                e = JOptionPane.showInputDialog("Dame tu estatura?: ");
                calculadora.setEstatura(Double.parseDouble(e));
                break;
            case 3:
                imc = calculadora.calcularIMC();
                JOptionPane.showMessageDialog(null, "Tu imc es: " + imc);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Adios");
                break;
            default:
                break;
        }
    }

}
