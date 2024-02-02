package lesson9homework.register;

import lesson9homework.register.DocExeption.DocumentsNumberException;
import lesson9homework.register.contract.EmployeeContract;
import lesson9homework.register.delivery.ContractForDelivery;
import lesson9homework.register.invoice.FinancialInvoice;
import lesson9homework.register.register.Register;

import java.util.Date;

public class MainPart {
    public static void main(String[] args) {
        try {
            Register register = new Register();
            ContractForDelivery contractForDelivery = new ContractForDelivery("555abc1a2b", "box", 46, new Date());
            EmployeeContract employeeContract = new EmployeeContract("555abc1a2b", new Date(), new Date(), new Date(), "Egor");
            FinancialInvoice financialInvoice = new FinancialInvoice(457, new Date(), "555abc1a2b", "K-19");

            register.addDoc(contractForDelivery);
            register.addDoc(employeeContract);
            register.addDoc(financialInvoice);

            for (int i = 0; i < register.count; i++) {
                register.docInfo(register.documents[i]);
            }

        } catch (DocumentsNumberException e) {
            System.out.println("Can't create document: " + e.getMessage());

        }

    }
}