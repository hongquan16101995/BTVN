package Book;

import Book.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BookManager {

    public ArrayList<Book> sortByChoice(ArrayList<Book> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            int min = bookList.get(i).getPrice();
            int indexmin = i;
            for (int j = i + 1; j < bookList.size(); j++) {
                if (bookList.get(j).getPrice() < min) {
                    min = bookList.get(j).getPrice();
                    indexmin = j;
                }
            }
            Book book;
            book = bookList.get(indexmin);
            bookList.set(indexmin, bookList.get(i));
            bookList.set(i, book);
            System.out.print(bookList.get(i).getPrice() + "\t");
            System.out.println(bookList.get(indexmin).getPrice());
        }
        return bookList;
    }


    public ArrayList<Book> sortByInsert(ArrayList<Book> bookList) {
        for (int i = 1; i < bookList.size(); i++) {
            Book key = bookList.get(i);
            int j;
            for (j = i - 1; j >= 0 && bookList.get(j).getPrice() > key.getPrice(); j--) {
                Book book;
                book = bookList.get(j);
                bookList.set(j + 1, book);
            }
            bookList.set(j + 1, key);
            for (Book book : bookList){
                System.out.print(book.getPrice() + "\t");
            }
            System.out.println();
        }
        return bookList;
    }


    public ArrayList<Book> sortByBubble(ArrayList<Book> bookList) {
        for (int i = 0; i < bookList.size(); i++) {
            boolean checkChange = false;
            System.out.println("Change " + i);
            for (int j = bookList.size() - 1; j > i; j--) {
                if (bookList.get(j).getPrice() < bookList.get(j - 1).getPrice()) {
                    Book book;
                    book = bookList.get(j);
                    bookList.set(j, bookList.get(j - 1));
                    bookList.set(j - 1, book);
                    checkChange = true;
                    System.out.print(bookList.get(j-1).getPrice() + "\t");
                    System.out.println(bookList.get(j).getPrice());
                }
            }
            if (!checkChange){
                return bookList;
            }
        }
        return bookList;
    }


    public void setProgramingList(ArrayList<ProgrammingBook> programmingBookList) {
        programmingBookList.add(new ProgrammingBook(1, "Hoa", 30000, "Anh", "Java", "SpringMVC"));
        programmingBookList.add(new ProgrammingBook(2, "Ly", 90000, "Bảo", "PHP", "SpringMVC"));
        programmingBookList.add(new ProgrammingBook(3, "Sinh", 10000, "Công", "Java", "SpringMVC"));
        programmingBookList.add(new ProgrammingBook(4, "Quocphong", 80000, "Dũng", "C++", "SpringMVC"));
        programmingBookList.add(new ProgrammingBook(5, "Tin", 40000, "Minh", "Python", "SpringMVC"));
    }


    public void setProgramingList1(ArrayList<ProgrammingBook> programmingBookList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a bookCode of book: ");
        int bookCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a name of book: ");
        String name = sc.nextLine();
        System.out.println("Enter a price of book: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a author of book: ");
        String author = sc.nextLine();
        System.out.println("Enter a language of book: ");
        String language = sc.nextLine();
        System.out.println("Enter a framework of book: ");
        String framework = sc.nextLine();
        programmingBookList.add(new ProgrammingBook(bookCode,name,price,author,language,framework));
    }


    public void setFictionList(ArrayList<FictionBook> fictionBookList) {
        fictionBookList.add(new FictionBook(10, "Kythuat", 100000, "Ngọc", "Giáo khoa"));
        fictionBookList.add(new FictionBook(20, "Van", 60000, "Long", "Giáo khoa"));
        fictionBookList.add(new FictionBook(30, "Congnghe", 50000, "Huy", "Giáo khoa"));
        fictionBookList.add(new FictionBook(40, "GDCD", 20000, "Quang", "Giáo khoa"));
        fictionBookList.add(new FictionBook(50, "Anh", 70000, "Thành", "Giáo khoa"));
    }


    public void setFictionList1(ArrayList<FictionBook> fictionBookList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a bookCode of book: ");
        int bookCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a name of book: ");
        String name = sc.nextLine();
        System.out.println("Enter a price of book: ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a author of book: ");
        String author = sc.nextLine();
        System.out.println("Enter a category of book: ");
        String category = sc.nextLine();
        fictionBookList.add(new FictionBook(bookCode,name,price,author,category));
    }


    public void setBookList(ArrayList<ProgrammingBook> programmingBookList, ArrayList<FictionBook> fictionBookList, ArrayList<Book> bookList) {
        bookList.addAll(programmingBookList);
        bookList.addAll(fictionBookList);
    }


    public void getTotalPrice(ArrayList<Book> bookList) {
        int sum = 0;
        for (Book book : bookList) {
            sum += book.getPrice();
        }
        System.out.println("Tổng giá tiền là: " + sum);
    }


    public void checkLanguage(ArrayList<ProgrammingBook> programmingBookList) {
        int count = 0;
        for (ProgrammingBook programmingBook : programmingBookList) {
            boolean checkLanguage = programmingBook.getLanguage().equals("Java");
            if (checkLanguage) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Không có cuốn sách nào có language là 'Java'!");
        } else
            System.out.println("Số cuốn sách có language là 'Java' là: " + count);
    }


    public int searchBookByNameByLinear(ArrayList<Book> bookList, String name) {
        for (Book book : bookList) {
            boolean checkName = book.getName().equals(name);
            if (checkName) {
                return book.getPrice();
            }
        }
        return -1;
    }


    public int searchBookByNameByBinary(ArrayList<Book> bookList, String name, int low, int high) {
        sortByComparator(bookList);
        int mid = (low + high) / 2;
        if (high >= low) {
            char characterFirstOfName = bookList.get(mid).getName().charAt(0);
            char characterFirstOfEnterName = name.charAt(0);
            if (characterFirstOfName == characterFirstOfEnterName) {
                return mid;
            } else if (characterFirstOfName > characterFirstOfEnterName) {
                return searchBookByNameByBinary(bookList, name, low, mid - 1);
            } else
                return searchBookByNameByBinary(bookList, name, mid + 1, high);
        }
        return -1;
    }


    private void sortByComparator(ArrayList<Book> bookList) {
        Collections.sort(bookList, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getName().charAt(0) - (book2.getName().charAt(0));
            }
        });
    }
}

