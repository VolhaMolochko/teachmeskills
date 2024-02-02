package lesson9homework.register.document;

import java.util.Date;

public abstract class Document {
    protected String docNumber;
    protected Date docDate;

    public Document() {
    }

    public Document(String docNumber, Date docDate)  {
        this.docNumber = docNumber;
        this.docDate = docDate;
    }

    public abstract void docInfo();


}
