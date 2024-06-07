package org.guigomes.linked_list_data_structure;

import org.guigomes.interfaces.DataStructure;

import java.util.Scanner;

public class LinkedListDataStructure implements DataStructure {

    private Node firstNode;
    private Node lastNode;
    private int size;

    public LinkedListDataStructure() {
        this.firstNode = null;
        this.lastNode = null;
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


    public void printInfos() {
        System.out.println("Estrutura de Dados: Lista Ligada");
        System.out.println("Tamanho: " + size);
        System.out.println("Primeiro Nó: " + (firstNode != null ? firstNode.data : "null"));
        System.out.println("Último Nó: " + (lastNode != null ? lastNode.data : "null"));

        // To show all elements
        Node currentNode = firstNode;
        System.out.print("Elementos: ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Método para adicionar um novo elemento no final da lista
    public void add(Object data) {
        Node newNode = new Node(data);
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            lastNode.next = newNode;
        }
        lastNode = newNode;
        size++;
    }

    // Método para remover um elemento da lista
    public boolean remove(Object data) {
        if (firstNode == null) {
            return false; // Empty list
        }

        if (firstNode.data.equals(data)) {
            firstNode = firstNode.next;
            size--;
            if (firstNode == null) {
                lastNode = null;
            }
            return true;
        }

        Node currentNode = firstNode;
        while (currentNode.next != null && !currentNode.next.data.equals(data)) {
            currentNode = currentNode.next;
        }

        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
            size--;
            if (currentNode.next == null) {
                lastNode = currentNode; // update the last node
            }
            return true;
        }

        return false; // not found element
    }

    // Método para verificar se a lista está vazia
    public boolean isEmpty() {
        return size == 0;
    }

    // Método para obter o tamanho da lista
    public int getSize() {
        return size;
    }

    // Método para interagir com o usuário e realizar operações na lista
    @Override
    public void interact() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add element");
            System.out.println("2. Remove element");
            System.out.println("3. Display list information");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            switch (option) {
                case 1:
                    System.out.print("Enter the element to add: ");
                    String elementToAdd = scanner.nextLine();
                    add(elementToAdd);
                    break;
                case 2:
                    System.out.print("Enter the element to remove: ");
                    String elementToRemove = scanner.nextLine();
                    boolean removed = remove(elementToRemove);
                    if (removed) {
                        System.out.println("Element removed successfully!");
                    } else {
                        System.out.println("Element not found in the list!");
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
