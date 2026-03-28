
package multithreading;

public class NewClass implements Runnable{
    private int lastNum;

    public NewClass() {
    }

    public NewClass(int lastNum) {
        this.lastNum = lastNum;
    }
    
    
    
    

    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }
    }
    
}
