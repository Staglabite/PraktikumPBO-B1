/**
 * File      : AgkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *             pengenalan kalusa 'throw' dan 'throws'
 */
public class AngkaSial {

    public void cobaAngka (int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " Bukan angka sial");
    }

    public static void main(String [] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukan angka!!!");
        }
    }
}

// Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// Jawaban : Ketika eksepsi terjadi pada eksekusi as.cobaAngka(13);,
//           blok catch akan menangani eksepsi AngkaSialException.
//           Jadi, pernyataan System.out.println(angka + " Bukan angka sial");
//           tidak akan dieksekusi karena kontrol aliran program telah beralih ke blok catch.

// Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// Jawaban : catch (AngkaSialException ase) pada AngkaSial.java akan dieksekusi jika terjadi
//           eksepsi AngkaSialException dalam blok try. Ini karena baris tersebut harus menangkap
//           eksepsi yang dilempar oleh method cobaAngka() ketika sebuah angka 13 dimasukkan.