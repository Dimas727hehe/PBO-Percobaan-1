public class Laptop extends Komputer {
    private boolean lid = false;
    private boolean power = false;

    public void setLid(String state) {
        if (state.equalsIgnoreCase("buka")){
            lid = true;
        } else if (state.equalsIgnoreCase("tutup")) {
            lid = false;
        }
    }

    public void setPower(String state) {
        if (state.equalsIgnoreCase("nyala")) {
            power = true;
        } else if (state.equalsIgnoreCase("mati")) {
            power = false;
        }
    }

    @Override
    public void printInfo() {
        super.printInfo();
        if (lid == true) {
            System.out.println("Penutup layar terbuka");
        } else if (lid == false) {
            System.out.println("Penutup layar tertutup");
        }
        if (power == true) {
            System.out.println("Laptop nyala");
        } else if (power == false) {
            System.out.println("Laptop mati");
        }
    }
}
