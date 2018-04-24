package step24_MultiThread.ex5;

class ATMTwo implements Runnable {
    private long depositeMoney = 10000;

    @Override
    public void run() {
     // TODO Auto-generated method stub
     synchronized (this) {
      for (int i = 0; i < 10; i++) {
       if (getDepositeMoney() <= 0)
        break;                    //잔액이 없을 경우 종료
       withDraw(1000);
       if (getDepositeMoney() == 2000 || getDepositeMoney() == 4000
         || getDepositeMoney() == 6000
         || getDepositeMoney() == 8000) {
        try {
         this.wait();   //2000원을 출금하면 현쓰레드는 대기상태로...

        } catch (InterruptedException e) {
         e.printStackTrace();
        }
       } else {
        this.notify();   //대기상태에 있던 쓰레드들이 준비상태로 전환됨
       }

      }
     }
    }

    public void withDraw(long howMuch) {
     if (getDepositeMoney() > 0) {
      depositeMoney -= howMuch;    
      System.out.print(Thread.currentThread().getName() + ", ");
      System.out.println("잔액:" + getDepositeMoney());
     } else {
      System.out.print(Thread.currentThread().getName() + ", ");
      System.out.println("잔액이 부족해용");
     }
    }

    public long getDepositeMoney() {
     return depositeMoney;
    }
   }

   public class Test {

    public static void main(String[] args) {
     ATMTwo atm = new ATMTwo();                
     Thread mother = new Thread(atm, "mother"); 
     Thread son = new Thread(atm, "son");
     mother.start();  // mother 스레드 시작
     son.start();     // son 스레드 시작

    }
   }
