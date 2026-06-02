public class Pelanggyun {
    int stokKopi;

    Pelanggyun() {
        this.stokKopi = 5;
    }

    public void daftarMember(int umur) {
        if (umur <= 17) {
            throw new IllegalArgumentException("Maaf, umur tidak memenuhi syarat untuk menjadi member VIP.");
        } else {
            System.out.println("Selamat datang, Anda berhasil mendaftar sebagai member VIP!");
        }
    }
    
    public void pesanKopi(int jumlahPesanan){
        if (jumlahPesanan > stokKopi) {
            throw new KopiHabisException("Maaf, stok kopi habis. Silakan coba lagi nanti.");
        } else {
            stokKopi = stokKopi - jumlahPesanan;
            System.out.println("Pesanan kopi Anda berhasil! Stok kopi tersisa: " + stokKopi);
        }
    }
}
