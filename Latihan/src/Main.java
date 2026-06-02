public class Main {
    public static void main(String[] args) {
        try { //no 2
            Pelanggyun pelanggyun = new Pelanggyun();
            pelanggyun.daftarMember(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
         
        try { // no 3
            Pelanggyun pelanggyun = new Pelanggyun();
            pelanggyun.pesanKopi(10);
        } catch (KopiHabisException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try { // no 4
            MesinKasir mesinKasir = new MesinKasir();
            mesinKasir.bayar(50000, 30000);
        } catch (UangKurangException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try { // no 5
            MesinKasir mesinKasir = new MesinKasir();
            mesinKasir.cetakStruk(false);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Terima kasih telah berkunjung ke Cafe Java Bean. Program kasir ditutup.");
        }
    }
}
