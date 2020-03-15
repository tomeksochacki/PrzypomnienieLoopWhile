import java.util.Scanner;

public class LoopTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int variablewrite = 0;
        
        do { System.out.println("Enter variable: ");
            variablewrite = scanner.nextInt();
        } while (variablewrite != 7);

        int x = variablewrite;
        switch (x) {
            case 7:
                System.out.println("TO jest szczęśliwa siódemka");
                break;
            case 8:
                System.out.println("TO nie jest szczęśliwa siódemka");
                break;
            default:
                System.out.println("TO nie jest liczba");
        }
        


    }

}
