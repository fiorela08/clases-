package pilas;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        //creo una coleccion de tipo LIFO(Pila)
        Stack pila = new Stack();
        
        //creo objetos y los agrego en la coleccion
        pila.push("Juan");
        pila.push("Carlos");
        pila.push("Jose");
        pila.push("Maria");
        
        System.out.println("Longitud: "+ pila.size());
        
        System.out.println("Contenido: "+ pila);
        
        System.out.println("1er elemento a salir: " + pila.peek());
        
        System.out.println("saco un elemento: " + pila.pop());
        
        System.out.println("Nuevo Contenido: " + pila);
        
        System.out.println("Pila vacia?: "+ pila.empty());
        
    }
}
