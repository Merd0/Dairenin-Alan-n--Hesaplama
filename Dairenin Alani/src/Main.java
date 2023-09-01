import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    int r;
      double pi = 3.14 , daireninAlanı ,a;

      Scanner inp = new Scanner(System.in);

      System.out.print("Yarıçapı giriniz :" );
        r = inp.nextInt();

      System.out.print("Açı ölçüsünü giriniz :");
        a = inp.nextDouble();

        daireninAlanı = (pi * (r*r) * a) / 360;
      System.out.print("Dairenin alanı = " + daireninAlanı);


        }
    }
