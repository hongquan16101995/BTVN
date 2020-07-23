import java.util.Scanner;

public class RunLastByUser {
    public static void main(String[] args) {
        RunBookManager runBookManager = new RunBookManager();

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                runBookManager.setProgrammingBookList();
            case 2:
                runBookManager.setFictionBookList();
            case 3:
                runBookManager.getTotalPrice();
            case 4:
                runBookManager.checkLanguage();
            case 5:
                runBookManager.searchByLinear();
            case 6:
                runBookManager.searchByBinary();
            case 7:
                runBookManager.sortByChoice();
            case 8:
                runBookManager.sortByInsert();
            case 9:
                runBookManager.sortByBubble();
        }
    }
}
