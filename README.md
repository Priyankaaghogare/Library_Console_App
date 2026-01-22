# 📚 Library Console App

**Library Console App** is a simple Java console-based application that simulates a library system using **OOP concepts**.  
Members can borrow and return books while the system tracks availability. Perfect for practicing **inheritance, abstraction, and encapsulation**! 🖥️✨

---

## 📝 Features
- 📖 Add and manage books with **ID, title, and author**  
- 👩‍💼 Members can **borrow and return books**  
- ✅ Tracks **book availability** in real-time  
- 🎯 Demonstrates core **OOP principles**

---

## 🏷️ Classes
- `Items` (Abstract) – Base class for all library items  
- `Book` – Represents a book, inherits from `Items`  
- `Member` – Library member who can borrow/return books  
- `Main` – Demo program showing sample books and member interactions

---

## 💻 Usage
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Priyankaaghogare/Library_Console_App.git
Navigate to the project folder:

bash
Copy code
cd Library_Console_App
Compile and run the program:

bash
Copy code
javac library/*.java
java library.Main
🖨️ Example Output
markdown
Copy code
Book ID: 1, Title: Java Fundamentals, Author: James Gosling, Available: Yes
Book ID: 2, Title: Object-Oriented Design, Author: Grady Booch, Available: Yes
Book ID: 3, Title: Object-Oriented Programming, Author: James Oek, Available: Yes
Book ID: 4, Title: Problem Solving Fundamentals, Author: Chris Jorden, Available: Yes

Alice borrowed: Object-Oriented Programming 📚
____________________________________________________________________
Sorry, Object-Oriented Programming is currently not available ❌
____________________________________________________________________
Alice returned: Object-Oriented Programming 🔄
____________________________________________________________________
Bob borrowed: Object-Oriented Programming 📚
____________________________________________________________________
Book ID: 3, Title: Object-Oriented Programming, Author: James Oek, Available: No ❌
⚖️ License
This project is open-source and intended for learning and practice purposes. 🎓

vbnet
Copy code

---

✅ This version fixes:  
- Proper headings and spacing  
- Correct markdown for code blocks  
- Section separation with lines `---`  
- Emojis for every section to make it visually engaging 
