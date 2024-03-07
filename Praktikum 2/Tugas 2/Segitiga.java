class Segitiga {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas(){
        return this.alas;
    }

    public double getTinggiSegitiga(){
        return this.tinggi;
    }

    public double HitungLuas() {
        return 0.5 * alas * tinggi;
    }
}

class PrismaSegitiga {
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(double tinggiPrisma, Segitiga alas) {
        this.tinggiPrisma = tinggiPrisma;
        this.alas = alas;
    }

    public double HitungVolume() {
        return alas.HitungLuas() * tinggiPrisma;
    }

    public double HitungLuasPermukaan() {
        double luasAlas = alas.HitungLuas();
        double kelilingAlas = alas.getAlas() * 3;
        double luasSelimut = kelilingAlas * tinggiPrisma;
        return 2 * luasAlas + luasSelimut;
    }
}
