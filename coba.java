import java.util.Timer;
import java.util.TimerTask;

public class coba {
    public static void main(String[] args) {
        Timer timer = new Timer();
        long delay = 10000; // Waktu dalam milidetik sebelum program berakhir
        
        TimerTask task = new TimerTask() {

            public void run() {
                // Kode yang akan dijalankan setelah jangka waktu tertentu
                System.out.println("Program sudah kadaluwarsa.");
                System.exit(0);
            }
        };
        
        timer.schedule(task, delay);
    }
}
