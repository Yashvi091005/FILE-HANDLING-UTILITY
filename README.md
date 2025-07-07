# FILE-HANDLING-UTILITY
COMPANY: CODTECHIT SOLUTIONS

NAME: YASHVI BHALA

INTERNID: YASHVI38684

DOMAIN: JAVA 

DURATION: 6 WEEKS

MENTOR: NEELA SANTOSH

##REPORT ON FILE HANDLING UTILITY USING JAVA

🧩 Objective of the Task
The primary objective of Task 1 was to create a utility-based Java program that performs basic file handling operations. These operations include writing to a file, reading from a file, and modifying the file content. The program is designed to interact with the user through a menu-driven interface, making it simple to perform file operations dynamically. This task plays a foundational role in understanding Java's core input/output (I/O) mechanisms and is an essential part of any developer’s toolkit.

🛠 Tools, Technologies, and Concepts Used
The project was developed using Java programming language (Java SE 8+). The key concepts and classes used in the program are:
BufferedReader and BufferedWriter for fast file reading and writing
FileReader and FileWriter for basic file input/output
Files and Paths from the Java NIO package for content manipulation
Scanner for capturing user input
Control statements such as do-while loop and switch-case for managing the menu
These tools together provide a seamless mechanism to handle text file interactions in a robust and efficient manner.

💻 Program Workflow & User Experience
Upon execution, the user is presented with a console-based menu offering four options:
Write to file
Read file
Modify file content
Exit
Write to File: The user is prompted to enter the content they wish to write. The program writes the input into a predefined text file (sample.txt) using BufferedWriter.
Read from File: This option reads the content from the file using BufferedReader and prints it line by line to the console.
Modify File: Here, the user is asked to enter the text to be replaced and the new text to insert. The program reads the entire content using Files.readAllBytes(), replaces the required portion, and writes it back to the file.
Exit: This ends the application gracefully.
All inputs and results are displayed on the console, ensuring real-time feedback to the user.

📌 Why This Task is Important
File handling is a fundamental operation in software development. Whether building a backend system, desktop app, or server utility, the ability to read and write data to files is critical. Through this task, I gained hands-on experience with:
Manipulating text files
Structuring input/output streams
Managing exceptions during file operations
Implementing user-driven logic
This task also helped solidify the concept of Java’s file handling APIs and how they can be used effectively in real-world scenarios.

✅ Task Outcome
The program successfully performed all required operations and was thoroughly tested in various conditions such as:
Writing multi-line text
Reading empty or non-empty files
Modifying specific text strings
Proper exception handling was implemented to manage potential issues like missing files or incorrect user input. The code was also cleanly structured and documented with inline comments to improve readability and maintainability.

📁 Deliverables Submitted
InteractiveFileHandler.java: Fully interactive, user-driven Java application for file handling
Sample output and demo logs available upon request

📘 Conclusion
In conclusion, Task 1 served as an excellent introduction to file handling using Java. It not only improved my understanding of core Java concepts but also enhanced my ability to write clean, interactive, and efficient code. This task forms the foundation for more complex file-based applications and is an important step in my learning journey as part of the CodTech Java Internship
