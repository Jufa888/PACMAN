/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacman1;
import java.util.Arrays;
/**
 *
 * @author Jufa
 */
public class Pacman1 {

    public static void main(String[] args) {
        String[][] tablero=new String[15][19];
        rellenartablero(tablero);
        leertablero(tablero);
    }
    //------------------------------MÉTODOS-------------------------------------
    //Método para rellenar tablero
    public static void rellenartablero(String[][] tablero){
    for(int i=0;i<tablero.length;i++){
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j]=" ";
            }  
        }
    //Bordes
    for (int i = 0; i < tablero.length; i++) {
            tablero[i][0]="|";
        }
    for (int i = 0; i < tablero.length; i++) {
            tablero[i][18]="|";
        }
    for (int i = 0; i < tablero[0].length; i++) {
            tablero[0][i]="-";
        }
    for (int i = 0; i < tablero[0].length; i++) {
            tablero[14][i]="-";
        }
    //Lineas de dentro saliente de bordes
    for (int i = 1; i < 3; i++) {
         tablero[i][9]="|";  
        }
    for (int i = 12; i < 14; i++) {
         tablero[i][9]="|";  
        }
    for (int i = 1; i < 4; i++) {
         tablero[8][i]="-";
         tablero[6][i]="-";
        }
    for (int i = 15; i < 18; i++) {
         tablero[8][i]="-";
         tablero[6][i]="-";
        }
    //Centro
    for (int i = 7; i < 12; i++) {
         tablero[8][i]="-";
         tablero[6][i]="|";
         tablero[6][9]=" ";
         tablero[6][8]="-";
         tablero[6][10]="-";
         tablero[8][7]="|";
         tablero[8][11]="|";
        }
    //Cuatro pares de islas de 2x2
        for (int i = 2; i < 4; i++) {
         tablero[2][i]="-";
         tablero[4][i]="-";
         tablero[11][i]=" ";
        }
    
    }
    //Método para leer tablero
    public static void leertablero(String[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(" "+tablero[i][j]+" ");    
            }
            System.out.println(" ");
        }
    }
    
}
