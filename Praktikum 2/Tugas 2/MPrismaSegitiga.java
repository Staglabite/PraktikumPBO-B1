public class MPrismaSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(3, 4);
        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(5, segitiga);

        System.out.println("Volume prisma segitiga: " + prismaSegitiga.HitungVolume());
        System.out.println("Luas permukaan prisma segitiga: " + prismaSegitiga.HitungLuasPermukaan());
    }
}