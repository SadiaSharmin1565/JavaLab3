package com.mycompany.book1;
import java.util.Scanner;
public class Book1 {
    private String title;
    private String author;
    private int year;
    private static String genre="Science Fiction";
    private static int totalnumberofbooks;

    public Book1(String title,String author,int year){
        this.title=title;
        this.author=author;
        this.year=year;
        totalnumberofbooks++;
    }
    
     public void displaybookdetails(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Year:"+year);
        System.out.println("Genre:"+genre);

    }
      
    public static void displaybooktotal(){
        System.out.println("Total Book:"+totalnumberofbooks);
      
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Book 1:");
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();
        System.out.print("Year: ");
        int year1 = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter details for Book 2:");
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System.out.print("Year: ");
        int year2 = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter details for Book 3:");
        System.out.print("Title: ");
        String title3 = scanner.nextLine();
        System.out.print("Author: ");
        String author3 = scanner.nextLine();
        System.out.print("Year: ");
        int year3 = scanner.nextInt();
        scanner.nextLine(); 

        Book1 B1 = new Book1(title1, author1, year1);
        Book1 B2 = new Book1(title2, author2, year2);
        Book1 B3 = new Book1(title3, author3, year3);

        B1.displaybookdetails();
        B2.displaybookdetails();
        B3.displaybookdetails();

        Book1.displaybooktotal();

        scanner.close();
    }
}
