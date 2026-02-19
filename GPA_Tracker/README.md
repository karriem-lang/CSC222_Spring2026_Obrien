# 🎓 Student GPA Tracker

<div align="center">
  
![Java](https://img.shields.io/badge/Java-25-blue?logo=java)
![License](https://img.shields.io/badge/license-MIT-green)
![Status](https://img.shields.io/badge/status-complete-brightgreen)
![Files](https://img.shields.io/badge/files-1-lightgrey)

</div>

## 📋 Overview

The **Student GPA Tracker** is a robust Java application that demonstrates core Object-Oriented 
Programming principles while solving a real-world problem: tracking and calculating student 
GPAs. This program showcases encapsulation, validation, and clean code architecture - all in a 
**single file** as required!

```
┌─────────────────────────────────────┐
│     STUDENT GPA TRACKER v1.0        │
│     "Because every grade matters"   │
└─────────────────────────────────────┘
```

## ✨ Features

| Feature | Description |
|---------|-------------|
| 👥 **Multi-Student Management** | Track any number of students dynamically |
| 🔒 **Data Validation** | Automatically corrects invalid GPAs (negative → 0.0) |
| 📊 **Average Calculation** | Computes class average with precision |
| 🎨 **Formatted Output** | Clean, readable display with 2-decimal formatting |
| 🛡️ **Encapsulation** | Private fields with public access methods |
| 📦 **Single File** | Complete program in one class (Student.java) |

## 🏗️ Architecture

```
┌─────────────────────────────────────────────────┐
│              Student.java (Complete)             │
├─────────────────────────────────────────────────┤
│                                                 │
│  ┌─────────────────────────────────────────┐   │
│  │           Student Class                  │   │
│  │  (Blueprint for individual students)     │   │
│  │  • firstName (private)                   │   │
│  │  • lastName (private)                    │   │
│  │  • gpa (private)                         │   │
│  │  • getters/setters                        │   │
│  │  • toString()                             │   │
│  └─────────────────────────────────────────┘   │
│                      ↑                          │
│                      │                          │
│  ┌─────────────────────────────────────────┐   │
│  │           main() Method                  │   │
│  │  (Program driver/controller)             │   │
│  │  • User input handling                   │   │
│  │  • Student array management              │   │
│  │  • Average calculation                   │   │
│  │  • Results display                       │   │
│  └─────────────────────────────────────────┘   │
│                                                 │
└─────────────────────────────────────────────────┘
```

## 🚀 Quick Start

### Prerequisites
- Java Development Kit (JDK) **25** or higher
- Command line or any Java IDE

### Installation & Running

```bash
# Clone the repository
git clone https://github.com/karriem-lang/CSC222_Spring2026_Obrien.git

# Navigate to project directory
cd CSC222_Spring2026_Obrien/GPA_Tracker

# Compile the program
javac Student.java

# Run the program
java Student
```

## 💻 Usage Example

```bash
========================================
     STUDENT GPA TRACKER
========================================

How many students do you want to track? 3

📝 Enter information for 3 students:

--- Student 1 ---
First name: John
Last name: Smith
GPA (0.0-4.0): 3.5
  ✓ Added: John Smith (GPA: 3.50)

--- Student 2 ---
First name: Jane
Last name: Doe
GPA (0.0-4.0): -1.0
  ⚠️ Negative GPA adjusted to 0.0 for Jane Doe
  ✓ Added: Jane Doe (GPA: 0.00)

--- Student 3 ---
First name: Bob
Last name: Johnson
GPA (0.0-4.0): 3.75
  ✓ Added: Bob Johnson (GPA: 3.75)

========================================
         STUDENT ROSTER
========================================
1. John Smith (GPA: 3.50)
2. Jane Doe (GPA: 0.00)
3. Bob Johnson (GPA: 3.75)

========================================
           SUMMARY
========================================
Total students: 3
Total GPA sum: 7.25
📊 AVERAGE GPA: 2.42
========================================
```

## 🧠 Key Concepts Demonstrated

### 1. **Encapsulation** 🔒
```java
private double gpa;  // Hidden data
public void setGPA(double gpa) {  // Controlled access
    if (gpa < 0) this.gpa = 0.0;  // Validation!
}
```

### 2. **Constructor Initialization** 🏗️
```java
public Student(String firstName, String lastName, double gpa) {
    this.firstName = firstName;
    this.lastName = lastName;
    setGPA(gpa);  // Reuse setter for validation!
}
```

### 3. **Data Validation** ✅
```java
// Automatically converts negative GPAs to 0.0
// Ensures data integrity across the application
```

### 4. **String Formatting** ✨
```java
String.format("%.2f", gpa);  // "3.46" from 3.45678
```

## 📁 File Structure

```
student-gpa-tracker/
│
├── 📄 Student.java          # Complete program (Student class + main)
├── 📄 README.md             # You are here!
└── 📄 .gitignore            # Git ignore rules
```

## 🔮 Future Enhancements

<details>
<summary>Click to see planned improvements</summary>

- [ ] **GPATracker.java** - Separate driver class for better architecture
- [ ] Add GUI interface with JavaFX
- [ ] Implement grade calculation from scores
- [ ] Add file saving/loading
- [ ] Include grade statistics (median, mode, std deviation)
- [ ] Add course/subject tracking
- [ ] Implement sorting by GPA
- [ ] Add search/filter functionality
</details>

## 🐛 Known Issues & Solutions

| Issue | Solution |
|-------|----------|
| Scanner skipping input after nextInt() | Added `scanner.nextLine()` to consume newline |
| Negative GPA values | Validation in setter sets to 0.0 |
| GPA > 4.0 | Validation sets to 0.0 |

## 💻 Manual Git Commands

```bash
# If you're just adding this README:
git add README.md
git commit -m "Add professional README with JDK 25 details"
git push

# Or add everything:
git add .
git commit -m "Complete GPA Tracker with README"
git push
```

## 📜 License

Distributed under the MIT License. See `LICENSE` for more information.

## 🙏 Acknowledgments

* [Oracle Java Documentation](https://docs.oracle.com/en/java/)
* Java Sensei - For the guidance and wisdom 🥋
* All the confused students who asked "why?" - You make learning better!

---

<div align="center">
  
**⭐ Star this repo if you found it useful! ⭐**

**[View Code](Student.java)** • **[Report Bug](https://github.com/issues)** • **[Request 
Feature](https://github.com/issues)**

</div>

<div align="center">
  
```
─────────────────────────────────────
  Made with ☕ and ❤️ by a Java Warrior
  JDK 25 | Single File | OOP Mastery
  To God Be The Glory!!! I❤️JESUS!!!
─────────────────────────────────────
```

</div>
