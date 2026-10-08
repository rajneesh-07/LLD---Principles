package LLD_DesignPatterns.Adapter;

public class Main {
    public static void main(String[] args){
        BankAPIAdapter bankAPIAdapter = new ICICIBankAdapter();
        PhonePe phonePe = new PhonePe(bankAPIAdapter);

    }
}
