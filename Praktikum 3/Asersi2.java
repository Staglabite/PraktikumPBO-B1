/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang menolak input
 *             jari-jari lingkaran yang bernilai nol
 */
//class Lingkara
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
// Asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert (jariJari > 0) : "Jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran = " + kelilingLingkaran);
    }
}

// secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
// Jawaban : Dikarenakan jariJari di set 0, yang dimana itu melanggar kondisi
//           asersi yang menyatakan bahwa nilai jariJari harus lebih besar dari nol.