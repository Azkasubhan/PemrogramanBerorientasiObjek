import java.util.HashMap;
import java.util.Map;

public class MahasiswaLambda {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();

        mahasiswaMap.put("24060123130086", "Muhammad Azka Subhan");
        mahasiswaMap.put("24060123140150", "Indra Purwanto");
        mahasiswaMap.put("24060123120036", "Muhammad Aris Maulana");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + ", Nama: " + nama));
    }
}