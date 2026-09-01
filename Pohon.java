public class Pohon extends Tanaman {
    private int ukuranBatang;
    private int lebarDaun;

    public void setBatang(int ukuran) {
        ukuranBatang = ukuran;
    }

    public void setDaun(int ukuran) {
        lebarDaun = ukuran;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Diameter batang : "+ukuranBatang+" cm");
        System.out.println("Lebar daun : "+lebarDaun+" cm");
    }
}
