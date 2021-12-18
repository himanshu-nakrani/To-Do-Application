package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.*;

/*
Roll No.: 19BEC075
Name: Himanshu Nakrani
Object Oriented Programming Project
Topic: ToDo application in Java
 */

public class Main {

    private static List<String> currentList = new ArrayList<String>();

    public static void main(String[] args) {

        System.out.println("\n\n*-19BEC075 - Object Oriented Programming Project-*");
        int menuItem = -1;

        while (menuItem != 0) {
            menuItem = menu();
            switch (menuItem) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    editTask();
                    break;
                case 4:
                    showList();
                    break;
                case 5:
                    totalTasks();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Enter a valid option");
            }
        }
    }

    public static int menu() {
        System.out.println();
        System.out.println(" _____________________________________ ");
        System.out.println("/--------------Main Menu--------------\\");
        System.out.println("|-------------------------------------|");
        System.out.println("|_______0. Exit the program___________|");
        System.out.println("|_______1. Add an task________________|");
        System.out.println("|_______2. Remove the task____________|");
        System.out.println("|_______3. Edit the task______________|");
        System.out.println("|_______4. Display to-do list_________|");
        System.out.println("|_______5. Display total tasks________|");
        System.out.println();
        System.out.print("Enter choice: ");

        Scanner sc = new Scanner(System.in);
        int choice = -1;

        try {
            choice = sc.nextInt();
        } catch (Exception e) {
            System.out.println("User input was not a number.");
        }
        return choice;
    }

    public static void showList() {
        System.out.println();
        System.out.println(" _____________________________________ ");
        System.out.println("/--------------To-Do List-------------\\");
        System.out.println("|-------------------------------------|");

        int number = 0;
        for (String item : currentList) {
            System.out.println("|  "+ ++number + " " + item);
        }

        System.out.println("|-------------------------------------|");


    }

    public static void addItem() {
        System.out.println("Add Task");
        System.out.println("|-------------------------------------|");
        System.out.print("Enter an item: ");

        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        currentList.add(item);

        System.out.println("Task Added Successfully..");
    }

    public static void removeItem() {
        System.out.println("Remove Task");
        System.out.println("|-------------------------------------|");
        Scanner scanner = new Scanner(System.in);
        System.out.print("What task do you want to remove?");
        int index = scanner.nextInt();

        if((index-1)<0 || index>currentList.size()) {
            System.out.println("Wrong index number! Please enter in range of 1 to "+currentList.size());
        }else {
            currentList.remove(index-1);
        }

        System.out.println("|-------------------------------------|");
        System.out.println("Task Removed Successfully..");
    }

    public static void totalTasks() {
        System.out.println(" _____________________________________ ");
        System.out.println("/-------------Total Tasks------------\\");
        System.out.println("|  no. of tasks: "+currentList.size());
        System.out.println("|-------------------------------------|");
    }

    public static void editTask() {
        System.out.println(" _____________________________________ ");
        System.out.println("/-------------Edit Task--------------\\");
        System.out.println("|-------------------------------------|");

        Scanner scanner = new Scanner(System.in);
        System.out.print("What task do you want to edit?");

        int index = scanner.nextInt();
        if((index-1)<0 || index>currentList.size()) {
            System.out.println("Wrong index number! Please enter in range of 1 to "+currentList.size());
        }else {
            System.out.println("|-------------------------------------|");
            System.out.print("Enter new task: ");
            String newTask = scanner.next();
            currentList.set(index-1, newTask);
        }

        System.out.println("|-------------------------------------|");
        System.out.println("Task Edited Successfully..");
    }

}
