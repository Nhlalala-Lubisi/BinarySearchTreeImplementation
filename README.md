Binary Search Tree (BST) Implementation

A Java 21 implementation of a Binary Search Tree (BST) demonstrating the core operations of a BST data structure. This project was developed using Java 21, Maven, VS Code, and JUnit 5 for testing.

Description

This application implements a Binary Search Tree that allows users to:

Insert new nodes
Search for existing nodes
Delete nodes
Traverse the tree using:
In-order Traversal
Pre-order Traversal
Post-order Traversal

The project demonstrates recursion, object-oriented programming, and fundamental data structure concepts.

Features
Binary Search Tree implementation
Insert nodes
Search for nodes
Delete nodes
In-order traversal
Pre-order traversal
Post-order traversal
Unit testing with JUnit 5
Well-commented and documented code
Technologies Used
Java 21
Maven
JUnit 5
Visual Studio Code
Project Structure
BinarySearchTreeImplementation
│
├── pom.xml
├── README.md
│
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── nhlaks
    │   │           ├── Main.java
    │   │           ├── BinarySearchTree.java
    │   │           └── TreeNode.java
    │   └── resources
    │
    └── test
        └── java
            └── com
                └── nhlaks
                    └── BinarySearchTreeTest.java
Running the Application
Clone the repository
git clone <repository-url>
Navigate to the project
cd BinarySearchTreeImplementation
Compile the project
mvn clean compile
Run the application
mvn exec:java -Dexec.mainClass="com.nhlaks.Main"

Or simply run Main.java directly from VS Code.

Running the Tests

Run all unit tests with:

mvn test
Example Output
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
Learning Outcomes

This project demonstrates:

Binary Search Tree implementation
Recursive algorithms
Tree traversal techniques
Searching and deletion in BSTs
Object-Oriented Programming (OOP)
Unit testing using JUnit 5
Maven project structure
Author

**Nhlalala Lubisi**

Advanced Diploma in Information Technology
Software Developer | Full-Stack Developer | AI & ML
