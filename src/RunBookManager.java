import java.util.ArrayList;
import java.util.Scanner;

public class RunBookManager {

    BookManager bookManager = new BookManager();
    ArrayList<ProgrammingBook> programmingBookList = new ArrayList<>();
    ArrayList<FictionBook> fictionBookList = new ArrayList<>();
    ArrayList<Book> bookList = new ArrayList<>();

    public void searchByLinear() {
        bookManager.setBookList(programmingBookList,fictionBookList,bookList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a book name: ");
        String name = sc.nextLine();
        int price = bookManager.searchBookByNameByLinear(bookList, name);
        if (price != -1) {
            System.out.println("Giá của cuốn sách có tên " + name + " là: " + price);
        } else
            System.out.println("Cuốn sách không có trong thư viện!");
    }

    public void searchByBinary() {
        bookManager.setBookList(programmingBookList,fictionBookList,bookList);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a book name: ");
        String name = sc.nextLine();
        int index = bookManager.searchBookByNameByBinary(bookList, name, 0, bookList.size() - 1);
        if (index != (-1)) {
            System.out.println("Giá của cuốn sách có tên " + name + " là: " + bookList.get(index).getPrice());
        } else
            System.out.println("Cuốn sách không có trong thư viện!");
    }

    public void setProgrammingBookList() {
        bookManager.setProgramingList1(programmingBookList);
    }

    public void setFictionBookList() {
        bookManager.setFictionList1(fictionBookList);
    }

    public void getTotalPrice(){
        bookManager.setBookList(programmingBookList,fictionBookList,bookList);
        bookManager.getTotalPrice(bookList);
    }

    public void checkLanguage(){
        bookManager.setBookList(programmingBookList,fictionBookList,bookList);
        bookManager.checkLanguage(programmingBookList);
    }

    public void sortByChoice(){
        bookManager.setBookList(programmingBookList,fictionBookList,bookList);
        bookManager.sortByChoice(bookList);
    }

    public void sortByInsert(){
        bookManager.setBookList(programmingBookList,fictionBookList,bookList);
        bookManager.sortByInsert(bookList);
    }

    public void sortByBubble(){
        bookManager.setBookList(programmingBookList,fictionBookList,bookList);
        bookManager.sortByBubble(bookList);
    }
}
