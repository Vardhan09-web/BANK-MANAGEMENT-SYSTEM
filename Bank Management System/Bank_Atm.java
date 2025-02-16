import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

class Bank_Atm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // Stores User Details(Name->Account Number)
    LinkedHashMap<Integer, String> User = new LinkedHashMap<>();
    // Stores (Account Number->Account Balance)
    LinkedHashMap<Integer, Float> Amount = new LinkedHashMap<>();
    int nextAccId = 555000;

    while (true) {
      System.out.println("...............Welcome to V-Dev Bank.......");
      System.out.println("Enter 1 to Start / 0 to End ");
      int choice = sc.nextInt();
      sc.nextLine();
      if (choice == 0) {
        break;
      }
      if (choice == 1) {

        System.out.println("1.Bank Manager Login");
        System.out.println("2.User Login");
        System.out.println("............................");
        int loginType = sc.nextInt();
        sc.nextLine();

        // Bank Manager Section
        if (loginType == 1) {
          System.out.println("Enter Your Id to Login:");
          String adminId = sc.nextLine();
          System.out.println("Enter Your Password");
          int adminPass = sc.nextInt();
          sc.nextLine();

          if (adminId.equals("vardhan") && adminPass == 266205) {
            System.out.println("Welcome Bank Manager " + adminId);
            System.out.println("1.Add New User Account");
            System.out.println("2.Show all Bank Holders");
            System.out.println(".......................");
            int adminopt = sc.nextInt();
            sc.nextLine();

            if (adminopt == 1) {
              // Add new user
              System.out.println("Enter User Name");
              String name = sc.nextLine();
              User.put(nextAccId, name);
              Amount.put(nextAccId, (float) 1000.0);
              System.out.println("User Account Created successfully!");
              System.out.println("AccountNumber: " + nextAccId);
              System.out.println("Account Holder Name: " + name);
              System.out.println("1000rs intial balance added!");
              System.out.println("Thank you V-Dev Bank!.");
              nextAccId++;
            } 
              //Fetch all Users
              else if (adminopt == 2) {
              System.out.println("Showing All Bank Holders in V-Dev Bank");
              System.out.println("Account Number     Name");
              for (Map.Entry<Integer, String> entry : User.entrySet()) {
                System.out.println(entry.getValue() + "            " + entry.getKey());
              }
            }

          } else {
            System.out.println("Invalid Login Attempt");
          }
        }

        // User Section
        else if (loginType == 2) {
          System.out.println("Enter your Account Number To Login");
          int AccNum = sc.nextInt();
          sc.nextLine();
          if (User.containsKey(AccNum)) {
            System.out.println("Welcome " + User.get(AccNum));
            System.out.println("Choose Below operations");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            int Userchoice = sc.nextInt();
            sc.nextLine();
            
            //deposit amount section
            if (Userchoice == 1) {
              System.out.println("Please Enter Amount to Deposit in your account");
              int DepositAmount = sc.nextInt();
              sc.nextLine();
              // Update Amount after deposit
              Amount.put(AccNum, Amount.get(AccNum) + DepositAmount);
              System.out.println("Amount deposited successfully!..");
            }

            //withdraw amount section 
             else if (Userchoice == 2) {
              System.out.println("Enter Amount to Withdraw from your Account");
              int withdrawAmount = sc.nextInt();
              sc.nextLine();
              Float currentBalance = Amount.get(AccNum);
              if (withdrawAmount > currentBalance) {
                System.out.println("Insufficient Balance please try less amount!");
              } else {
                Amount.put(AccNum, currentBalance - withdrawAmount);
                System.out.println("Amount Withdrawn Successfully!");
              }
            } 
              //check current balance in account
             else if (Userchoice == 3) {
              System.out.println("Your Current Balance is " + Amount.get(AccNum));
            } else {
              System.out.println("Please enter Valid Operation to perform...!");
            }
          } else {
            System.out.println("Please Enter Valid Account Number Try again!");

          }
        }
      }

      else {
        System.out.println("please Enter Valid choice");
      }
    }

  }
}