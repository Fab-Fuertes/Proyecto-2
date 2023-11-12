/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Estructuras;
/**
 *
 * @author cehernandez
 */

// Clase para representar un montículo binario mínimo

public class MinHeap {
    Lista<Integer> heap;

    // Constructor
    public MinHeap() {
        this.heap = new Lista<Integer>();
    }

    // Método para insertar un elemento en el montículo
    public void insert(int val) {
        heap.InsertLast(val);
        int index = heap.getSize() - 1;
        int parent = (index - 1) / 2;

        while (parent >= 0 && heap.searchByIndex(parent).getData() > heap.searchByIndex(index).getData()) {
            // Intercambiar elementos manualmente
            int temp = heap.searchByIndex(parent).getData();
            heap.searchByIndex(parent).setData(heap.searchByIndex(index).getData());
            heap.searchByIndex(index).setData(temp);

            index = parent;
            parent = (index - 1) / 2;
        }
    }

    // Método para eliminar el elemento mínimo del montículo
    public int removeMin() {
        if (heap.getSize() == 0) {
            throw new IllegalStateException("Heap is empty");
        } else if (heap.getSize() == 1) {
            int min = heap.getpFirst().getData();
            heap.setpFirst(null);
            heap.setpLast(null);
            heap.setSize(0);
            return min;
        }

        // Eliminar el mínimo y mover el último elemento a la raíz
        int min = heap.getpFirst().getData();
        int lastElement = heap.getpLast().getData();
        heap.getpFirst().setData(lastElement);
        heap.setSize(heap.getSize() - 1);

        // Reajustar el montículo
        minHeapify(0);

        return min;
    }

    // Método para reajustar el montículo
    private void minHeapify(int index) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int smallest = index;

        if (left < heap.getSize() && heap.searchByIndex(left).getData() < heap.searchByIndex(smallest).getData()) {
            smallest = left;
        }

        if (right < heap.getSize() && heap.searchByIndex(right).getData() < heap.searchByIndex(smallest).getData()) {
            smallest = right;
        }

        if (smallest != index) {
            // Intercambiar elementos manualmente
            int temp = heap.searchByIndex(index).getData();
            heap.searchByIndex(index).setData(heap.searchByIndex(smallest).getData());
            heap.searchByIndex(smallest).setData(temp);

            minHeapify(smallest);
        }
    }
}
