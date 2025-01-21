/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pacman1;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Jufa
 */
public class Pacman1 {
    String[][] tablero=new String[15][19];
    Personaje pacman=new Personaje("P",9,9);
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[][] tablero=new String[15][19];
        rellenartablero(tablero);
        Personaje pacman=new Personaje("P",9,9);
        Personaje fantasma1= new Personaje("F",6,9);
        Personaje fantasma2= new Personaje("F",7,9);
        Personaje fantasma3= new Personaje("F",7,8);
        Personaje fantasma4= new Personaje("F",7,10);
        tablero[9][9]= pacman.getNombre();
        tablero[6][9]= fantasma1.getNombre();
        tablero[7][9]= fantasma2.getNombre();
        tablero[7][8]= fantasma3.getNombre();
        tablero[7][10]= fantasma4.getNombre();
        leertablero(tablero);
        Boolean condicion=true;
        while(condicion=true){
            
            String direccion= sc.nextLine();
            switch (direccion) {
                case "d":
                if(tablero[pacman.getY()][pacman.getX()+1].equals("|")){
                    leertablero(tablero);
                break;
                }
                tablero[pacman.getY()][pacman.getX()]=" ";
                pacman.x=pacman.getX()+1;
                tablero[pacman.getY()][pacman.getX()]="P";
                leertablero(tablero);
                break;
                case "a":
                if(tablero[pacman.getY()][pacman.getX()-1].equals("|")){
                    leertablero(tablero);
                break;
                }
                tablero[pacman.getY()][pacman.getX()]=" ";
                pacman.x=pacman.getX()-1;
                tablero[pacman.getY()][pacman.getX()]="P";
                leertablero(tablero);
                break;
                case "w":
                if(tablero[pacman.getY()-1][pacman.getX()].equals("|")||tablero[pacman.getY()-1][pacman.getX()].equals("-")){
                    leertablero(tablero);
                break;
                }
                tablero[pacman.getY()][pacman.getX()]=" ";
                pacman.y=pacman.getY()-1;
                tablero[pacman.getY()][pacman.getX()]="P";
                leertablero(tablero);
                break;
                case "s":
                if(tablero[pacman.getY()+1][pacman.getX()].equals("|")||tablero[pacman.getY()+1][pacman.getX()].equals("-")){
                    leertablero(tablero);
                break;
                }
                tablero[pacman.getY()][pacman.getX()]=" ";
                pacman.y=pacman.getY()+1;
                tablero[pacman.getY()][pacman.getX()]="P";
                leertablero(tablero);
                break;
                case "e":
                condicion=false;
                break;
            }
        
        
        }

    }
    //------------------------------MÉTODOS-------------------------------------
    //Método para rellenar tablero
    public static void rellenartablero(String[][] tablero){
    for(int i=0;i<tablero.length;i++){
            for (int j = 0; j < tablero[0].length; j++) {
                tablero[i][j]=".";
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
         tablero[10][i]="-";
         tablero[4][i]="-";
        }
    //Pares de islas y primeras islas de abajo de 2x2
        for (int i = 2; i < 4; i++) {
         tablero[2][i]="-";
         tablero[4][i]="-";
         tablero[10][i]="-";
        }
        for (int i = 15; i < 17; i++) {
         tablero[2][i]="-";
         tablero[4][i]="-";
         tablero[10][i]="-";
        }
    //Fila de abajo de islas
        for (int i = 2; i < 8; i++) {
         tablero[12][i]="-";
         tablero[12][5]=".";
        }
        for (int i = 11; i < 17; i++) {
         tablero[12][i]="-";
         tablero[12][13]=".";
        }
    //Columnas interiores
        for (int i = 2; i < 11; i++) {
            tablero[i][5]="|";
            tablero[6][5]=".";
            tablero[6][13]=".";
            tablero[i][13]="|";
        }
        for (int i = 6; i < 8; i++) {
         tablero[2][i]="-"; 
        }
        for (int i = 11; i < 13; i++) {
         tablero[2][i]="-"; 
        }
    
    }
    //Método para leer tablero
    public static void leertablero(String[][] tablero){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]+" ");    
            }
            System.out.println(" ");
        }
    }
}

