public class AkunBank {
    private String noRek;
    private double saldo;
    private int totalTransferHariIni;

    public AkunBank() {
        this.noRek = "34294775923";
        this.saldo = 1000000; 
        this.totalTransferHariIni = 0;
    }

    public void tarikTunai(double nominal) throws SaldoTidakMencukupiException {
        if (nominal > saldo) {
            throw new SaldoTidakMencukupiException("Saldo tidak mencukupi");
        } else {
        saldo -= nominal;
        }
        System.out.println("Penarikan tunai sebesar " + nominal + " berhasil. Sisa saldo: " + saldo);
    }

    public void transfer(double nominal) throws SaldoTidakMencukupiException, BatasTransferHarianException {
        if (totalTransferHariIni + nominal > 500000) {
            throw new BatasTransferHarianException("Batas transfer harian telah tercapai");
        } else if (nominal > saldo) {
            throw new SaldoTidakMencukupiException("Saldo tidak mencukupi");
        } else {
            saldo -= nominal;
            totalTransferHariIni += nominal;
            System.out.println("Transfer sebesar " + nominal + " berhasil. Sisa saldo: " + saldo);
        }
    }
}
