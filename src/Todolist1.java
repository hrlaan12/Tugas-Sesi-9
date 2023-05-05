import java.util.ArrayDeque;

public class Todolist1 {
    public static void main(String[] args) throws Exception{
        ArrayDeque<String> rutinitas = new ArrayDeque<>();


        //Menambahkan rutinitas dengan fungsi add
        rutinitas.add("Bangun Tidur");
        rutinitas.add("Solat Subuh");
        rutinitas.add("Main Game");
        rutinitas.add("Persiapan Belajar(Kalau Kuliah)");
        rutinitas.add("Jaga Warung");
        rutinitas.add("Solat Dzhur");
        rutinitas.add("Rebahan");
        rutinitas.add("Bikin Konten Tiktok");
        rutinitas.add("Solat Ashar");
        rutinitas.add("Main/Kuliah");
        rutinitas.add("Ngerjain Tugas");
        rutinitas.add("Solat magrib - Isya");
        rutinitas.add("Belajar Ngoding ");
        rutinitas.add("Tidur");
        
        //Output
        System.out.println("==========================");
        System.out.println("rutinitas sehari hari");
        System.out.println("==========================");
        while(!rutinitas.isEmpty()){
            System.out.println(rutinitas.poll());
        }
    }
}
