package LLD_DesignPatterns.Adapter;

public class ICICIBankAdapter implements BankAPIAdapter{

   private ICICIBankAPILib iciciBankAPILib;
   public ICICIBankAdapter(){
       this.iciciBankAPILib = new ICICIBankAPILib();
   }

    @Override
    public double checkBalance(User user) {
       return iciciBankAPILib.checkBalance(user.getUserToken());
    }

    @Override
    public int doTransaction(User fromUser, User toUser, double amount) {
       return iciciBankAPILib.transferMoney(fromUser.getUserToken(), toUser.getUserToken(),amount);
   }

    @Override
    public boolean addBankDetails(BankDetails bankDetails) {
     return  iciciBankAPILib.addBankAccount(bankDetails.getAccountNumber(),bankDetails.getIfsc(),bankDetails.getPhoneNumber(), bankDetails.getPin());

        }
}
