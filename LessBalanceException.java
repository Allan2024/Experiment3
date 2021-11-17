import java.text.NumberFormat;
import java.util.Scanner;
        class Account1 {
            void balance_Account1() {
                System.out.println(" Your current balance is");
                int balance1 = 1000;
                System.out.println(balance1);
                System.out.println("Enter money to deposit:");
                Scanner scanner = new Scanner(System.in);
                int Deposit1 = scanner.nextInt();
                balance1 = Deposit1 + balance1;
                System.out.println(Deposit1);
                System.out.println("Enter amount of money to withdraw");
                Scanner Scanner = new Scanner(System.in);
                int Withdraw1 = Scanner.nextInt();
                try {
                    if (Withdraw1 >= 1001) {
            throw new LessBalanceException();
                    }

                } catch ( LessBalanceException e) {
                    System.out.println("Less Balance exception");
                }
                if (Withdraw1 <= 1000) {
                    balance1 = balance1 - Withdraw1;
                    System.out.println("left balance is: " + balance1);
                }

            }
        }
        class Account2 extends Account1{
            public int balance2 = 2000;

            void balance_account2(){
                System.out.println(" Your current balance is");
                System.out.println(balance2);
                System.out.println("Enter amount of money to deposit:");
                Scanner drop=new Scanner(System.in);
                int Deposit2= drop.nextInt();
                balance2=Deposit2+ balance2;
                System.out.println("Total amount:"+  Deposit2);
                System.out.println("Enter amount of money to withdraw:");
                Scanner scanner = new Scanner(System.in);
                int Withdraw2 = scanner.nextInt();
                balance2 = balance2-Withdraw2;
                System.out.println("Withdrawal Succesfull"+"  Balance remaining:"+balance2);

            }}
public class LessBalanceException extends Throwable {
    public static void main(String[] args) {
        Account1 obj1= new Account1();
        Account2 obj2= new Account2();
        obj1.balance_Account1();
        obj2.balance_account2();
    }
    }




