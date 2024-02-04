package lesson9homework.register.contract;

import lesson9homework.register.DocExeption.DocumentsNumberException;
import lesson9homework.register.document.Document;

import java.util.Date;

public class EmployeeContract extends Document {

    private Date docStartDate;
    private Date docEndDate;
    private String employeeName;

    public EmployeeContract() {
    }

    public EmployeeContract(String docNumber, Date docDate, Date docStartDate, Date docEndDate, String employeeName) throws DocumentsNumberException {
        super(docNumber, docDate);
        if (!docNumber.contains("abc") || !docNumber.startsWith("555") || !docNumber.endsWith("1a2b")) {
            throw new DocumentsNumberException("Incorrect number format");
        }
        this.docStartDate = docStartDate;
        this.docEndDate = docEndDate;
        this.employeeName = employeeName;
    }

    @Override
    public void docInfo() {
        System.out.println("Employee contract number:" + docNumber);
        System.out.println("Start date:" + docStartDate);
        System.out.println("End date:" + docEndDate);
        System.out.println("Date:" + docDate);
        System.out.println("Employee name:" + employeeName);
    }
}
