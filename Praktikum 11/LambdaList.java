import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Qaynan");
        mahasiswaList.add("Demas");
        mahasiswaList.add("Shaqi");
        mahasiswaList.add("Raja");

        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
