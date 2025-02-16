# Bank Management System (Console-Based)

## Introduction

This is a simple console-based Bank Management System written in Java. It allows users to perform banking operations such as account creation, deposits, withdrawals, and balance inquiries. The system also includes an admin (Bank Manager) login to manage accounts.

## Features

- **Bank Manager Login**
  - Add new user accounts
  - View all bank holders
- **User Login**
  - Deposit money
  - Withdraw money
  - Check account balance
- Initial balance of **1000 INR** is added for each new account.

## Technologies Used

- Java
- LinkedHashMap for data storage
- Scanner for user input

## How to Run

1. Clone this repository:
   ```sh
   git clone https://github.com/your-username/bank-management-system.git
   ```
2. Navigate to the project folder:
   ```sh
   cd bank-management-system
   ```
3. Compile the Java program:
   ```sh
   javac Bank_Atm.java
   ```
4. Run the program:
   ```sh
   java Bank_Atm
   ```

## Usage

### Bank Manager Login

- Use **ID:** `vardhan`
- Use **Password:** `266205`
- Options available:
  - **Add New User Account**: Create a new bank account with an auto-generated account number.
  - **Show all Bank Holders**: View all users with their account numbers.

### User Login

- Enter your **Account Number** to access your account.
- Options available:
  - **Deposit**: Add money to your account.
  - **Withdraw**: Take money from your account (ensuring sufficient balance).
  - **Check Balance**: View your current account balance.

## Example Usage

```
...............Welcome to V-Dev Bank.......
Enter 1 to Start / 0 to End
1

1.Bank Manager Login
2.User Login
............................
1

Enter Your Id to Login:
vardhan
Enter Your Password
******
Welcome Bank Manager vardhan
1.Add New User Account
2.Show all Bank Holders
.......................



