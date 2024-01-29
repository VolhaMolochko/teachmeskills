package lesson9homework.register;

import lesson9homework.register.contract.EmployeeContract;
import lesson9homework.register.delivery.ContractForDelivery;
import lesson9homework.register.invoice.FinancialInvoice;
import lesson9homework.register.register.Register;

import java.util.Date;

public class MainPart {
    public static void main(String[] args) {
        Register register = new Register();
        ContractForDelivery contractForDelivery = new ContractForDelivery("AD-15", "box", 46, new Date());
        EmployeeContract employeeContract = new EmployeeContract("AS-12", new Date(), new Date(), new Date(), "Egor");
        FinancialInvoice financialInvoice = new FinancialInvoice(457, new Date(), "KK-17", "K-19");

        register.addDoc(contractForDelivery);
        register.addDoc(employeeContract);
        register.addDoc(financialInvoice);

        for (int i = 0; i < register.count; i++) {
            register.docInfo(register.documents[i]);
        }

    }
}