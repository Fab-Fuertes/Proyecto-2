/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Estructuras;

/**
 *
 * @author truenno
 */
public class Monticulo_Binario<T> {
	private Nodo_Arbol pRoot;
	private int size;

	public Monticulo_Binario() {
		this.pRoot = null;
		this.size = 0;
	}

	public Nodo_Arbol getpRoot() {
		return pRoot;
	}

	public void setpRoot(Nodo_Arbol pRoot) {
		this.pRoot = pRoot;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isEmpty() {
		return pRoot == null;
	}

	public void insertBinaryHeap( Nodo_Arbol nodo_insertar, Nodo_Arbol raiz, Nodo_Arbol nodo_previo) {
		if (isEmpty()) {
			setpRoot(nodo_insertar);
		} else {
			if (raiz.getPriority() <= nodo_insertar.getPriority()) {
				if (raiz.getpLeft() == null) {
					raiz.setpLeft(nodo_insertar);
				}else if (raiz.getpRight() == null) {
					raiz.setpRight(nodo_insertar);
				}else if (raiz.getpLeft().getpLeft() == null) {
					insertBinaryHeap(nodo_insertar, raiz.getpLeft(), raiz);
					
				}else if (raiz.getpRight().getpLeft() == null){
					insertBinaryHeap(nodo_insertar, raiz.getpRight(), raiz);	
				}
			} else {
				nodo_insertar.setpLeft(raiz);
				nodo_previo.setpLeft(nodo_insertar);
				verificarRestricion(nodo_previo, nodo_insertar);
				
				
			}
				
		}
		size++;
	}

	public void verificarRestricion(Nodo_Arbol raiz, Nodo_Arbol raiz_previa) {
		if (raiz.getPriority() <= raiz.getpLeft().getPriority()) {
			System.out.println("yay :D");
		}else{
			
		}
	}
	
}
