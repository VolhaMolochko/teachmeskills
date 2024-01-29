package lesson9homework.register.invoice;

import lesson9homework.register.document.Document;

import java.util.Date;

public class FinancialInvoice extends Document {
    private double summ;
    private String depCode;

    public FinancialInvoice() {
    }

    public FinancialInvoice(double summ, Date docDate, String docNumber, String depCode) {
        super(docNumber, docDate);
        this.summ = summ;
        this.depCode = depCode;
    }
    @Override
    public void docInfo(){
        System.out.println("Financial invoice number:" + docNumber);
        System.out.println("Total summ:" + summ);
        System.out.println("Department code:" + depCode);
        System.out.println("Date:" + docDate);
    }

}
