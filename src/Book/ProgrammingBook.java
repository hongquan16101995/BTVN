package Book;

public class ProgrammingBook extends Book {
    private String language;
    private String framework;

    public ProgrammingBook() {

    }

    public ProgrammingBook(int bookCode, String name, int price, String author) {
        super(bookCode, name, price, author);
    }

    public ProgrammingBook(int bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "Book.ProgrammingBook { " + super.toString() + " language = '" + language + '\'' + ", framework = '" + framework + '\'' + '}';
    }
}
