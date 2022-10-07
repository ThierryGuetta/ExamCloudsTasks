package ClassesAndMethods.Task4;

import java.util.Arrays;

public class Reader {
    private String bio;
    private String birthDate;
    private String phoneNumber;
    private int ticketNumber;
    private String faculty;

    public Reader(String bio, String birthDate, String phoneNumber, int ticketNumber, String faculty) {
        this.bio = bio;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
    }

    public Reader(String bio) {
        this.bio = bio;
    }

    public static Reader[] dataBase(Reader... vars) {
        return vars;
    }

    public void takeBook() {

    }

    public void takeBook(int books) {
        System.out.println(bio + " взял книги: " + books);
    }

    public void takeBook(String... vars) {
        System.out.print(bio + " взял книги: ");
        for (String e : vars) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... vars) {
        System.out.print(bio + " взял книги: ");
        for (Book e : vars) {
            System.out.print(e.getBookName() + ", ");
        }
        System.out.println();
    }

    public void returnBook() {

    }

    public void returnBook(int books) {
        System.out.println(bio + " вернул книги: " + books);
    }

    public void returnBook(String... vars) {
        System.out.print(bio + " вернул книги: ");
        for (String e : vars) {
            System.out.print(e + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... vars) {
        System.out.print(bio + " вернул книги: ");
        for (Book e : vars) {
            System.out.print(e.getBookName() + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Book book1 = new Book("Пушкин А.С.", "Сборник стихов");
        Book book2 = new Book("Столяров А.А.", "Биография");
        Book book3 = new Book("Ермолин П.С.", "Энциклопедия");

        Reader reader1 = new Reader("Alex");
        Reader reader2 = new Reader("Bob");
        Reader reader3 = new Reader("Philipp");

        Reader[] readers = dataBase(reader1, reader2, reader3);

        reader1.takeBook(book1, book2, book3);
        reader2.takeBook(book1.getBookName(), book2.getBookName(), book3.getBookName());
        reader3.takeBook(3);

        reader1.returnBook(book1, book2, book3);
        reader2.returnBook(book1.getBookName(), book2.getBookName(), book3.getBookName());
        reader3.returnBook(3);

    }
}
