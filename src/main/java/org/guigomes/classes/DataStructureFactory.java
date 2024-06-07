package org.guigomes.classes;

import org.guigomes.interfaces.DataStructure;

public class DataStructureFactory {
    public static DataStructure getDataStructure(int opt) {
        return switch (opt) {
            case 1 -> new ArrayDataStructure();
            case 2 -> new LinkedListDataStructure();
            case 3 -> new StackDataStructure();
            case 4 -> new QueueDataStructure();
            case 5 -> new TreeDataStructure();
            case 6 -> new GraphDataStructure();
            default -> null;
        };
    }
}
