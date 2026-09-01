public class Motor {
    private int ukuranMesin;
    private int kecepatan;

    public void speedChange(int speed) {
        if (speed >= 0) {
            kecepatan = speed;
        }
    }

    public void engineSize(int ukuran) {
        ukuranMesin = ukuran;
    }

    public void printInfo() {
        System.out.println("Ukuran mesin : " + ukuranMesin+" cc");
        System.out.println("Kecepatan : "+ kecepatan+" km/h");
    }
}
