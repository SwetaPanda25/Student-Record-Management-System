# Student-Record-Management-System
This is a simple Command-Line Interface (CLI) based CRUD system for managing student records using Java. It allows you to add, view, update, and delete student records while ensuring that each student ID is unique. ArrayList is used for storing student record.

🚀 Features:-
1. Add a student (with unique ID check)
2. View all students
3. Update a student's name and marks
4. Delete a student by ID
5. Menu-driven interface for ease of use

💡 How it works
Each student has:
1. ID (int) — must be unique
2. Name (String)
3. Marks (double)
The program uses an ArrayList of Student objects.
Before adding a student, it checks if the ID already exists to prevent duplicates.
