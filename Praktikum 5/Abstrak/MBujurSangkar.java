import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukan sisi Bujur Sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas Bujur Sangkar dengan sisi satuan adalah "+bs.hitungLuas(sisi));
    }
}

// Pertanyaan
// apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar ? jelaskan !

// Jawaban
// Bakal mendapatkan kesalahan kompilasi yang dimana kelas tersebut harus ada metode abstrak yaitu metode abstrak hitungLuas(double sisi) yang dideklarasikan dalam kelas BangunDatar.