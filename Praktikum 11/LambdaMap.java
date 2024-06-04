import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswa = new HashMap<>();

        mahasiswa.put("24060122140170", "Qaynan");
        mahasiswa.put("24060122140161", "Demas");
        mahasiswa.put("24060122140111", "Raja");
        mahasiswa.put("24060122140222", "Shaqi");

        mahasiswa.forEach((nim, nama) -> {
            System.out.println("NIM: " + nim + " - Nama: " + nama);
        });
    }
}
