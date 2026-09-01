public class Tanaman {
    private String jenis;
    private int ukuran;

    public void setJenis(String jenisTumbuhan){
        jenis = jenisTumbuhan;
    }

    public void setUkuran(int size){
        ukuran = size;
    }
    
    public void printInfo() {
        System.out.println("Jenis Tanaman : "+jenis);
        System.out.println("Ukuran Tanaman : "+ukuran+" m");
    }
}