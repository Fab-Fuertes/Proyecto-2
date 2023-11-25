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
public class HashTable<K, V> {
    public Entry<K, V>[] tabla;
    public int tamaño;
    private int count;

    public HashTable(int tamaño) {
        this.tamaño = tamaño;
        this.tabla = new Entry[tamaño];
        this.count = 0;
    }

    public class Entry<K, V> {
        K llave;
        V valor;
        Entry<K, V> siguiente;

        Entry(K llave, V valor, Entry<K, V> siguiente) {
            this.llave = llave;
            this.valor = valor;
            this.siguiente = siguiente;
        }
    }

    public ArrayList<Entry<K, V>> getEntries() {
        ArrayList<Entry<K, V>> entries = new ArrayList<>();

        for (int i = 0; i < tamaño; i++) {
            Entry<K, V> entry = tabla[i];
            while (entry != null) {
                entries.add(entry);
                entry = entry.siguiente;
            }
        }

        return entries;
    }
    
        public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Usuarios registrados:\n");

        for (int i = 0; i < tamaño; i++) {
            if (tabla[i] != null) {

                Entry<K, V> entry = tabla[i];
                while (entry != null) {
                    stringBuilder.append("Usuario: ").append(entry.llave).append(", Prioridad: ").append( entry.valor).append(" | ");
                    entry = entry.siguiente;
                }

                stringBuilder.append("\n");
            }
        }

        return stringBuilder.toString();
    }
    

    public void put(K llave, V valor) {
        if (llave == null) return;

        int indice = getIndice(llave);

        for (Entry<K, V> x = tabla[indice]; x != null; x = x.siguiente) {
            if (llave.equals(x.llave)) {
                x.valor = valor;
                return;
            }
        }

        tabla[indice] = new Entry<>(llave, valor, tabla[indice]);
        count++;

        if (count >= tamaño/2) {
            resize(2*tamaño);
        }
    }

    public V get(K llave) {
        if (llave == null) return null;

        int indice = getIndice(llave);

        for (Entry<K, V> x = tabla[indice]; x != null; x = x.siguiente) {
            if (llave.equals(x.llave)) {
                return x.valor;
            }
        }
        return null;
    }

    private int getIndice(K llave) {
        return (llave.hashCode() & 0x7fffffff) % tamaño;
    }

    private void resize(int capacidad) {
        HashTable<K, V> temp = new HashTable<>(capacidad);
        for (int i = 0; i < tamaño; i++) {
            for (Entry<K, V> x = tabla[i]; x != null; x = x.siguiente) {
                temp.put(x.llave, x.valor);
            }
        }
        this.tabla = temp.tabla;
        this.tamaño = temp.tamaño;
    }
    
    public void remove(K llave) {
        int indice = getIndice(llave);
        Entry<K, V> entrada = tabla[indice];
        Entry<K, V> prev = null;
        while (entrada != null && !entrada.llave.equals(llave)) {
            prev = entrada;
            entrada = entrada.siguiente;
        }
        if (entrada == null) {
            return;
        }
        if (prev == null) {
            tabla[indice] = entrada.siguiente;
        } else {
            prev.siguiente = entrada.siguiente;
        }
        count--;
    }
}


