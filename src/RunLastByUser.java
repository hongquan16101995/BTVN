import java.util.Scanner;

public class RunLastByUser {
    public static void main(String[] args) {
        RunBookManager runBookManager = new RunBookManager();

        boolean cont = true;
        do {
            System.out.println("1. Add in list ProgrammingBookList");
            System.out.println("2. Add in list FictionBookList");
            System.out.println("3. Calculate total price");
            System.out.println("4. Check language of ProgrammingBookList");
            System.out.println("5. Search price by name by linear");
            System.out.println("6. Search price by name by binary");
            System.out.println("7. Book list sort by Choice");
            System.out.println("8. Book list sort by Insert");
            System.out.println("9. Book list sort by Bubble");
            System.out.println("0. Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your choice: ");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    runBookManager.setProgrammingBookList();
                    break;
                case 2:
                    runBookManager.setFictionBookList();
                    break;
                case 3:
                    cont = false;
                    runBookManager.getTotalPrice();
                    break;
                case 4:
                    cont = false;
                    runBookManager.checkLanguage();
                    break;
                case 5:
                    cont = false;
                    runBookManager.searchByLinear();
                    break;
                case 6:
                    cont = false;
                    runBookManager.searchByBinary();
                    break;
                case 7:
                    cont = false;
                    runBookManager.sortByChoice();
                    break;
                case 8:
                    cont = false;
                    runBookManager.sortByInsert();
                    break;
                case 9:
                    cont = false;
                    runBookManager.sortByBubble();
                    break;
                case 0:
                    cont = false;
                    System.out.println("Goodbye!");
                    break;
            }
        }while (cont);
    }
}
