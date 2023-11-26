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
//public class MinHeap {
//
//    Lista<Documento> heap;
//
//    // Constructor
//    public MinHeap() {
//        this.heap = new Lista<Documento>();
//    }
//
//    // Método para insertar un elemento en el montículo
//    public void insert(Documento doc) {
//        heap.InsertLast(doc);
//        int index = heap.getSize() - 1;
//        int parent = (index - 1) / 2;
//        System.out.println(index);
//        while (parent >= 0 && heap.searchByIndex(parent).getData().getPrioridad() > heap.searchByIndex(index).getData().getPrioridad()) {
//            // Intercambiar elementos manualmente
//            Documento temp = heap.searchByIndex(parent).getData();
//            heap.searchByIndex(parent).setData(heap.searchByIndex(index).getData());
//            heap.searchByIndex(index).setData(temp);
//
//            index = parent;
//            parent = (index - 1) / 2;
//        }
//    }
//
//    // Método para eliminar el elemento mínimo del montículo
//    public Documento removeMin() {
//        if (heap.getSize() == 0) {
//            throw new IllegalStateException("Heap is empty");
//        } else if (heap.getSize() == 1) {
//            Documento min = heap.getpFirst().getData();
//            heap.setpFirst(null);
//            heap.setpLast(null);
//            heap.setSize(0);
//            return min;
//        }
//
//        // Eliminar el mínimo y mover el último elemento a la raíz
//        Documento min = heap.getpFirst().getData();
//        Documento lastElement = heap.getpLast().getData();
//        heap.getpFirst().setData(lastElement);
//        heap.setSize(heap.getSize() - 1);
//
//        // Reajustar el montículo
//        minHeapify(0);
//
//        return min;
//    }
//
//    // Método para reajustar el montículo
//    private void minHeapify(int index) {
//        int left = 2 * index + 1;
//        int right = 2 * index + 2;
//        int smallest = index;
//
//        if (left < heap.getSize() && heap.searchByIndex(left).getData().getPrioridad() < heap.searchByIndex(smallest).getData().getPrioridad()) {
//            smallest = left;
//        }
//
//        if (right < heap.getSize() && heap.searchByIndex(right).getData().getPrioridad() < heap.searchByIndex(smallest).getData().getPrioridad()) {
//            smallest = right;
//        }
//
//        if (smallest != index) {
//            // Intercambiar elementos manualmente
//            Documento temp = heap.searchByIndex(index).getData();
//            heap.searchByIndex(index).setData(heap.searchByIndex(smallest).getData());
//            heap.searchByIndex(smallest).setData(temp);
//
//            minHeapify(smallest);
//        }
//    }
//
//    public void remove(Documento doc) {
//        // Buscar el documento en el montículo
//        for (int i = 0; i < heap.getSize(); i++) {
//            if (heap.searchByIndex(i).getData().equals(doc)) {
//                // Mover el último elemento al lugar del elemento a eliminar
//                heap.searchByIndex(i).setData(heap.searchByIndex(heap.getSize() - 1).getData());
//                heap.setSize(heap.getSize() - 1);
//
//                // Reajustar el montículo
//                minHeapify(i);
//                break;
//            }
//        }
//    }
//
//}
