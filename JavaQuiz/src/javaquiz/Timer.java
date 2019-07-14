package javaquiz;

public class Timer {
    
    public static void countdown() throws InterruptedException {
        int time = 10;
        while (time>0){
             System.out.print("### " + time + " Seconds Remaining");
             Thread.sleep(1000);
             System.out.print("\b"); // makes the output blank
             Thread.sleep(1000);
             time--;
         }
         System.out.println("Time is up! ");
    }

}
