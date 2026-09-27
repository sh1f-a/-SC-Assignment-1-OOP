package com.mycompany.scd_assignment_1;

public class LibraryTest {
    public static void main(String[] args) {
        System.out.println("=== TASK 4: AI REFACTOR TEST ===");
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Member member1 = new Member("Alice", 101);
        Member member2 = new Member("Bob", 102);

        member1.checkout(book1);
        member2.checkout(book1); // Should trigger validation error
    }
}