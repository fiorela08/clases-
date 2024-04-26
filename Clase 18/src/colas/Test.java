package colas;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {
        //creo una coleccion de tipo FIFO o Cola
        Queue cola = new LinkedList();
        
        //agrego objetos en la coleccion
        cola.add("Juan");
        cola.add("Carlos");
        cola.add("Jose");
        cola.add("Maria");
        
        System.out.println("Longitud: " + cola.size());
        
        System.out.println("Contenido: " + cola);
        
        System.out.println("1er elemento a salir: " + cola.peek());
        
        System.out.println("saco un elemento: " + cola.poll());
        
        System.out.println("Nuevo Contenido: " + cola);
        
        
        
        
        
        
        
        
    }
}
