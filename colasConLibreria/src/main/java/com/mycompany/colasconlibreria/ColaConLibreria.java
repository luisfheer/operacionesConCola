

package com.mycompany.colasconlibreria;

import java.util.ArrayDeque;
import java.util.Queue;

public class ColaConLibreria {
    public static void main(String[] args) {
        Queue<Integer> cola = new ArrayDeque<>();

        cola.add(10);
        cola.add(11);
        cola.add(12);
        System.out.println("Cola: " + cola);

        System.out.println("Desencolado: " + cola.remove());
        System.out.println("Cola después de desencolar: " + cola);

        System.out.println("Peek: " + cola.peek());
        System.out.println("¿Está vacía?: " + cola.isEmpty());
    }
}
