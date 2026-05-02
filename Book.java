import java.util.*;

interface Library {
    String bookChoosen(String book);
    String isBookAvailable(String s);
    String LibraryName = "College Library";
}

abstract class Member implements Library {
    String memberName;
    int memberId;

    Member(String memberName, int memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    void displayMemberInfo() {
        System.out.println("Member: " + memberName + " || ID: " + memberId);
    }

    abstract String calculateFine(int daysLate);
}

class Student extends Member {
    Student(String memberName, int memberId) {
        super(memberName, memberId);
    }

    public String bookChoosen(String book) {
        return memberName + " chose: " + book;
    }

    public String isBookAvailable(String s) {
        if (s.equals("Harry Potter"))
            return "Available";
        else
            return "Not Available";
    }

    public String calculateFine(int daysLate) {
        return "Fine: Rs." + (daysLate * 10);
    }
}

class Teacher extends Member {
    Teacher(String memberName, int memberId) {
        super(memberName, memberId);
    }

    public String bookChoosen(String book) {
        return memberName + " chose: " + book;
    }

    public String isBookAvailable(String s) {
        if (s.equals("Clean Code"))
            return "Available";
        else
            return "Not Available";
    }

    public String calculateFine(int daysLate) {
        return "Fine: Rs." + (daysLate * 15);
    }
}

public class Book {
    public static void main(String args[]) {
        System.out.println("-----" + Library.LibraryName + "-----");
        Student s = new Student("Kumaran", 101);
        s.displayMemberInfo();
        System.out.println(s.bookChoosen("Big Bang Theory"));
        System.out.println(s.isBookAvailable("Harry Potter"));
        System.out.println(s.calculateFine(3));
        System.out.println();
        Teacher t = new Teacher("Sam", 201);
        t.displayMemberInfo();
        System.out.println(t.bookChoosen("Clean Code"));
        System.out.println(t.isBookAvailable("Clean Code"));
        System.out.println(t.calculateFine(3));
    }
}
