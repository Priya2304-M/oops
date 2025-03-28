public class Book {
    String title;
    String author;
    int year_of_publication;

    public Book(String title, String author, int year_of_publication) {
        this.title = title;
        this.author = author;
        this.year_of_publication = year_of_publication;
    }

    public void title() {
        System.out.println("The title of the book is " + title);
    }

    public void author() {
        System.out.println("The author of the book is " + author);
    }

    public void year() {
        System.out.println("Year of publication of the book is " + year_of_publication);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Adventures of Tom", "Mark Twain", 1957);
        Book book2 = new Book("Hope of Living", "Ayan Sharma", 2000);

        book1.title();
        book1.author();
        book1.year();

        book2.title();
        book2.author();
        book2.year();

        System.out.println("priya");
    }
}
