/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Estructuras;

/**
 *
 * @author truenno
 */
public class Nodo_Arbol<T> {

    private T data;
    private int priority;
    private Nodo_Arbol<T> pLeft;
    private Nodo_Arbol<T> pRight;

    public Nodo_Arbol(T data, int priority) {
        this.data = data;
        this.pLeft = null;
        this.pRight = null;
        this.priority = priority;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo_Arbol getpLeft() {
        return pLeft;
    }

    public void setpLeft(Nodo_Arbol pLeft) {
        this.pLeft = pLeft;
    }

    public Nodo_Arbol getpRight() {
        return pRight;
    }

    public void setpRight(Nodo_Arbol pRight) {
        this.pRight = pRight;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
