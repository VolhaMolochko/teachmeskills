package lesson10homework;

import java.util.Scanner;

//xxxx-yyy-xxxx-yyy-xyxy
//x - number
//y - letter
public class CheckDoc {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String documentNumber = scanner.nextLine();

        Operations.firstTwoNumberblocks(documentNumber);
        Operations.changeLetters(documentNumber);
        Operations.onlyLetterdLow(documentNumber);
        Operations.onlyLettersUpp(documentNumber);
        System.out.println(Operations.findCombination(documentNumber, "abc"));
        System.out.println(Operations.startWithAbc(documentNumber, "1234"));
        System.out.println(Operations.endWithAbc(documentNumber, "1a2b"));

    }
}
