import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımla.
        int numElements, sum=1, oldsum=0, newsum;
        //Kullanıcıdan eleman sayısını al.
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz :");
        numElements = input.nextInt();

        System.out.print(oldsum + " " + sum + " "); //ilk iki elemanı yazdır.

        for (int i = 1; i<numElements;i++){ //eleman sayısı kadar seri oluştur.
            newsum = oldsum + sum;
            oldsum= sum;
            sum = newsum;
            System.out.print(sum + " ");
        }
    }
}