package lambda;

public class Book {
    private String author;
    private String nameBook;
    private String genre;
    private int numberOfPages;
    private int age;

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", genre='" + genre + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", age=" + age +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book(String author, String nameBook, String genre, int numberOfPages, int age) {
        this.author = author;
        this.nameBook = nameBook;
        this.genre = genre;
        this.numberOfPages = numberOfPages;
        this.age = age;

    }
}


