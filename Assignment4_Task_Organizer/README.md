# 📆Task Organizer

<div align="center">

![Java](https://img.shields.io/badge/Java-25-blue?logo=java)
![License](https://img.shields.io/badge/license-MIT-green)
![Status](https://img.shields.io/badge/status-complete-brightgreen)
![Files](https://img.shields.io/badge/files-1-lightgrey)

</div>

## 📋 Overview

This program is a **Task Organizer** built in Java that allows users to manage
**school and home tasks** efficiently.It demonstrates **inheritance**,
**polymorphism**, **encapsulation**, and clean object-oriented design.

```
┌─────────────────────────────────────┐
│     Task Organizer v1.0             │
│     "Because every grade matters"   │
└─────────────────────────────────────┘
```

## ✨ Features ✨
- Input multiple tasks with details:
    - Task name
    - Duration in hours
    - Priority level (low, medium, high)
    - Type: school or home
    - School-specific: number of meetings, deadline
    - Home-specific: tools required
- Display task details clearly using **overridden `printInfo()` methods**
- Calculate **total hours spent** on tasks
- Identify **which task type had the highest duration**
- Well-formatted output for readability

## 🏗️  Classes 🏗️
| Class           | Description                                                              |
|-----------------|--------------------------------------------------------------------------|
| `Task`          | Base class with common attributes (name, duration, priority) and methods |
| `SchoolTask`    | Derived class for school-related tasks (meetings, deadlines)             |
| `HomeTask`      | Derived class for home-related tasks (tools required)                    |
| `TaskOrganizer` | Main program that runs user input and task management                    |
| `Celebrate`     | Bonus! The Thrill of Victory! -> 'CSS and Java Rocks'                     |

## 🚀 Quick Start
Compile all Java files:
javac Assignment4_Task_Organizer/src/*.java
java Assignment4_Task_Organizer/src/TaskOrganizer

### Prerequisites
- Java Development Kit (JDK) **25** or higher
- Command line or any Java IDE

### Installation & Running

## 💻  Example Output

Task: Complete project report
Duration: 3.50 hours
Priority Level: high
Number of Meetings: 2
Deadline: 2025-10-15

Task: Clean the garage
Duration: 2.00 hours
Priority Level: medium
Tools Required: Broom, vacuum cleaner

Total combined hours spent on tasks: 5.50
School tasks had the highest total duration: 3.50 hours

## 🔮 Future Enhancements
// TODO

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
  JDK 25 | Five Files | OOP Mastery
  To God Be The Glory!!! I❤️JESUS!!!
─────────────────────────────────────
```

</div>
