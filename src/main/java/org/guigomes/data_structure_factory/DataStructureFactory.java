package org.guigomes.data_structure_factory;

import org.guigomes.array_data_structure.ArrayDataStructure;
import org.guigomes.graph_data_structure.GraphDataStructure;
import org.guigomes.interfaces.DataStructure;
import org.guigomes.linked_list_data_structure.LinkedListDataStructure;
import org.guigomes.queue_data_structure.QueueDataStructure;
import org.guigomes.stack_data_structure.StackDataStructure;
import org.guigomes.tree_data_structure.TreeDataStructure;


public class DataStructureFactory {
    public static DataStructure getDataStructure(int opt) {
        switch (opt) {
            case 1:
                ArrayDataStructure arrayDataStructure = new ArrayDataStructure();
                arrayDataStructure.interact();
                return arrayDataStructure;
            case 2:
                LinkedListDataStructure linkedListDataStructure = new LinkedListDataStructure();
                linkedListDataStructure.interact();
                return linkedListDataStructure;
            case 3:
                return new StackDataStructure();
            case 4:
                return new QueueDataStructure();
            case 5:
                return new TreeDataStructure();
            case 6:
                return new GraphDataStructure();
            default:
                return null;
        }
    }
}
