class Titik{
    //Deklarasi Atribut
    private double absis;
    private double ordinat;
    private static int counterTitik;

    //Deklarasi Konstruktor
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    //Deklarasi Overloading Konstruktor (tugas t3)
    public Titik(double a, double o){
        absis = a;
        ordinat = o;
        counterTitik++;
    }

    //Deklarasi Method
    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double o){
        ordinat = o;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    int getCounterTitik(){
        return counterTitik;
    }
}