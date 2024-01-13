package lesson6homework;

public class ATM {
    private int amount20;
    private int amount50;
    private int amount100;

    public ATM(int amount20, int amount50, int amount100) {
        this.amount20 = amount20;
        this.amount50 = amount50;
        this.amount100 = amount100;
    }

    public String addCash(int addAmount20, int addAmount50, int addAmount100) {                   //метод добавления денег
        amount20 += addAmount20;
        amount50 += addAmount50;
        amount100 += addAmount100;
        return (amount20 + " " + amount50 + " " + amount100);
    }

    boolean debitSucsess(int outSumm) {
        int count20 = 0;
        int count50 = 0;
        int count100 = 0;
        while (outSumm >= 100 && count100 <= amount100) {
            count100++;
            outSumm -= 100;
        }
        while (outSumm >= 50 && count50 <= amount50) {
            count50++;
            outSumm -= 50;
        }
        while (outSumm >= 20 && count20 <= amount20) {
            count20++;
            outSumm -= 20;
        }
        if (outSumm == 0) {
            System.out.print("100 x " + count100 + " 50 x " + count50 + " 20 x " + count20);
            return true;
        } else {
            System.out.print("fail");
            return false;
        }
    }
}
