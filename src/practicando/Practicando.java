/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicando;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Practicando {
 private static Cuenta cuenta = new Cuenta();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;
        do {  
            opc = menu();
            switch (opc) {
                case 1:
                    ingresarSaldoInicial();
                    break;
                case 2:
                    ingresarDinero();
                    break;
                case 3:
                    retirarDinero();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "su saldo actual es de: "+verSaldo());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        } while (opc != 5);
    }
    
    private static int menu(){
        int opc;
        StringBuilder sb = new StringBuilder();
        sb.append("1. ingreso inicial\n");
        sb.append("2. ingreso\n");
        sb.append("3. egreso\n");
        sb.append("4. ver total\n");
        sb.append("5. salir");
        opc = Integer.parseInt(JOptionPane.showInputDialog(null, sb, "Opciones", 3));
        return opc;
    }
    
    private static void ingresarSaldoInicial(){
        cuenta = new Cuenta();
        double saldoIngresado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su saldo inicial", "Saldo unicial", 3));
        cuenta.ingresarSaldo(saldoIngresado);
        if (saldoIngresado <= 10.00) {
            JOptionPane.showMessageDialog(null, "El saldo inicial no puede ser menor a 10.00", "Error", 1);
        } else{
            JOptionPane.showMessageDialog(null, "Su saldo de "+saldoIngresado+ " ha sido ingresado con exito", "Exito", 1);
        }
    }
    
    private static double verSaldo(){
        return cuenta.getSaldo();
    }
    
    private static void ingresarDinero(){
        double saldoIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a su cuenta"));
        if (saldoIngresado <= 1.00) {
            JOptionPane.showMessageDialog(null, "No puedo ingresar menos de un dolar");
        } else {
            cuenta.ingresando(saldoIngresado);
            JOptionPane.showMessageDialog(null, "Dinero ingresado correctamente");
        }
    }
    
    private static void retirarDinero(){
        double saldoIngresado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la que desea retirar"));
        double saldoExistente = cuenta.getSaldo();
        System.out.println(saldoExistente);
        if (saldoIngresado > saldoExistente) {
            JOptionPane.showMessageDialog(null, "no puede retirar mas de lo que tienes");
        } else {
            if (saldoIngresado <= 1.00) {
            JOptionPane.showMessageDialog(null, "No puede retirar menos de un dolar");
            } else {
                cuenta.retirando(saldoIngresado);
                JOptionPane.showMessageDialog(null, "Dinero retirado correctamente");
            }
        }
    }
}
