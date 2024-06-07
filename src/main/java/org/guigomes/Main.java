package org.guigomes;

import org.guigomes.data_structure_factory.DataStructureFactory;
import org.guigomes.interfaces.DataStructure;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opt;
        do {

            System.out.println("\nMenu Data Structure");
            System.out.println("1 - Array");
            System.out.println("2 - Linked List");
            System.out.println("3 - Stack");
            System.out.println("4 - Queue");
            System.out.println("5 - Tree");
            System.out.println("6 - Graph");
            System.out.println("0 - Exit");

            System.out.print("Select an option: ");
            opt = Integer.parseInt(scanner.nextLine());

            try {
                DataStructure dataStructure = DataStructureFactory.getDataStructure(opt);

                if (dataStructure != null) {
                    dataStructure.interact();
                } else if (opt == 0){
                    System.out.println("Exiting of the application.");
                } else {
                    System.out.println("Invalid option. Please select a number between 0 and 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }

        } while (opt != 0);

    }
}
