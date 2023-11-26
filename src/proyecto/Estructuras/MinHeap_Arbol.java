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
public class MinHeap_Arbol {
    private Nodo_Arbol<Documento> root;

    public MinHeap_Arbol() {
        this.root = null;
    }

    public Nodo_Arbol<Documento> getRoot() {
        return root;
    }
    
    public boolean isEmpty() {
        return this.root == null;
    }

    public void setRoot(Nodo_Arbol<Documento> root) {
        this.root = root;
    }

    public void insert(Documento doc) {
        int tiempo = doc.getTiempo();
        Nodo_Arbol<Documento> newNode = new Nodo_Arbol<>(doc, tiempo);
        if (root == null) {
            root = newNode;
        } else {
            Nodo_Arbol<Documento> current = root;
            Nodo_Arbol<Documento> parent;
            while (true) {
                parent = current;
                if (tiempo < current.getPriority()) {
                    current = current.getpLeft();
                    if (current == null) {
                        parent.setpLeft(newNode);
                        return;
                    }
                } else {
                    current = current.getpRight();
                    if (current == null) {
                        parent.setpRight(newNode);
                        return;
                    }
                }
            }
        }
    }

    public void preorder() {
        this.preorder(this.getRoot());
    }

    private void preorder(Nodo_Arbol<Documento> root) {
        if (root != null) {
            System.out.println(root.getData().toString());
            this.preorder(root.getpLeft());
            this.preorder(root.getpRight());
        }
    }

    public Documento removeMin() {
        if (root == null) {
            throw new IllegalStateException("Heap is empty");
        } else {
            Documento min = root.getData();
            root = removeRec(root, min);
            return min;
        }
    }

    public void remove(Documento key) {
        root = removeRec(root, key);
    }

    Nodo_Arbol<Documento> minValue(Nodo_Arbol<Documento> node1, Nodo_Arbol<Documento> node2) {
        if (node1 == null)
            return node2;
        else if (node2 == null)
            return node1;
        else {
            if (node1.getData().getTiempo() < node2.getData().getTiempo())
                return node1;
            else
                return node2;
        }
    }

    Nodo_Arbol<Documento> removeRec(Nodo_Arbol<Documento> node, Documento key) {
        if (node == null)
            return null;
        if (node.getData().equals(key)) {
            if (node.getpLeft() == null && node.getpRight() == null)
                return null;
            else if (node.getpLeft() == null)
                return node.getpRight();
            else if (node.getpRight() == null)
                return node.getpLeft();
            else {
                Nodo_Arbol<Documento> temp = minValue(node.getpLeft(), node.getpRight());
                node.setData(temp.getData());
                node.setPriority(temp.getData().getTiempo());
                if (temp.equals(node.getpLeft()))
                    node.setpLeft(removeRec(node.getpLeft(), temp.getData()));
                else
                    node.setpRight(removeRec(node.getpRight(), temp.getData()));
            }
        } else {
            node.setpLeft(removeRec(node.getpLeft(), key));
            node.setpRight(removeRec(node.getpRight(), key));
        }
        return node;
    }
}
