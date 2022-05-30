package mypkg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class BookList {

    private List<Book> book;

    public BookList() {
        this.book = new ArrayList<>();
    }
//    public Book Search(String code){
//	code = code.trim().toUpperCase();
//	for (int i = 0; i < this.size(); i++){
//	    if(this.get(i).getCode().equals(code)){
//		return this.get(i);
//	    }
//	}
//	return null;
//    }

    public void printListDescending() {

        if (book.size() == 0) {

        } else {
            this.book.forEach(o -> System.out.println(o.toString()));
        }

    }

    public void addFive() {
        this.book.add(new Book("S055", "Anime", 50000, 9));
        this.book.add(new Book("A052", "Humor", 92000, 19));
        this.book.add(new Book("S001", "Creepy", 12000, 2));
        this.book.add(new Book("S234", "Manga", 150000, 10));
        this.book.add(new Book("A333", "Manga", 50000, 8));
    }

    public void descending() {

        Comparator<Book> cmp = new Comparator<Book>() {
            public int compare(Book a, Book b) {
                if (a.getQuantity() != b.getQuantity()) {
                    return  b.getQuantity() - a.getQuantity();
                }
                return a.getCode().compareTo(b.getCode());
            }
        };

        Collections.sort(this.book, cmp);
        System.out.println("-----After Sorting-----");
        for (Book x : book) {
//            x.displayInformation();
        }
    }

    public Book search(String code) {
        code = code.trim().toUpperCase();
        for (int i = 0; i < book.size(); i++) {
            if (book.get(i).getCode().equals(code)) {
                return book.get(i);
            }
        }
        return null;
    }

    private boolean isCodeDupplicated(String code) {
        code = code.trim().toUpperCase();
        return search(code) != null;
    }

    public void addNewBook() {
        String newCode, newTitle;
        float newUnitPrice;
        int newQuantity;
        boolean codeDupplicated = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("-------Input Information-------");
        do {
            System.out.print("Enter Code: ");
            newCode = sc.nextLine();
            newCode = newCode.trim().toUpperCase();
            codeDupplicated = isCodeDupplicated(newCode);
            if (codeDupplicated) {
                System.out.println("Code is duplicated");
            }
        } while (codeDupplicated);
        System.out.print("Enter Title: ");
        newTitle = sc.nextLine();
        System.out.print("Enter Unit Price: ");
        newUnitPrice = Float.parseFloat(sc.nextLine());
        System.out.print("Enter Quantity: ");
        newQuantity = Integer.parseInt(sc.nextLine());

        Book st = new Book(newCode, newTitle, newUnitPrice, newQuantity);
        this.book.add(st);

    }

    public int searchBookByCode(String Code) {
        
            Code.toUpperCase();
            
            if (!this.book.isEmpty()) {
                for (Book st : book) {
                    if (st.getCode().equals(Code)) {
                        System.out.println();
                        st.displayInformation();
                        return 1;
                    } 
                }
            }
            
        return 0;
    }

    public boolean checkCodeDuplicate() {
        return false;
    }
}
