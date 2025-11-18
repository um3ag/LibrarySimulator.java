# 📚 Library Simulator — Phase 2 (CSC 111 Project)

![Java Badge](https://img.shields.io/badge/Language-Java-red)
![OOP Badge](https://img.shields.io/badge/Concepts-OOP-blue)
![Status Badge](https://img.shields.io/badge/Status-Completed-success)
![GitHub Badge](https://img.shields.io/badge/GitHub-Bonus%20Eligible-yellow)

This repository contains the **Phase 2 implementation** of the CSC 111 Project (Library Simulation) at **King Saud University**.  
This phase focuses on rewriting Phase 1 using **Object-Oriented Programming**, encapsulation, and static tracking.

---

# 🧩 UML Class Diagram (Required)

### 📘 *Member Class UML Diagram (ASCII Version)*





+-------------------------------+
| Member |
+-------------------------------+
| - id : int |
| - name : String |
| - borrowedCount : int |
| - numViewBorrowed : int |
| - numBorrows : int |
| - numReturns : int |
| - sessionFees : double |
+-------------------------------+
| + TotalRevenue : double |
| + TotalViewBorrowed : int |
| + TotalBorrows : int |
| + TotalReturns : int |
+-------------------------------+
| + Member(id, name, count) |
| - canBorrow() : boolean |
| - canReturn() : boolean |
| + viewBorrowedCount() : void |
| + borrowOne() : boolean |
| + returnOne() : boolean |
| + displayStatistics() : void |
| + reset() : void |
+-------------------------------+
