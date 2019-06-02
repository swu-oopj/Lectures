package swu.oopj.recap.salary;

public class BankManager {

    public void payment(Worker worker, double amount) {
        System.out.println(worker.getName() + " - " + worker.getBankNumber() + ": " + amount);
    }
}
