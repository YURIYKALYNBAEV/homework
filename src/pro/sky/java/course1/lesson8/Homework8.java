package pro.sky.java.course1.lesson8;

public class Homework8 {
    public static void main(String[] args) {
        task1();
    }
    public static void task1() {
        Author authorTolstoy = new Author("Лев", "Толстой");
        Author authorDostoevsky = new Author("Федор", "Достоевский");
        Author authorTolstoyA = new Author("Алексей", "Толстой");

        Book bookNameTolstoy = new Book("Война и мир", authorTolstoy, 1867);
        System.out.println("Название книги - " + bookNameTolstoy.getBookName() + " автор - " +
                authorTolstoy.getAuthorName() + " " + authorTolstoy.getAuthorSurname() +
                " год публикации книги - " + bookNameTolstoy.getPublishingYear());

        Book bookNameDostoevsky = new Book("Преступление и наказание", authorDostoevsky, 1866);
        System.out.println("Название книги - " + bookNameDostoevsky.getBookName() + " автор - " +
                authorDostoevsky.getAuthorName() + " " + authorDostoevsky.getAuthorSurname() +
                " год публикации книги - " + bookNameDostoevsky.getPublishingYear());

        bookNameTolstoy.setPublishingYear(1868);
        System.out.println("Год публикации книги - " + bookNameTolstoy.getPublishingYear());

        Book bookNameTolstoyA = new Book("Аэлита", authorTolstoyA, 1928);
        Book bookNameDostoevsky1 = new Book("Преступление и наказание", authorDostoevsky, 1986);

        System.out.println(bookNameTolstoy);
        System.out.println(authorTolstoy);
        System.out.println(authorTolstoy.equals(authorTolstoyA));
        System.out.println(bookNameTolstoy.equals(bookNameTolstoyA));
        System.out.println(bookNameDostoevsky.equals(bookNameDostoevsky1));
    }
}
