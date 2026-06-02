public class Main {
    public static void main(String[] args) throws Exception {
        AkunBank akun = new AkunBank();
        try {
            akun.tarikTunai(300000);
            akun.tarikTunai(300000);
            akun.tarikTunai(400000);
        } catch (SaldoTidakMencukupiException e) {
            System.out.println(e.getMessage());
        }

        try {
            akun.transfer(600000);
            akun.transfer(500000);
        } catch (SaldoTidakMencukupiException | BatasTransferHarianException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Sesi transaksi ATM anda telah diakhiri. Kartu dikeluarkan otomatis");
        }
    }
}
