public class Nodo {
    private Integer dato;//el dato
    private Nodo siguiente;//la referencia 


    // instancia para que se inicialice solito
    public Nodo(Integer dato) {
    this.dato = dato;
    
}


    public Integer getDato() {
        return dato;
    }


    public void setDato(Integer dato) {
        this.dato = dato;
    }


    public Nodo getSiguiente() {
        return siguiente;
    }


    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}