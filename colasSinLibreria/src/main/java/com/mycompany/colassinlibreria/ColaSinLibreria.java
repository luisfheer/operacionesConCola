
package com.mycompany.colassinlibreria;

public class ColaSinLibreria {
    
    private int maxSize;
    private int[] cola;
    private int frente;
    private int fin;
    private int numElementos;

    // Constructor público que recibe el tamaño (capacidad) deseado para la cola.
    public ColaSinLibreria(int tamaño) {
        maxSize = tamaño;
        cola = new int[maxSize];
        frente = 0;
        fin = -1;
        numElementos = 0;
    }

    public void encolar(int valor) {
        if (numElementos == maxSize) {
            System.out.println("Cola llena.");
            return;
        }
        fin = (fin + 1) % maxSize;
        cola[fin] = valor;
        numElementos++;
    }

    public int desencolar() {
        if (isEmpty()) {
            System.out.println("Cola vacía.");
            return -1;
        }
        int valor = cola[frente];
        frente = (frente + 1) % maxSize;
        numElementos--;
        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Cola vacía.");
            return -1;
        }
        return cola[frente];
    }

    public boolean isEmpty() {
        return numElementos == 0;
    }

    public void mostrarCola() {
        if (isEmpty()) {
            System.out.println("Cola vacía.");
            return;
        }
        System.out.print("Cola: ");
        for (int i = 0; i < numElementos; i++) {
            System.out.print(cola[(frente + i) % maxSize] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ColaSinLibreria cola = new ColaSinLibreria(5);
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.mostrarCola();

        System.out.println("Desencolado: " + cola.desencolar());
        cola.mostrarCola();

        System.out.println("Peek: " + cola.peek());
        System.out.println("¿Está vacía?: " + cola.isEmpty());
    }
}