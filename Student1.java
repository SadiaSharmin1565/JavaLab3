package com.mycompany.student1;
import java.util.Scanner;
public class Student1 {
    
    
    private int id;
    private String name;
    private String department;
    private double cgpa;
    private static String university="ULAB";
    private static int Studentcount;
    
    
    
    public Student1(int id,String name,String department,double cgpa){
       this.id=id;
       this.name=name;
       this.department=department;
       this.cgpa=cgpa;
       Studentcount++;
    }
    
    
     public void displayStudentdetails(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Department:"+department);
        System.out.println("CGPA:"+cgpa);
        System.out.println("University:"+university);

    
    }
     
     
    public static void displayStudenttotal(){
        System.out.println("Total Student:"+Studentcount);
      
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Enter details for Student 1:");
        System.out.print("ID: ");
        int id1 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Name: ");
        String name1 = scanner.nextLine();
        System.out.print("Department: ");
        String department1 = scanner.nextLine();
        System.out.print("CGPA: ");
        double cgpa1 = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.println("Enter details for Student 2:");
        System.out.print("ID: ");
        int id2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Name: ");
        String name2 = scanner.nextLine();
        System.out.print("Department: ");
        String department2 = scanner.nextLine();
        System.out.print("CGPA: ");
        double cgpa2 = scanner.nextDouble();
        scanner.nextLine(); 
        
        System.out.println("Enter details for Student 3:");
        System.out.print("ID: ");
        int id3 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Name: ");
        String name3 = scanner.nextLine();
        System.out.print("Department: ");
        String department3 = scanner.nextLine();
        System.out.print("CGPA: ");
        double cgpa3 = scanner.nextDouble();
        scanner.nextLine(); 

        
        Student1 S1=new Student1(id1,name1,department1,cgpa1);
        Student1 S2=new Student1(id2,name2,department2,cgpa2);
        Student1 S3=new Student1(id3,name3,department3,cgpa3);
        S1.displayStudentdetails();
        S2.displayStudentdetails();
        S3.displayStudentdetails();
        
        Student1.displayStudenttotal();
    }
}
