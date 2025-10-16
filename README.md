📘 Challenge 1.4: The Robust File Config Reader
🔍 Description

This Java program reads a configuration file named config.txt which must contain two lines:

A configuration version (as an integer).

A file path (to a resource file).

The goal is to robustly handle various possible issues, such as:

Missing file

Invalid version format

Unsupported config version

Invalid file path

I/O errors

All exceptions are caught, and friendly error messages are displayed to the user. A finally block ensures that a message is printed regardless of success or failure.

💡 Example Input

Contents of config.txt:

1
C:\nonexistent_folder\nonexistent_file.txt

✅ Expected Output
Error: Config version too old!
Config read attempt finished.

💭 Reflection

What I learned:

How to use try-catch-finally blocks to manage multiple types of exceptions.

The importance of reading input line-by-line and validating it before using it.

Throwing and catching custom errors for business logic (like config version checks).

Using File.exists() to validate file paths.

What was difficult:

Remembering the order of exception handling, especially that FileNotFoundException is a subclass of IOException, and must be caught before IOException.

Making sure that all edge cases (missing file, bad format, etc.) are handled gracefully and don't crash the program.

Proper use of the finally block to ensure cleanup or final messages always occur.

📁 Repo Contents
Chapter1_Challenge_1_4/
├── Chapter1_Challenge_1_4.java
├── config.txt
└── README.md

🚀 How to Run

Clone the repo:

git clone https://github.com/your-username/Chapter1_Challenge_1_4.git
cd Chapter1_Challenge_1_4


Compile the Java program:

javac Chapter1_Challenge_1_4.java


Run it:

java Chapter1_Challenge_1_4
