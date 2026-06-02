import java.util.Scanner;
import java.util.InputMismatchException;

class Kalkulator {
    public void hitungPembagian(int pembilang, int penyebut) {
        try {
            int hasil = pembilang / penyebut;
            System.out.println("Hasil: " + pembilang + " / " + penyebut + " = " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("\n[ERROR] Terjadi kesalahan matematis: Pembagian dengan nol tidak diperbolehkan!");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Kalkulator kal = new Kalkulator();

        try {
            System.out.println("KALKULATOR PEMBAGIAN (FILE TERPISAH)");

            System.out.print("Masukkan angka pembilang: ");
            int pembilang = input.nextInt();

            System.out.print("Masukkan angka penyebut: ");
            int penyebut = input.nextInt();

            kal.hitungPembagian(pembilang, penyebut);

        } catch (InputMismatchException e) {
            System.out.println("\nTerjadi eror karena input harus berupa angka bulat!");

        } finally {
            input.close();
            System.out.println("\nProses kalkulasi selesai.");
            System.out.println("Resource memori telah dibersihkan.");
        }
    }
}