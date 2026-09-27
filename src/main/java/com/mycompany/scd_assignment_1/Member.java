package com.mycompany.scd_assignment_1;

public class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public boolean checkout(Book book) {
        if (book.isCheckedOut()) {
            System.out.println("Error: '" + book.getTitle() + "' is already checked out.");
            return false;
        }
        book.setCheckedOut(true);
        System.out.println(name + " successfully checked out '" + book.getTitle() + "'.");
        return true;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }
}