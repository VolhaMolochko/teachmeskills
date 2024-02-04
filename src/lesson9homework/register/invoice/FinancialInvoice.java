package lesson9homework.register.invoice;

import lesson9homework.register.DocExeption.DocumentsNumberException;
import lesson9homework.register.document.Document;

import java.util.Date;

public class FinancialInvoice extends Document {
    private double summ;
    private String depCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(double summ, Date docDate, String docNumber, String depCode) throws DocumentsNumberException {
        super(docNumber, docDate);
        if (!docNumber.contains("abc") || !docNumber.startsWith("555") || !docNumber.endsWith("1a2b")) {
            throw new DocumentsNumberException("Incorrect number format");
        }
        this.summ = summ;
        this.depCode = depCode;
    }

    @Override
    public void docInfo() {
        System.out.println("Financial invoice number:" + docNumber);
        System.out.println("Total summ:" + summ);
        System.out.println("Department code:" + depCode);
        System.out.println("Date:" + docDate);
    }

}
