/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Estructuras;

/**
 *
 * @author truenno
 */
public class Nodo_Lista<T> {
	private T data;

	public Nodo_Lista(T data) {
            this.data = data;
            this.pNext = null;
	}

	private Nodo_Lista<T> pNext;

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the pNext
	 */
	public Nodo_Lista<T> getpNext() {
		return pNext;
	}

	/**
	 * @param pNext the pNext to set
	 */
	public void setpNext(Nodo_Lista<T> pNext) {
		this.pNext = pNext;
	}
	
}
