import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Reservasi reservasi = new Reservasi();
        boolean jalan = true;

        while (jalan) {
            try {
                System.out.println("\nMENU JAVA EXPRESS");
                System.out.println("1. Lihat Jadwal");
                System.out.println("2. Pesan Tiket");
                System.out.println("3. Keluar");
                System.out.print("Pilih : ");

                int menu = input.nextInt();
                input.nextLine();

                switch (menu) {
                    case 1:
                        reservasi.tampilkanJadwal();
                        break;

                    case 2:
                        System.out.print("Kode Kereta : ");
                        String kode = input.nextLine();

                        System.out.print("NIK : ");
                        String nik = input.nextLine();

                        System.out.print("Nama : ");
                        String nama = input.nextLine();

                        System.out.print("Jumlah Tiket : ");
                        int jumlah = input.nextInt();
                        input.nextLine();

                        reservasi.pesanTiket(kode, nik, nama, jumlah);
                        break;

                    case 3:
                        jalan = false;
                        break;

                    default:
                    System.out.println("Menu tidak tersedia.");
                }

            }

            catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka.");
                input.nextLine();
            }

            catch (DataPenumpangTidakValidException e) {
                 System.out.println("Terjadi kesalahan pada data penumpang: " + e.getMessage());
            }

            catch (RuteTidakDitemukanException e) {
                System.out.println("Terjadi kesalahan pada rute: " + e.getMessage());
            }

            catch (TiketHabisException e) {
                System.out.println("Terjadi kesalahan pada tiket: " + e.getMessage());
            }

            finally {
                System.out.println("Proses selesai.");
            }
        }

        input.close();
    }
}