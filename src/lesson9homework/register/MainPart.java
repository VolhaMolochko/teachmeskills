package lesson9homework.register;

import lesson9homework.register.DocExeption.DocumentsNumberException;
import lesson9homework.register.contract.EmployeeContract;
import lesson9homework.register.delivery.ContractForDelivery;
import lesson9homework.register.invoice.FinancialInvoice;
import lesson9homework.register.register.Register;

import java.util.Date;

public class MainPart {
    public static void main(String[] args) {
        Register register = new Register();
        try {
            ContractForDelivery contractForDelivery = new ContractForDelivery("555abc1a2b", "box", 46, new Date());
            register.addDoc(contractForDelivery);
        } catch (DocumentsNumberException e) {
            System.out.println("Can't create document 1: " + e.getMessage());
        }
        try {
            EmployeeContract employeeContract = new EmployeeContract("ауук", new Date(), new Date(), new Date(), "Egor");
            register.addDoc(employeeContract);
        } catch (DocumentsNumberException e) {
            System.out.println("Can't create document 2: " + e.getMessage());
        }
        try {
            FinancialInvoice financialInvoice = new FinancialInvoice(457, new Date(), "555-abc-1a2b", "K-19");
            register.addDoc(financialInvoice);
        } catch (DocumentsNumberException e) {
            System.out.println("Can't create document 3: " + e.getMessage());
        }
        for (int i = 0; i < register.count; i++) {
            register.docInfo(register.documents[i]);
        }
    }
}