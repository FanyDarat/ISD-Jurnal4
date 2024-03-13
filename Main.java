import java.util.*;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList<Data> listData = new LinkedList<Data>();

        while (true) {
            System.out.println("Pilih Salah Satu Fitur\n" +
                    " 1.Input Tugas\n" +
                    " 2.Hapus Tugas\n" +
                    " 3.Lihat List Tugas\n" +
                    " 4.Keluar");
            int pilihan = s.nextInt();
            s.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan Nama Mata Kuliah: ");
                String matkul = s.nextLine();
                System.out.print("Masukkan Nama Tugas: ");
                String tugas = s.nextLine();
                System.out.print("Masukkan Deadline: ");
                String deadline = s.nextLine();
                listData.addFirst(new Data(matkul, tugas, deadline));
            } else if (pilihan == 2) {
                while (true) {
                    System.out.println(
                            "Pilih Opsi 1.Hapus Paling Didepan || 2.Hapus Paling Belakang || 3.Hapus Berdasarkan Tugas");
                    int pilihan1 = s.nextInt();
                    s.nextLine();

                    if (pilihan1 == 1) {
                        listData.remove(0);
                        break;
                    } else if (pilihan1 == 2) {
                        listData.removeLast();
                        break;
                    } else if (pilihan1 == 3) {

                        System.out.print("Masukkan Nama Tugas: ");
                        String namaTugas = s.nextLine();
                        ListIterator<Data> iterator = listData.listIterator();
                        while (iterator.hasNext()) {
                            if (iterator.next().tugas.equals(namaTugas)) {
                                break;
                            }
                        }
                        iterator.remove();
                        break;
                    } else {
                        System.out.println("Pilihan Tidak Tersedia");
                        continue;
                    }
                }
            } else if (pilihan == 3) {
                System.out.println("Berikut List Tugas Yang Harus Dikerjakan:");
                for (Data data : listData) {
                    System.out.println(data.toString());
                }
            } else if (pilihan == 4) {
                break;
            } else {
                System.out.println("Pilihan Tidak Tersedia");
            }
        }
    }
}
