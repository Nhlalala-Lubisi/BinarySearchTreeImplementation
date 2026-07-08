# Binary Search Tree (BST) Implementation

A Java 21 implementation of a **Binary Search Tree (BST)** demonstrating
the core operations of a BST data structure. This project was developed
using **Java 21**, **Maven**, **VS Code**, and **JUnit 5** for testing.

------------------------------------------------------------------------

## 📖 Description

This application implements a Binary Search Tree that allows users to:

-   Insert new nodes
-   Search for existing nodes
-   Delete nodes
-   Traverse the tree using:
    -   In-order Traversal
    -   Pre-order Traversal
    -   Post-order Traversal

The project demonstrates recursion, object-oriented programming, and
fundamental data structure concepts.

------------------------------------------------------------------------

## 🚀 Features

-   Binary Search Tree implementation
-   Insert nodes
-   Search for nodes
-   Delete nodes
-   In-order traversal
-   Pre-order traversal
-   Post-order traversal
-   Unit testing with JUnit 5
-   Well-commented and documented code

------------------------------------------------------------------------

## 🛠 Technologies Used

-   Java 21
-   Maven
-   JUnit 5
-   Visual Studio Code

------------------------------------------------------------------------

## 📂 Project Structure

``` text
BinarySearchTreeImplementation
│
├── pom.xml
├── README.md
│
└── src
    ├── main
    │   └── java/com/nhlaks
    │       ├── Main.java
    │       ├── BinarySearchTree.java
    │       └── TreeNode.java
    └── test
        └── java/com/nhlaks
            └── BinarySearchTreeTest.java
```

## ▶️ Running

Compile:

``` bash
mvn clean compile
```

Run:

``` bash
mvn exec:java -Dexec.mainClass="com.nhlaks.Main"
```

Or run `Main.java` directly from VS Code.

## 🧪 Testing

``` bash
mvn test
```

## 📋 Example Output

``` text
In-order Traversal:
20 30 40 50 60 70 80

Pre-order Traversal:
50 30 20 40 70 60 80

Post-order Traversal:
20 40 30 60 80 70 50

Search 40: true
Search 90: false

Deleting 30...

In-order after deletion:
20 40 50 60 70 80
```

## 📚 Learning Outcomes

-   Binary Search Trees
-   Recursive algorithms
-   Tree traversals
-   Searching and deletion
-   Object-Oriented Programming
-   Unit testing with JUnit 5
-   Maven project structure

## 👨‍💻 Author

**Lubisi Nhlaks**

Advanced Diploma in Information Technology\
Software Developer \| Full-Stack Developer \| AI & Machine Learning
Enthusiast

## 📄 License

This project is intended for educational and learning purposes.
