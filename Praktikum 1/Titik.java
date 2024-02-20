class Titik{
    //Deklarasi Atribut
    double absis;
    double ordinat;
    static int counterTitik;

    //Deklarasi Konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //Deklarasi Overloading Konstruktor (tugas t3)
    Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    //Deklarasi Method
    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double o){
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    int getcounterTitik(){
        return counterTitik;
    }
}