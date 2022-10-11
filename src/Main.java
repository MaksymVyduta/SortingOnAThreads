import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class Main implements Tablica {
    public static int[][] LosowanieTablicy() {
        int wylosowane[][] = new int[16][2000000];
        Random los = new Random();
        for (int i = 0; i < wylosowane.length; i++) {
            for (int j = 0; j < wylosowane[i].length; j++) {
                wylosowane[i][j] = los.nextInt(2000000000);
            }
        }
        return wylosowane;
    }

    public static void main(String[] args) throws InterruptedException , FileNotFoundException {
        long millisActualTime = System.currentTimeMillis();
        Thread t1 = new Thread(new Contestant1());
        Thread t2 = new Thread(new Contestant2());
        Thread t3 = new Thread(new Contestant3());
        Thread t4 = new Thread(new Contestant4());
        Thread t5 = new Thread(new Contestant5());
        Thread t6 = new Thread(new Contestant6());
        Thread t7 = new Thread(new Contestant7());
        Thread t8 = new Thread(new Contestant8());
        Thread t9 = new Thread(new Contestant9());
        Thread t10 = new Thread(new Contestant10());
        Thread t11 = new Thread(new Contestant11());
        Thread t12 = new Thread(new Contestant12());
        Thread t13 = new Thread(new Contestant13());
        Thread t14 = new Thread(new Contestant14());
        Thread t15 = new Thread(new Contestant15());
        Thread t16 = new Thread(new Contestant16());


        t1.start(); t2.start();t3.start();t4.start();t5.start();t6.start();t7.start();t8.start();t9.start();t10.start();t11.start();
        t12.start();t13.start();t14.start();t15.start();t16.start();

        t1.join(); t2.join();t3.join();t4.join();t5.join();t6.join();t7.join();t8.join();t9.join();t10.join();t11.join();
        t12.join();t13.join();t14.join();t15.join();t16.join();


            PrintWriter zapis = new PrintWriter("tablica.txt");
            for(int i=0; i<16; i++)
            {
                for(int j=0; j<2000000; j++)
                    zapis.print(nowaTablica[i][j]+"\t");
                zapis.println();
            }
            zapis.close();
        long executionTime = System.currentTimeMillis() - millisActualTime;
        System.out.println(executionTime);

  //
        ///
        /// Nup

    }
}
