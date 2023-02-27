import java.util.Scanner;
class Palindrome{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("###PALINDROME CHECKER###");

        System.out.print("Masukkan bilangan / kata: ");
        
        //Menerima inputan dari user
        String word = scan.nextLine();

        System.out.println("");

        //Mencetak inputan user
        System.out.println("Input: " + word);

        //Membuat inputan dari user menjadi lower case agar lebih mudah saat prsoes pengecekan
        String wordLCase = word.toLowerCase();

        boolean palindromeStatus = isPalindrome(wordLCase.trim());
        System.out.println("Status Palindrome: " + palindromeStatus);   
    }


    public static boolean isPalindrome(String wordToCheck){
        //Membuat array char untuk mengekstrak tiap karakter dari String yang diinput user
        char[] palindromeWord = new char[wordToCheck.length()];

        //Variabel status untuk menentukan palindrome atau tidak palindrome
        boolean isPalindrome = false;

        for (int i = wordToCheck.length() - 1, j = 0; i >= 0; i--, j++) { 
            //Memasukkan char dari String wordToCheck dengan index dimulai dari akhir ke awal
            palindromeWord[j] = wordToCheck.charAt(i);

            //Memasukkan char dari String wordToCheck dengan index dimulai dari awal ke akhir
            // userWord[j] = wordToCheck.charAt(j);

            //Melakukan pengecekan apakah palindromeWord[j] tidak sama dengan userWord[j]
            //Jika tidak sama,maka loop akan berhenti
            if(palindromeWord[j] != wordToCheck.charAt(i)){
                break;
            }
            //Jika sama, maka isPalindrome akan berubah jadi true lalu loop akan terhenti
            else{
                isPalindrome = true;
                break;
            }
        }
        return isPalindrome;
    }
}