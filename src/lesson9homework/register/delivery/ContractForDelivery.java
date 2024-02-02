package lesson9homework.register.delivery;

import lesson9homework.register.DocExeption.DocumentsNumberException;
import lesson9homework.register.document.Document;

import java.util.Date;

public class ContractForDelivery extends Document {

    private String typeOfItems;
    private int numberOfItems;


    public ContractForDelivery() {
    }

    public ContractForDelivery(String docNumber, String typeOfItems, int numberOfItems, Date docDate) throws DocumentsNumberException {
        super(docNumber, docDate);
        if (!docNumber.contains("abc")||!docNumber.startsWith("555")||!docNumber.endsWith("1a2b")) {
            throw new DocumentsNumberException("Incorrect number format");
        }
        this.typeOfItems = typeOfItems;
        this.numberOfItems = numberOfItems;
    }

    @Override
    public void docInfo() {
        System.out.println("Contract for delivery number:" + docNumber);
        System.out.println("Type of items:" + typeOfItems);
        System.out.println("Number of items:" + numberOfItems);
        System.out.println("Date:" + docDate);
    }
}
