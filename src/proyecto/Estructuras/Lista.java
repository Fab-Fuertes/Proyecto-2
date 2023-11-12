/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.Estructuras;

/**
 *
 * @author truenno
 */
public class Lista<T> {

	private Nodo_Lista<T> pFirst;
	private Nodo_Lista<T> pLast;
	private int size;

	public Lista() {
		this.pFirst = null;
		this.pLast = null;
		this.size = 0;
	}

	public boolean isEmpty() {
		return this.getSize() == 0;
	}

	public void InsertBegin(T data) {
		Nodo_Lista nodo = new Nodo_Lista(data);
		if (isEmpty()) {
			this.setpFirst(nodo);
			this.setpLast(nodo);
		} else {
			nodo.setpNext(this.getpFirst());
			this.setpFirst(nodo);
		}
		setSize(getSize() + 1);
	}

	public void InsertLast(T data) {
		Nodo_Lista nodo = new Nodo_Lista(data);
		if (isEmpty()) {
			this.setpFirst(nodo);
			this.setpLast(nodo);
		} else {
			this.getpLast().setpNext(nodo);
			this.setpLast(nodo);
		}
		this.setSize(this.getSize() + 1);
	}


	//    Buscar por indices
	public Nodo_Lista<T> searchByIndex(int index) {
		Nodo_Lista<T> pAux = this.getpFirst();
		int count = 0;

		while (pAux != null && count != index) {
			pAux = pAux.getpNext();
			count++;
		}

		if (pAux != null) {
			return pAux;
		} else {
			return null;
		}
	}
        
        public T remove(int index) {
            if (index < 0 || index >= this.getSize()) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }

            Nodo_Lista<T> pAux = this.getpFirst();
            T data;

            if (index == 0) {
                data = this.getpFirst().getData();
                this.setpFirst(this.getpFirst().getpNext());
            } else {
                int count = 0;
                while (count != index - 1) {
                    pAux = pAux.getpNext();
                    count++;
                }
                data = pAux.getpNext().getData();
                pAux.setpNext(pAux.getpNext().getpNext());
                if (pAux.getpNext() == null) {
                    this.setpLast(pAux);
                }
            }
            this.setSize(this.getSize() - 1);
            return data;
        }


	/**
	 * @return the pFirst
	 */
	public Nodo_Lista<T> getpFirst() {
		return pFirst;
	}

	/**
	 * @param pFirst the pFirst to set
	 */
	public void setpFirst(Nodo_Lista<T> pFirst) {
		this.pFirst = pFirst;
	}

	/**
	 * @return the pLast
	 */
	public Nodo_Lista<T> getpLast() {
		return pLast;
	}

	/**
	 * @param pLast the pLast to set
	 */
	public void setpLast(Nodo_Lista<T> pLast) {
		this.pLast = pLast;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
}
