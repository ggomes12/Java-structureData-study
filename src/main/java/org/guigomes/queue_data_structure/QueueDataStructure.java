package org.guigomes.queue_data_structure;

import org.guigomes.interfaces.DataStructure;

import java.util.Scanner;

public class QueueDataStructure implements DataStructure {
    private Node front;
    private Node rear;
    private int size;

    public QueueDataStructure() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    private static class Node {
        private final Object data;
        private Node next;

        Node (Object data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to enqueue an element
    public void enqueue(Object data) {
        Node newNode = new Node(data);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
        size++;
    }

    // Method to dequeue an element
    public Object dequeue() {
        if(front == null) {
            return null; // queue is empty
        }
        Object dequeueData = front.data;
        front = front.next;
        if(front == null) {
            rear = null; // queue become empty
        }
        size--;
        return dequeueData;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the queue
    public int getSize() {
        return size;
    }

    // Method to display the queue information
    public void printQueueInfo() {
        System.out.println("Data Structure: Queue");
        System.out.println("Size: " + size);
        System.out.println("Front Element: " + (front != null ? front.data : "null"));
        System.out.println("Rear Element: " + (rear != null ? rear.data : "null"));
        System.out.print("Elements: ");
        Node currentNode = front;
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // Method to interact with the user and perform queue operations
    @Override
    public void interact() {
        Scanner scanner = new Scanner(System.in);
        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Enqueue element");
            System.out.println("2. Dequeue element");
            System.out.println("3. Display queue information");
            System.out.println("4. Exit");

            int option = scanner.nextInt();
            scanner.nextLine(); // Clear input buffer

            switch (option) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    String elementToEnqueue = scanner.nextLine();
                    enqueue(elementToEnqueue);
                    break;
                case 2:
                    Object dequeuedElement = dequeue();
                    if (dequeuedElement != null) {
                        System.out.println("Element dequeued: " + dequeuedElement);
                    } else {
                        System.out.println("Queue is empty!");
                    }
                    break;
                case 3:
                    printQueueInfo();
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
