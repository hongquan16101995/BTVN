import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        ArrayList<ProgrammingBook> programmingBookList = new ArrayList<>();
        ArrayList<FictionBook> fictionBookList = new ArrayList<>();

        bookManager.setProgramingList(programmingBookList);
        bookManager.setFictionList(fictionBookList);

        ArrayList<Book> bookList = new ArrayList<>();
        bookManager.setBookList(programmingBookList, fictionBookList, bookList);


        bookManager.getTotalPrice(bookList);
        bookManager.checkLanguage(programmingBookList);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a book name: ");
        String name = sc.nextLine();
        int price = bookManager.searchBookByNameByLinear(bookList, name);
        if (price != -1) {
            System.out.println("Giá của cuốn sách có tên " + name + " là: " + price);
        } else
            System.out.println("Cuốn sách không có trong thư viện!");

        int index = bookManager.searchBookByNameByBinary(bookList, name, 0, bookList.size() - 1);
        if (index != (-1)) {
            System.out.println("Giá của cuốn sách có tên " + name + " là: " + bookList.get(index).getPrice());
        } else
            System.out.println("Cuốn sách không có trong thư viện!");


        ArrayList<Book> arrayListChoice = bookManager.sortByChoice(bookList);
//        ArrayList<Book> arrayListInsert = bookManager.sortByInsert(bookList);
//        ArrayList<Book> arrayListBubble = bookManager.sortByBubble(bookList);
        System.out.println("Array sorted: ");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
