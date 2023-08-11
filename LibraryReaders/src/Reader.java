import java.time.LocalDate;
import java.util.ArrayList;

public class Reader {
    private String surName;
    private String name;
    private String fatherName;
    private LocalDate birthDay;
    private String faculty;
    private String phoneNumber;
    private int libraryCardNumber;
    private ArrayList<Book> takenBooks;

    public Reader(String surName, String name, String fatherName, LocalDate birthDay) {
        this.surName = surName;
        this.name = name;
        this.fatherName = fatherName;
        this.birthDay = birthDay;
        takenBooks = new ArrayList<>();//взятые книги
    }

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public void takeBook(Book book) {
        takenBooks.add(book);
    }

    public void returnBook(Book book) {
        if(takenBooks.contains(book)) {
            takenBooks.remove(book);
        }
    }
}