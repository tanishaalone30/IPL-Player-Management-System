# 🏏 IPL Player Management System

A **Core Java** console-based application for managing and querying IPL (Indian Premier League) cricket player data. Built using a clean **layered architecture** (Entity → DAO → Service → Controller), this project demonstrates key Object-Oriented Programming concepts and Java Collection Framework usage.

---

## 📋 Table of Contents

- [Features](#-features)
- [Architecture](#-architecture)
- [Project Structure](#-project-structure)
- [Tech Stack](#-tech-stack)
- [Prerequisites](#-prerequisites)
- [How to Run](#-how-to-run)
- [Usage & Menu Options](#-usage--menu-options)
- [Teams & Data](#-teams--data)
- [OOP Concepts Demonstrated](#-oop-concepts-demonstrated)
- [Future Enhancements](#-future-enhancements)
- [Author](#-author)

---

## ✨ Features

- 📃 View **all IPL players** across multiple franchises
- 🏟️ Filter players **by team** — MI, CSK, RCB, SRH
- 🏏 Filter players **by role** — Batters, Bowlers, All-Rounders
- 📊 View player stats including **runs, wickets, jersey number & role**
- 🔄 Interactive **menu-driven** console interface with continuous loop
- 🚪 Clean **exit** option

---

## 🏗️ Architecture

The project follows a **3-tier layered architecture** that cleanly separates concerns:

```
┌──────────────────────────────────┐
│        CONTROLLER LAYER          │
│    (IPLController.java)          │
│    Console UI & User Input       │
├──────────────────────────────────┤
│         SERVICE LAYER            │
│    (IPLService.java)             │
│    Business Logic Delegation     │
├──────────────────────────────────┤
│           DAO LAYER              │
│    (IPLDao.java)                 │
│    Data Access & Filtering       │
├──────────────────────────────────┤
│         ENTITY LAYER             │
│    (IPLPlayer.java)              │
│    Data Model / POJO             │
└──────────────────────────────────┘
```

| Layer          | Responsibility                                                        |
|----------------|-----------------------------------------------------------------------|
| **Entity**     | Defines the `IPLPlayer` POJO with fields, getters, setters & toString |
| **DAO**        | Stores in-memory player data and provides filtered query methods      |
| **Service**    | Acts as a bridge between Controller and DAO layers                    |
| **Controller** | Contains `main()` method, handles user interaction via Scanner        |

---

## 📁 Project Structure

```
IPL_Project/
│
├── entity/
│   └── IPLPlayer.java          # Player entity with 7 attributes
│
├── dao/
│   └── IPLDao.java             # In-memory data store + query methods
│
├── service/
│   └── IPLService.java         # Service layer delegating to DAO
│
├── controller/
│   └── IPLController.java      # Main class with menu-driven console UI
│
└── README.md
```

---

## 🛠️ Tech Stack

| Technology       | Purpose                        |
|------------------|--------------------------------|
| **Java (Core)**  | Programming Language           |
| **Collections**  | `ArrayList`, `List` for data   |
| **Scanner**      | Console input handling         |
| **OOP**          | Encapsulation, Layered Design  |

---

## 📌 Prerequisites

- **Java JDK** 8 or above installed
- Any **IDE** (IntelliJ IDEA / Eclipse / VS Code) or a terminal with `javac` & `java` commands

---

## 🚀 How to Run

### Using Command Line

```bash
# 1. Navigate to the project root directory
cd IPL_Project

# 2. Compile all Java files
javac -d out entity/IPLPlayer.java dao/IPLDao.java service/IPLService.java controller/IPLController.java

# 3. Run the application
java -cp out com.tka.controller.IPLController
```

### Using an IDE (IntelliJ / Eclipse)

1. **Import** the project as a Java project
2. Ensure the package structure matches: `com.tka.entity`, `com.tka.dao`, `com.tka.service`, `com.tka.controller`
3. **Run** `IPLController.java` as the main class

---

## 📖 Usage & Menu Options

When you run the application, you'll see the following interactive menu:

```
===== IPL PLAYER MANAGEMENT =====
1. Show All Players
2. MI Players
3. CSK Players
4. RCB Players
5. SRH Players
6. Show Batters
7. Show Bowlers
8. Show All Rounders
9. Exit
Enter Choice :
```

### Sample Output

```
Enter Choice : 2

1 | 45 | Rohit Sharma | 520 | 0 | MI | Batter
2 | 63 | Suryakumar Yadav | 610 | 0 | MI | Batter
3 | 77 | Tilak Varma | 430 | 0 | MI | Batter
4 | 19 | Hardik Pandya | 320 | 12 | MI | AllRounder
5 | 33 | Tim David | 280 | 3 | MI | AllRounder
6 | 99 | Ishan Kishan | 450 | 0 | MI | Batter
7 | 7  | Jasprit Bumrah | 25 | 24 | MI | Bowler
8 | 24 | Gerald Coetzee | 35 | 18 | MI | Bowler
9 | 55 | Piyush Chawla | 40 | 15 | MI | Bowler
10| 14 | Akash Madhwal | 15 | 11 | MI | Bowler
11| 18 | Luke Wood | 10 | 9 | MI | Bowler
```

> **Output Format:** `PlayerID | JerseyNo | Name | Runs | Wickets | Team | Role`

---

## 🏟️ Teams & Data

The application includes **44 players** across **4 IPL franchises**:

| Team | Full Name                      | Players |
|------|--------------------------------|---------|
| 🔵 MI  | Mumbai Indians              | 11      |
| 🟡 CSK | Chennai Super Kings         | 11      |
| 🔴 RCB | Royal Challengers Bengaluru | 11      |
| 🟠 SRH | Sunrisers Hyderabad         | 11      |

### Player Attributes

| Field      | Type     | Description                        |
|------------|----------|------------------------------------|
| `pid`      | `int`    | Unique Player ID                   |
| `jn`       | `int`    | Jersey Number                      |
| `pname`    | `String` | Player Name                        |
| `runs`     | `int`    | Total Runs Scored                  |
| `wickets`  | `int`    | Total Wickets Taken                |
| `tname`    | `String` | Team Name (MI / CSK / RCB / SRH)  |
| `role`     | `String` | Role (Batter / Bowler / AllRounder)|

---

## 💡 OOP Concepts Demonstrated

| Concept                     | Where It's Used                                           |
|-----------------------------|-----------------------------------------------------------|
| **Encapsulation**           | Private fields with public getters/setters in `IPLPlayer` |
| **Constructor Overloading** | Default + Parameterized constructors in `IPLPlayer`       |
| **Method Overriding**       | `toString()` overridden in `IPLPlayer`                    |
| **Layered Architecture**    | Separation into Entity, DAO, Service, Controller layers   |
| **Collections Framework**   | `ArrayList` and `List` interface used in DAO              |
| **Enhanced For Loop**       | Iterating over player lists in DAO                        |
| **Lambda Expressions**      | `forEach(System.out::println)` in Controller              |
| **Method References**       | `System.out::println` as a method reference               |
| **Packages**                | Organized into `com.tka.*` packages                       |

---

## 🔮 Future Enhancements

- [ ] Add **CRUD operations** (Create, Update, Delete players)
- [ ] Integrate **JDBC / MySQL** for persistent data storage
- [ ] Add **search by player name** functionality
- [ ] Implement **sorting** (by runs, wickets, name)
- [ ] Add more teams (KKR, DC, RR, PBKS, GT, LSG)
- [ ] Build a **REST API** layer using Spring Boot
- [ ] Add a **front-end UI** using HTML/CSS/JS or React

---

## 👤 Author

Developed as a **Core Java** practice project demonstrating layered architecture, OOP principles, and Java Collections Framework.

---

> ⭐ _If you found this project helpful, feel free to star the repository!_
