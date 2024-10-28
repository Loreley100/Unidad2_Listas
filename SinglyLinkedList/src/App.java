import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner leer = new Scanner(System.in);

        SinglyLinnkedList lista = new SinglyLinnkedList();

        lista.insertar(10);

        lista.insertar(20);

        lista.insertar(30);

        lista.mostrar();

        // buscar un dato que si existe para que de un mensaje afirmativo
        lista.buscar(10);
        // buscar un dato que no existe
        lista.buscar(100);
        lista.eliminar(30);
        lista.mostrar();

    }
}
