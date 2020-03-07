public class CountDownApp {
    public static void main(String[] args) {
        Thread count1 = new CountDownEven();
        Thread count2 = new CountDownOdd();
        count1.start();
        count2.start();
    }
}

class CountDownEven extends Thread {
    public void run() {
        for (int i = 10; i > 0; i -= 2) {
            System.out.println(this.getName() + " Count "  + i);
            Thread.yield();
        }
    }
}

class CountDownOdd extends Thread {
    public void run() {
        for (int i = 9; i > 0; i -= 2) {
            System.out.println(this.getName() + " Count " + i);
            Thread.yield();
        }
    }
}