/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatorias.diagonales;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class SumatoriasDiagonales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO codeapplication logic here
        Scanner entradateclado= new Scanner(System.in);
        int filacolumna, suma=0,ultracontador=0;
        int[][] Matriz= new int[50][50];
        System.out.println("Por favor ingrese el numero de filas y de columnas: ");
        filacolumna=Integer.parseInt(entradateclado.nextLine());
        ultracontador=filacolumna;
        for (int filas=1;filas<=filacolumna;filas++)
        {
            for (int columnas=1;columnas<=filacolumna;columnas++)
            {
                System.out.println("Matriz ["+filas+"] "+" ["+columnas+"] =");
                Matriz[filas][columnas]=Integer.parseInt(entradateclado.nextLine());
            if(filas==columnas)
            {
                suma=suma+Matriz[filas][columnas];
            }
           
            if(ultracontador==columnas)
            {
                suma=suma+Matriz[filas][columnas];      
            }
            }
            ultracontador--;
        }
        for (int filas=1;filas<=filacolumna;filas++)
        {
            for (int columnas=1;columnas<=filacolumna;columnas++)
            {
                System.out.print( Matriz[filas][columnas]+" ");
            }
             System.out.println();
        }
        if (suma<0)
        {
            suma=-suma;
            System.out.println("El valor absoluto de la suma de las diagonales de la matriz de "+filacolumna+" x "+filacolumna+" es = "+suma );
        }
        else
        {
        System.out.println("El valor absoluto de la suma de las diagonales de la matriz de "+filacolumna+" x "+filacolumna+" es = "+suma );
        }
    }
}
