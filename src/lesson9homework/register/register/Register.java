package lesson9homework.register.register;

import lesson9homework.register.document.Document;

public class Register {
    public Document[] documents;
    public int count;

    public Register() {
        this.documents = new Document[3];
        this.count = 0;
    }

    public void addDoc(Document document) {
        if (count < 3) {
            documents[count] = document;
            count++;
        } else {
            System.out.println("Can't add more");
        }
    }

    public void docInfo(Document document) {
        document.docInfo();
    }
}
