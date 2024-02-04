package lesson11homework;

public class Main {
    public static void main (String [] args){
        CustomArrayList list = new CustomArrayList();
        list.addElement("Text");
        list.addElement(746);

        System.out.println(list.get(0));
        System.out.println(list.contains(746));

        System.out.println(list.size());

        list.deleteElement(1);

        System.out.println(list.size());

        list.empty();

        System.out.println(list.size());
    }
}
