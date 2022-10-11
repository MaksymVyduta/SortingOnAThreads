import java.util.Arrays;

class Contestant11 implements Runnable , Tablica  {
    @Override
    public void run(){
        int tablica[]= new int[2000000];
        for (int i=0; i<2000000;i++){
            tablica [i] =nowaTablica[10][i];}
        Arrays.sort(tablica);
        for (int i=0; i<2000000;i++){
            nowaTablica[10][i]=tablica [i];}
    }

}