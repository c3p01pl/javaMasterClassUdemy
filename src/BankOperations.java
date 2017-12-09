public class BankOperations {
    public static void main(String[] args) {
        BankAccount operations = new BankAccount(); // "1234", 0.00, "Bob bob", "my@mail.com", "433123321");
        System.out.println(operations.getBalance());
        System.out.println(operations.getPhoneNumber());
        System.out.println("Current balance: " + operations.getBalance());
        operations.depositFunds(3000);
        operations.withdrawFunds(2000);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getVipCustomerName());
        System.out.println(person1.getCreditLimit());

        VipCustomer person2 = new VipCustomer("bob2", "mm@mm.org");
        System.out.println(person2.getVipCustomerName());
        System.out.println(person2.getCreditLimit());

        VipCustomer person3 = new VipCustomer("bobBBB", 111000.00, "aa@aa.org");
        System.out.println(person3.getVipCustomerName());
        System.out.println(person3.getCreditLimit());




    }

//    public void depositFunds(double depositValue){
//        BankAccount account = new BankAccount();
//        double currentBalance = account.getBalance();
//        currentBalance += depositValue;
//        account.setBalance(currentBalance);
//    }
//
//    public void withdrawFunds(double withdrawValue){
//
//    }
}
