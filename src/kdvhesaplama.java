import java.util.Scanner;
public class kdvhesaplama {
    public static void main (String [] args){
        double tutar,kdvOran=0.18,kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz:");
        tutar = input.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("Kdvsiz tutar:" +tutar);
        System.out.println("Kdv Oranı:" + kdvOran);
        System.out.println("Kdv tutarı:" + kdvTutar);
        System.out.println("Kdv'li tutarı:" + kdvliTutar);

    }
}
