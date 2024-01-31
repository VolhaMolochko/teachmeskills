package lesson10homework;

//xxxx-yyy-xxxx-yyy-xyxy
//x - number
//y - letter
public class Operations {


    public static void firstTwoNumberblocks(String docNumber) { //Вывести на экран в одну строку два первых блока по 4 цифры.
        String[] parts = docNumber.split("-");
        StringBuilder output = new StringBuilder();
        output.append(parts[0]).append(" ").append(parts[2]).append("\n");
        String out0 = output.toString();
        System.out.println(out0);
    }

    public static void changeLetters(String docNumber) { //Вывести на экран номер документа, но блоки из трех букв заменить на ***
        String[] parts = docNumber.split("-");
        StringBuilder output = new StringBuilder();
        output.append(parts[0]).append("-").append("***").append("-").append(parts[2]).append("-").append("***").append("-").append(parts[4]).append("\n");
        String out1 = output.toString();
        System.out.println(out1);
    }

    public static void onlyLetterdLow(String docNumber) { //Вывести на экран только одни буквы из номера документа в формате ууу/ууу/у/у в нижнем регистре
        String[] parts = docNumber.split("-");
        StringBuilder output = new StringBuilder();
        output.append(parts[1].toLowerCase()).append("/").append(parts[3].toLowerCase()).append("/").append(parts[4].substring(1, 2).toLowerCase()).append("/").append(parts[4].substring(3, 4).toLowerCase()).append("\n");
        String out2 = output.toString();
        System.out.println(out2);
    }

    public static void onlyLettersUpp(String docNumber) {  //Вывести на экран буквы из номера документа в формате "Letters:yууу/ууу/у/у" в верхнем регистре(реализовать с помощью класса StringBuilder).
        String[] parts = docNumber.split("-");
        StringBuilder output = new StringBuilder();
        output.append("Letters:").append(parts[1].toUpperCase()).append("/").append(parts[3].toUpperCase()).append("/").append(parts[4].substring(1, 2).toUpperCase()).append("/").append(parts[4].substring(3, 4).toUpperCase()).append("\n");

    }

    public static boolean findCombination(String docNumber, String comb) {
        return docNumber.toLowerCase().contains(comb) || docNumber.toUpperCase().contains(comb);
    }

    public static boolean startWithAbc(String docNumber, String comb) {
        return docNumber.startsWith(comb);
    }

    public static boolean endWithAbc(String docNumber, String comb) {
        return docNumber.endsWith(comb);
    }

}



