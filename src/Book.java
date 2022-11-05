import java.util.Objects;

public class Book {
    private String titleOfTheBook;
    private int yearOfPublicationOfTheBook;
    private Author author;
    Objects o;
    public Book(String titleOfTheBook, int yearOfPublicationOfTheBook, Author fullName) {
        this.titleOfTheBook = titleOfTheBook;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.author = new Author(author);
    }

    public Author getAuthor() {
        return this.author;
    }

    public String titleOfTheBook() {
        return this.titleOfTheBook;
    }

    public int getYearOfPublicationOfTheBook() {
        return this.yearOfPublicationOfTheBook;
    }

    public void setYearOfPublicationOfTheBook(int yearOfPublicationOfTheBook) {
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublicationOfTheBook == book.yearOfPublicationOfTheBook && titleOfTheBook.equals(book.titleOfTheBook)
                && author.equals(book.author);
    }

    @Override
    public int hashCode() {return Objects.hash(titleOfTheBook, yearOfPublicationOfTheBook, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titleOfTheBook='" + titleOfTheBook + '\'' +
                ", yearOfThePublicationOfTheBook=" + yearOfPublicationOfTheBook +
                ", Author=" + author +
                '}';
    }

}