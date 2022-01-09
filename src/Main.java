import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Para Miktarını Girin : ");
        double price = scanner.nextDouble();
        int kdv = price < 1000 ? 18 : 8;
        double totalKdv = price*kdv/100;
        double totalPrice = price + totalKdv;
        System.out.println("Kdv'siz Fiyat = " + price);
        System.out.println("Kdv'li Fiyat = " + totalPrice);
        System.out.println("Kdv Tutarı = " + totalKdv);

    }
}
