import java.util.ArrayList;

public class Reservasi {
    private ArrayList<KeretaApi> daftarKereta;
    public Reservasi() {
        daftarKereta = new ArrayList<>();
        daftarKereta.add(new KeretaApi("Argo Bromo", "K01", "JKT - SBY", 50));
        daftarKereta.add(new KeretaApi("Parahyangan", "K02", "JKT - BDG", 15));
    }

    public void tampilkanJadwal() {
        for (KeretaApi daftar : daftarKereta) {
            daftar.tampilkanInfo();
        }
    }


    public void pesanTiket(String kode, String nik, String nama, int jumlahTiket)
    throws RuteTidakDitemukanException, TiketHabisException {
    if (nik.length() != 16) {
    throw new DataPenumpangTidakValidException("NIK harus 16 digit.");
    }

    for (int i = 0; i < nik.length(); i++) {
    char a = nik.charAt(i);
        if (a < '0' || a > '9') {
        throw new DataPenumpangTidakValidException("NIK hanya boleh berisi angka.");
        }
    }

    KeretaApi keretaDitemukan = null;
    for (KeretaApi daftar : daftarKereta) {
        if (daftar.getKodeKereta().equalsIgnoreCase(kode)) {
            keretaDitemukan = daftar;
            break;
        }
    }

    if (keretaDitemukan == null) {
    throw new RuteTidakDitemukanException("Kode kereta tidak ditemukan.");
    }

    if (jumlahTiket > keretaDitemukan.getKapasitas()) {
    throw new TiketHabisException(keretaDitemukan.getNamaKereta(), keretaDitemukan.getKapasitas());
    }

    keretaDitemukan.setKapasitas(keretaDitemukan.getKapasitas() - jumlahTiket);

    System.out.println("\nPEMESANAN TIKET BERHASIL");
    System.out.println("Nama : " + nama);
    System.out.println("NIK  : " + nik);
    System.out.println("Jumlah Tiket : " + jumlahTiket);
    }
}
