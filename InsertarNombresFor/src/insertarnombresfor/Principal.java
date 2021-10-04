/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package insertarnombresfor;

/**
 *
 * @author Alumno mañana
 */
public class Principal {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //declarar matriz
        int edades[][] = new int[3][2];
        edades[0][0] = 5;
        edades[0][1] = 8;
        edades[1][0] = 3;
        edades[1][1] = 7;
        edades[2][0] = 4;
        edades[2][1] = 2;

        imprimir(edades);
    }

    public static void imprimir(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("[" + i + "]" + "[" + j + "] --> " + matriz[i][j]);
            }

        }
    }
}
