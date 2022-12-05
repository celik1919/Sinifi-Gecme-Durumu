import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat,fiz,turkce,kimya,muzik;

        int toplam = 0;
        int sayi = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        mat = input.nextInt();
        if (mat > 0 && mat <= 100)
        {
            toplam = toplam + mat;
            sayi++ ;
        }
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if (turkce > 0 && turkce <= 100)
        {
            toplam = toplam + turkce;
            sayi++;

        }
        System.out.print("Fizik Notunuz: ");
        fiz = input.nextInt();
        if (fiz > 0 && fiz <= 100)
        {
            toplam = toplam + fiz;
            sayi++;
        }
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if (kimya > 0 && kimya <= 100)
        {
            toplam = toplam + kimya;
            sayi++;
        }
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if (muzik > 0 && muzik <= 100)
        {
            toplam = toplam + muzik;
            sayi++;
        }
        double avarage = toplam/sayi;

        System.out.println("Ortalamanız: "+avarage);
        if (avarage <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");

        }else{
            System.out.println("Tebrikler, sınıfı geçtiniz.");

        }
    }
}