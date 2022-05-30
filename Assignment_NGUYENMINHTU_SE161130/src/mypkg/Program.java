package mypkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Program {

    public static void main(String args[]) {
        String[] options = {"Print List Of Book.", "Add A New Book.", "Find Book By The Code", "Quit"};
        int choice = 0;
        BookList list = new BookList();
        list.addFive();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n----------MENU----------");
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    list.descending();
                    list.printListDescending();
                    break;
                case 2:
                    list.addNewBook();
                    break;
                case 3:
                    System.out.print("Enter Code: ");
                    String newCode = sc.nextLine();
                    newCode = newCode.trim().toUpperCase();
                    if (list.searchBookByCode(newCode)==1){
                        System.out.println("***FOUND***");
                    }else{
                        if (list.searchBookByCode(newCode) == 0){
                            System.out.println("***NOT FOUND***");
                        }
                    }
                
                    break;
                default:
                    System.out.println("Bye!");
            }

        } while (choice > 0 && choice < 6);
    }
}
