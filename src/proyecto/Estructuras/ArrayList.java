/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Estructuras;

/**
 *
 * @author fabys
 */
public class ArrayList<E> {
    private static final int TAMANO_INICIAL = 10;
    private Object[] elementos;
    private int tamaño;

    public ArrayList() {
        this.elementos = new Object[TAMANO_INICIAL];
        this.tamaño = 0;
    }

    public void add(E elemento) {
        if (tamaño == elementos.length) {
            ampliarCapacidad();
        }
        elementos[tamaño++] = elemento;
    }

    public E obtener(int indice) {
        if (indice < 0 || indice >= tamaño) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        return (E) elementos[indice];
    }

    public int tamaño() {
        return tamaño;
    }

    private void ampliarCapacidad() {
        int nuevaCapacidad = elementos.length * 2;
        Object[] nuevoArray = new Object[nuevaCapacidad];
        for (int i = 0; i < tamaño; i++) {
            nuevoArray[i] = elementos[i];
        }
        elementos = nuevoArray;
    }




    
}
