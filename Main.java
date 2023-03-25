import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> Hewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();

        // HewanAdd
        Hewan.add("Sapi"); Hewan.add("Kelinci");
        Hewan.add("Kambing"); Hewan.add("Unta"); Hewan.add("Domba");

        System.out.println("Daftar Hewan : " + Hewan);
        // DeleteHewan
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        System.out.println("Hewan yang didelete :\n" + DeleteHewan);
        Hewan.removeAll(DeleteHewan);
        System.out.println("Hewan : " + Hewan);

    }
}