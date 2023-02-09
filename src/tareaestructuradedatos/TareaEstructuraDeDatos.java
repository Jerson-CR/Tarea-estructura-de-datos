/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaestructuradedatos;

/**
 *
 * @author jeson
 */
public class TareaEstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        int dato = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = dato;
                dato++;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println(" ");
        }
        int diagonaluno[] = new int[matriz.length];
        int diagonaldos[] = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    diagonaluno[i] = matriz[i][j];

                }
                if ((i + j) == matriz.length - 1) {
                    diagonaldos[i] = matriz[i][j];
                }

            }
        }
        int suma = 0;
        System.out.println("La suma de la primera diagonal es: ");
        for (int elemento : diagonaluno) {
            System.out.print(" " + elemento);
            suma = suma + elemento;
        }
        System.out.print(" = "+suma);
        System.out.println(" ");

        suma=0;
        System.out.println("La suma de la segunda diagonal es: ");
        for (int elemento : diagonaldos) {
            System.out.print(" " + elemento);
            suma = suma + elemento;
        }
        System.out.print(" = "+suma);
        System.out.println(" ");

    }
}