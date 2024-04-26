package listas;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        //creo la coleccion de tipo Lista
        //no tipada
//        ArrayList lista = new ArrayList();
        
        //tipada
        ArrayList<Persona> lista = new ArrayList<Persona>();
        
        //creo objetos de la clase Persona
        Persona p1 = new Persona("Juan", 25);
        Persona p2 = new Persona("Jose", 30);
        Persona p3 = new Persona("Carlos", 40);
        Persona p4 = new Persona("Maria", 20);
        
        //agrego los objetos en la coleccion
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        
        System.out.println("Contenido: "+ lista);        
        
        System.out.println("Longitud: "+ lista.size());        
        
        System.out.println("Insercion: ");
        lista.add(2,new Persona("Pedro", 45));
        
        System.out.println("Nuevo Contenido: "+ lista);

        System.out.println("Eliminacion: ");
        System.out.println("Elemento eliminado: "+ lista.remove(0).getNombre());
        
        
        System.out.println("Nuevo Contenido: "+ lista);
        
        System.out.println("Recorro la coleccion con un for: ");
        
        for (int i = 0; i < lista.size(); i++) {
            Persona unaPersona = lista.get(i);
            
            if (unaPersona.getEdad() >= 30) {
                System.out.println(unaPersona);
            }
        }
        
        
    }
}
