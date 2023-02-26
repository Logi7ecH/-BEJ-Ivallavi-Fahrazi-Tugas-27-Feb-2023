import java.util.Arrays;
import java.util.Scanner;
public class VokalKonsonan {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sizeKonsonan = 0,sizeSpasi = 0, sizeSymbol = 0,sizeVokal = 0,sizeA = 0, sizeI = 0, sizeU = 0, sizeE = 0, sizeO = 0;

        System.out.print("Masukkan Kalimat: ");
        String kalimatUser = scan.nextLine();
        System.out.println("Input: " + kalimatUser);
        int ukuranInputAwal = kalimatUser.length();
        System.out.println("Jumlah Panjang Input: " + ukuranInputAwal);

       

        char[] arrVokal = new char[kalimatUser.length()];
        char[] arrKonsonan = new char[kalimatUser.length()];
        char[] arrSpasi = new char[kalimatUser.length()];
        char[] arrSymbol = new char[kalimatUser.length()];

        for (int i = 0; i < kalimatUser.length(); i++) {
            if(kalimatUser.charAt(i) ==  'a' || kalimatUser.charAt(i) == 'A'){
                arrVokal[i] =  kalimatUser.charAt(i);
                sizeA += 1;
                sizeVokal += 1;
            }else if(kalimatUser.charAt(i) ==  'i' || kalimatUser.charAt(i) == 'I'){
                arrVokal[i] =  kalimatUser.charAt(i);
                sizeI += 1;
                sizeVokal += 1;
            }else if(kalimatUser.charAt(i) ==  'u' || kalimatUser.charAt(i) == 'U'){
                arrVokal[i] =  kalimatUser.charAt(i);
                sizeU += 1;
                sizeVokal += 1;
            }else if(kalimatUser.charAt(i) ==  'e' || kalimatUser.charAt(i) == 'E'){
                arrVokal[i] =  kalimatUser.charAt(i);
                sizeE += 1;
                sizeVokal += 1;
            }else if(kalimatUser.charAt(i) ==  'o' || kalimatUser.charAt(i) == 'O'){
                arrVokal[i] =  kalimatUser.charAt(i);
                sizeO += 1;
                sizeVokal += 1;
            }
            else if(kalimatUser.charAt(i) ==  ' '){
                arrSpasi[i] = kalimatUser.charAt(i);
                sizeSpasi += 1;
            }else if(kalimatUser.charAt(i) ==  ',' || kalimatUser.charAt(i) ==  '\'' || kalimatUser.charAt(i) ==  '"' ){
                arrSymbol[i] = kalimatUser.charAt(i);
                sizeSymbol += 1;
            }else{
                arrKonsonan[i] = kalimatUser.charAt(i);
                sizeKonsonan += 1;
            }
        }

       
        if(sizeKonsonan > 0){
            System.out.println("");
            System.out.printf("Jumlah Huruf Konsonan: %d\n", sizeKonsonan);
            System.out.println(Arrays.toString(arrKonsonan));
        }
        
        if(sizeSpasi > 0){
            System.out.println("");
            System.out.printf("Jumlah Spasi: %d\n" , sizeSpasi);
        }

       
        if(sizeSpasi > 0){
            System.out.println("");
            System.out.printf("Jumlah Symbol: %d\n" , sizeSymbol);
            System.out.println(Arrays.toString(arrSymbol));
        }
        System.out.println();
        
        if(sizeVokal > 0){
            System.out.println("Jumlah Huruf Vokal: " + sizeVokal);
            System.out.print(Arrays.toString(arrVokal) + "\t=\t");
            if(sizeA > 0) System.out.printf("A: %d\t", sizeA);
            if(sizeI > 0 )System.out.printf("I: %d\t", sizeI);
            if(sizeU > 0 )System.out.printf("U: %d\t", sizeU);
            if(sizeE > 0 )System.out.printf("E: %d\t", sizeE);
            if(sizeO > 0 )System.out.printf("O: %d\n", sizeO);
        }
       
        
    }
}
