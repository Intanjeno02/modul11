import java.util.*;

public class Kazir {
    public static void main(String[] args)  {
        try {
        int listharga[] = new int [3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.print("Masukkan harga barang ke-" + (i + 1) + ": ");
            listharga[i] = input.nextInt();
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Input harga harus berupa angka!.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Kapasitas memori harga sudah penuh!.");
        }
    }
}
