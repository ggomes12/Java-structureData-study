# 



<h1 style="text-align: center;">
  Java-StructureData
</h1>

This project aims to provide a practical study of various data structures implemented in Java. Data structures are fundamental to computer science and programming because they organize and store data efficiently, allowing for quick and effective operations. This project covers the following data structures:

    - Array
    - Linked List
    - Stack
    - Queue
    - Types of Tree
    - Graph

Each data structure is implemented with its own class and follows a common interface, DataStructure, which defines an interaction method to allow users to add and remove data interactively.


## Prerequisites

Make sure you have the following tools installed on your machine:

- An IDE (such as VSCode, Intellij, Eclipse.) or text editor of your choice
- Support JDK (Java Development Kit) installed (version 8 or higher).

## Project structure

The project is organized into the following main folders and files:

    src/org/guigomes/interfaces/: Contains the DataStructure interface.
    src/org/guigomes/data_structure_factory/: Contains the DataStructureFactory to create instances of the data structures.
    src/org/guigomes/: Contains the Main class that initializes the program.
    src/org/guigomes/array_data_structure/: Implementation of the Array data structure.
    src/org/guigomes/linked_list_data_structure/: Implementation of the Linked List data structure.
    src/org/guigomes/stack_data_structure/: Implementation of the Stack data structure.
    src/org/guigomes/queue_data_structure/: Implementation of the Queue data structure.
    src/org/guigomes/tree_data_structure/: Implementation of the Tree data structure.
    src/org/guigomes/graph_data_structure/: Implementation of the Graph data structure.


## How to Run

1. **Clone this repository to your local environment:**

    ```bash
    $ git clone git@github.com:ggomes12/Java-structureData-study.git
    ```

2. **Navigate to the project directory:**

    ```bash
    $ cd Java-structureData-study
    ```

3. **Compile the Java files::**

    ```bash
    $ javac src/org/guigomes/**/*.java
    ```

4. **Create a superuser (optional, for admin access):**

    ```bash
    $ python manage.py createsuperuser
    ```

5. **Run the application:**

    ```bash
    $ java -cp src org.guigomes.Main
    ```

## Project Structure



## Functionality and exemple tests

## Array

    Add Elements to Array:
        When prompted, enter the size of the array (e.g., 5).
        Enter values for each position in the array (e.g., 10, 20, 30, 40, 50).
        The program will display the array elements.

    Test: Select an option: 1
        Insert the size of the array: 5
        Insert the value of the array 0: 10
        Insert the value of the array 1: 20
        Insert the value of the array 2: 30
        Insert the value of the array 3: 40
        Insert the value of the array 4: 50
        Print Array
        Value: 10
        Value: 20
        Value: 30
        Value: 40
        Value: 50
        

## Linked List

    Add Elements to Linked List:
        Choose the option to add an element.
        Enter the element (e.g., Hello).
        Repeat to add more elements (e.g., World).

    Remove Elements from Linked List:
        Choose the option to remove an element.
        Enter the element to remove (e.g., Hello).

    Display Linked List Information:
        Choose the option to display the list information.

    Test: Select an option: 2
        Choose an option:
        1. Add element
        2. Remove element
        3. Display list information
        4. Exit
        Enter the element to add: Hello
        Enter the element to add: World
        Choose an option:
        3. Display list information
        Data Structure: Linked List
        Size: 2
        First Node: Hello
        Last Node: World
        Elements: Hello World 
        Choose an option:
        2. Remove element
        Enter the element to remove: Hello
        Element removed successfully!
        Choose an option:
        3. Display list information
        Data Structure: Linked List
        Size: 1
        First Node: World
        Last Node: World
        Elements: World 

## Stack

    Push Elements onto Stack:
        Choose the option to push an element.
        Enter the element (e.g., 10).

    Pop Elements from Stack:
        Choose the option to pop an element.

    Display Stack Information:
        Choose the option to display the stack information.

    Test: Select an option: 3
        Choose an option:
        1. Push element
        2. Pop element
        3. Display stack information
        4. Exit
        Enter the element to push: 10
        Enter the element to push: 20
        Choose an option:
        3. Display stack information
        Data Structure: Stack
        Size: 2
        Top Element: 20
        Choose an option:
        2. Pop element
        Element popped: 20
        Choose an option:
        3. Display stack information
        Data Structure: Stack
        Size: 1
        Top Element: 10


## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Conclusion

This project provides a comprehensive study of fundamental data structures through interactive Java implementations. By running and experimenting with this project, users can gain a deeper understanding of how these data structures work and how to implement them in Java.



