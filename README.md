### 💼 Project Title

Java-Based ATM Simulator Application.

### 📝 Project Description

The ATM Simulator is a Java-based console application designed to replicate the essential functionalities of an Automated Teller Machine (ATM).  
This project allows users to log in using their PIN, check account balance, deposit money, and withdraw funds — all through a simple, interactive console interface.
It is built with object-oriented principles and integrates Excel-based data storage, providing a realistic banking simulation without using databases.

### 🚀 Key Features

1. **User Authentication**

    - Each user must enter a valid PIN number to access their account.

    - PIN validation is performed securely through the UserAccount class.

2. **Balance Inquiry**

    - Displays the user’s current balance retrieved from the stored account data.

3. **Deposit Functionality**

    - Users can deposit any positive amount, which immediately updates the balance in memory.

    - Validations ensure that negative or invalid deposits are rejected.

4. **Withdrawal Functionality**

    - Users can withdraw amounts (minimum 500) within their available balance.

    - The system checks for insufficient balance and displays helpful error messages.

5. **Excel Integration**

    - Instead of manual data entry, user account information (Account Number, PIN, Balance) is read dynamically from an Excel file using Apache POI.

    - This simulates a lightweight data management system.

6. **Interactive Console Menu**

    - A user-friendly text-based interface allows navigation through menu options:
    Check Balance, Deposit Money, Withdraw Money, and Exit.

### 🗂️ Project Structure

```
ATM-Simulator/
├── src/
│   └── atm/
│       └── simulators/
│           ├── ATM.java           # Handles authentication and menu operations
│           ├── UserAccount.java   # Defines user properties and actions
│           ├── ExcelReader.java   # Reads user info from Excel file
│           └── ATMRunMain.java    # Main class – starts the program
├── UserInfo.xlsx                  # Excel data file (accountNumber, pinNumber, balance)
└── pom.xml                        # Maven dependencies (Apache POI, Log4j)

```

### 🛠️ Tech Stack

```
| Component              | Description                       |
| ---------------------- | --------------------------------- |
| **Language**           | Java                              |
| **IDE**                | Netbeans |
| **External Library**   | Apache POI (for Excel reading)    |
| **Logging (optional)** | Log4j2                            |
| **Input Handling**     | Java Scanner Class                |
```

### 🔹 Workflow

1. When the program starts, the Excel file is read using ExcelReader.

2. Each row creates a UserAccount object.

3. The user enters their PIN to authenticate.

4. Upon successful login, a menu appears allowing operations like:

- View balance

- Deposit money

- Withdraw money

- Exit ATM

### 💡 Concepts Demonstrated

Object-Oriented Programming (Encapsulation, Classes, Methods)

- File Handling using Apache POI

- Data Validation & Exception Handling

- Menu-driven Console Interaction

- Reusability through Modular Code Design

### 🏁 Conclusion

The ATM Simulator Project effectively demonstrates core Java programming concepts and real-world logic through a modular, scalable design.  
Its Excel integration adds realism by simulating persistent user data storage, making it a great learning project for beginners transitioning into Java file handling and OOP-based application development.

