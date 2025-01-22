/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacman1;

/**
 *
 * @author MEDAC
 */
public class Personaje {
    public String nombre;
    public int y;
    public int x;
    
    public Personaje(String nombre, int y, int x){
    this.nombre = nombre;
    this.x = x;
    this.y = y;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Personaje{" + "nombre=" + nombre + ", y=" + y + ", x=" + x + '}';
    }
    
    
}
