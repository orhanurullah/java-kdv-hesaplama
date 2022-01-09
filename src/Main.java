import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Para Miktarını Girin : ");
        double price = scanner.nextDouble();
        System.out.println(kdvHesapla(price));
    }

    public static String kdvHesapla(double price){
        int kdv = price < 1000 ? 18 : 8;
        double totalKdv = price*kdv/100;
        double totalPrice = price + totalKdv;
        String message = "Kdv'siz Fiyat = " + price +
                "\nKdv'li Fiyat = " + totalPrice +
                "\nKdv Tutarı = " + totalKdv;
        return message;
    }
}
