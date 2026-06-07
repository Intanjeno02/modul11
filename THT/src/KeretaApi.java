public class KeretaApi {
    private String namaKereta;
    private String kodeKereta;
    private String rute;
    private int kapasitas;

    public KeretaApi(String namaKereta, String kodeKereta, String rute, int kapasitas) {
        this.namaKereta = namaKereta;
        this.kodeKereta = kodeKereta;
        this.rute = rute;
        this.kapasitas = kapasitas;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public String getKodeKereta() {
        return kodeKereta;
    }

    public String getRute() {
        return rute;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Kereta : " + namaKereta);
        System.out.println("Kode        : " + kodeKereta);
        System.out.println("Rute        : " + rute);
        System.out.println("Sisa Kursi  : " + kapasitas);
    }
}