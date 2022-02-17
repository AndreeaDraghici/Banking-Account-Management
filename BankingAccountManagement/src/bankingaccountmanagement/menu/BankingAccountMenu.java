package bankingaccountmanagement.menu;

import bankingaccountmanagement.implementation.BankAccount;
import bankingaccountmanagement.model.Bank;
import bankingaccountmanagement.model.BankAccounts;
import bankingaccountmanagement.model.Customer;
import bankingaccountmanagement.model.CustomerAccount;

import java.time.LocalDate;
import java.util.Vector;
import java.util.Scanner;


//@author: AndreeaDraghici  
//Date: April,2021  

public class BankingAccountMenu {

    Scanner inputScan = new Scanner(System.in);
    BankAccount bankacc = new BankAccount(550);

    protected void DisplayMenu() {
        System.out.println("----- Banking Account Management -----\n");
        System.out.println("0.Exit bank account");
        System.out.println("1.Pre-transaction view");
        System.out.println("2.View after transaction ");
        System.out.println("3.View customer details");
        System.out.println("\nAdd your choice...\n");
    }

    public void Run() {
        int choice = 0;
        try {
            DisplayMenu();

            choice = inputScan.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n");
                    bankacc.Display();
                    bankacc.Add(125.5);
                    bankacc.Retract(255);
                    System.out.println("\n");
                }
                case 2 -> {
                    System.out.println("\n");
                    bankacc.Display();
                    System.out.println("\n");
                }
                case 3 -> {
                    System.out.println("\n");
                    CustomerAccount customer1 = new CustomerAccount(new Customer("Andreea", "Drg", 666), new BankAccount(20));
                    customer1.getCustomer().setFirstName("Andreea");
                    customer1.getCustomer().setSecondName("Drg");
                    customer1.getCustomer().setId(666);
                    System.out.println("\nCustomer's first name: " + customer1.getCustomer().getFirstName());
                    System.out.println("Customer's second name: " + customer1.getCustomer().getSecondName());
                    System.out.println("Customer's id: " + customer1.getCustomer().getId());
                    BankAccounts bankaccs = new BankAccounts(new Bank("ING", "unknown", 200), new Vector<CustomerAccount>());
                    bankaccs.getCurrentAccounts().add(customer1);
                    System.out.println("\n");
                }
                default -> System.out.println("\n");
            }
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
        }
        while (choice != 0) {
            try {
                DisplayMenu();

                choice = inputScan.nextInt();

                switch (choice) {
                    case 1 -> {
                        System.out.println("\n");
                        bankacc.Display();
                        bankacc.Add(125.5);
                        bankacc.Retract(255);
                        System.out.println("\n");
                    }
                    case 2 -> {
                        System.out.println("\n");
                        bankacc.Display();
                        System.out.println("\n");
                    }
                    case 3 -> {
                        System.out.println("\n");
                        CustomerAccount customer1 = new CustomerAccount(new Customer("Andreea", "Drg", 666), new BankAccount(20));
                        customer1.getCustomer().setFirstName("Andreea");
                        customer1.getCustomer().setSecondName("Drg");
                        customer1.getCustomer().setId(666);
                        System.out.println("\nCustomer's first name: " + customer1.getCustomer().getFirstName());
                        System.out.println("Customer's second name: " + customer1.getCustomer().getSecondName());
                        System.out.println("Customer's id: " + customer1.getCustomer().getId());
                        BankAccounts bankaccs = new BankAccounts(new Bank("ING", "unknown", 200), new Vector<>());
                        bankaccs.getCurrentAccounts().add(customer1);
                        System.out.println("\n");
                    }
                    default -> System.out.println("\n");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
        }

        System.out.println("The transaction was completed successfully!");
        for (int i = 0; i < 1; i++) {
            LocalDate randomDate = createRandomDate(2021, 2021);
            System.out.println(randomDate);
        }
    }

    public static int createRandomIntBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static LocalDate createRandomDate(int startYear, int endYear) {
        int day = createRandomIntBetween(1, 28);
        int month = createRandomIntBetween(1, 12);
        int year = createRandomIntBetween(startYear, endYear);

        System.out.println("\n----- The date of the customer accessed the account -----\n");

        return LocalDate.of(year, month, day);
    }

}
