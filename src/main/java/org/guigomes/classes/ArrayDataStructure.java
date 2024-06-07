package org.guigomes.classes;

import org.guigomes.interfaces.DataStructure;

import java.util.Scanner;

public class ArrayDataStructure implements DataStructure {

    @Override
    public void getInfos() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert the size of the array: ");
        int sizeArr = Integer.parseInt(scanner.nextLine());
        int[] array = new int[sizeArr];

        for (int i = 0; i < sizeArr; i++) {
            System.out.println("Insert the value of the array " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        printArray(array);

    }

    public void printArray(int[] array) {
        System.out.println("Print Array");
        for (int value : array) {
            System.out.println("Value: " + value);
        }
    }

}
