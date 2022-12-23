package pro.sky.java.course1.lesson8;

import java.util.Objects;

public class Book {

    private String bookName;
    private Author authorName;
    private int publishingYear;
    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthorName() {
        return authorName;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName);
    }

    @Override
    public String toString() {
        return "Название книги - " + bookName + ", автор - " + authorName.toString() +
                ", год публикации - " + publishingYear;
    }

}
