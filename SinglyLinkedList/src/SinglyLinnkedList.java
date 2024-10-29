
public class SinglyLinnkedList {
    Nodo cabeza; // este sera el unico atributo de esta clase y se le crea un constructor para
                 // instanciarlo

    public SinglyLinnkedList() {
        this.cabeza = null;// esto es pra inicializarlo en null
    }



    public void insertar(Integer dato) { // metodo sin retorno con mi dato

        // Crear un nodo
        Nodo nuevoNodo = new Nodo(dato); // la palabra "Nodo" es palabra reservada, que especificamnete crea un nodo

        // Averiguar ni la caja o lista esta vacia para poder añadir datos
        if (cabeza == null) {

            cabeza = nuevoNodo; // colocar el nodo nuevo como la cabeza

        } else { // de lo contrario, recorrera todo los nodos para colocar el nuevo dato al
                 // ultimo

            Nodo temp = cabeza; // se incia desde la cabeza (El primero ps)

            // recorremos todo el los nodos hasta encontrar un null en las referencias
            while (temp.getSiguiente() != null) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(); = nuevoNodo; // con este avanzas a la siguinte nodo

        }

    }



    public void mostrar() {
        Nodo temp = cabeza; // conmezamos desde la cabeza inicio
        // mientras temporal mno sea nulo
        while (temp != null) {
            System.out.print(temp.getDato() + "->");
            temp = temp.getSiguiente();
        }

        System.out.println("null");
    }



    public boolean buscar(Integer valor) {
        if (cabeza == null) {
            System.out.println("La lista esta vacia");
            return false;
        } else {
            Nodo temp = cabeza; // conmezamos desde la cabeza inicio
            // mientras temporal no sea nulo
            while (temp != null) {
                if (temp.getDato() == valor) {
                    System.out.println("El datos si existe");
                    return true;
                }
                temp = temp.getSiguiente(); // con este avanzas a la siguinte nodo



            }
        }
        
        System.out.println("No existe tu numero");
        return false;
    }




    //ELIMINAR
    public void eliminar(Integer valor) {
if(cabeza==null){
    System.out.println("No se puede eliminar porque la lista esta vacia");
}
if(cabeza.getDato()==valor){
    cabeza=cabeza.getSiguiente(); // la plabra siguente es la referencia al siguiente nodo
    return;
}
 Nodo temp=cabeza;
 Nodo anterior=null;
 while(temp!=null && temp.getDato()!=valor){//recorrer hasta que encontremos el nodo con valor deseado
    anterior=temp;
    temp=temp.getSiguiente();

}
if(temp!=null){
    System.out.println("No se encontro el valor");
    return;
}

anterior.setSiguiente(temp.getSiguiente());
System.out.println("Se elimino correctamente"+valor); // se elimina el nodo que estamos buscando siempre y cuando se encuentre
}

}
//Alt+Shift+F IDENTAR

// este es otro comentario