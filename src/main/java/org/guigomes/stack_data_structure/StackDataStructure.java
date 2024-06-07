package org.guigomes.stack_data_structure;

import org.guigomes.interfaces.DataStructure;

import java.util.Scanner;

public class StackDataStructure implements DataStructure {

    private Node top;
    private int size;

    public StackDataStructure() {
        this.top = null;
        this.size = 0;
    }

    private static class Node {
        private final Object data;
        private Node next;

        Node(Object data) {
            this.data = data;
            this.next = null;
        }
    }

    // Método para adicionar um novo elemento no topo da pilha
    public void push(Object data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    // Método para remover o elemento do topo da pilha
    public Object pop() {
        if (top == null) {
            return null;
        }
        Object data = top.data;
        top = top.next;
        size--;
        return data;
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return size == 0;
    }

    // Método para obter o tamanho da pilha
    public int getSize() {
        return size;
    }

    public Object peek() {
        if (top == null) {
            return null; //stack is empty
        }
        return top.data;
    }

    // Método para exibir informações sobre a pilha
    public void printInfos() {
        System.out.println("Estrutura de Dados: Pilha");
        System.out.println("Tamanho: " + size);
        System.out.println("Topo: " + (top != null ? top.data : "null"));

        // Para mostrar todos os elementos
        Node currentNode = top;
        System.out.print("Elementos: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Método para interagir com o usuário e realizar operações na pilha
    @Override
    public void interact() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Push element");
            System.out.println("2. Pop element");
            System.out.println("3. Display stack information");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            switch (option) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    String elementToPush = scanner.nextLine();
                    push(elementToPush);
                    break;
                case 2:
                    Object poppedElement = pop();
                    if (poppedElement != null) {
                        System.out.println("Element popped: " + poppedElement);
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;
                case 3:
                    printInfos();
                    break;
                case 4:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }

        System.out.println("Program terminated.");
    }
}
