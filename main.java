public class main {
    public static void main(String[] args) {
        Komputer mypc = new Komputer();
        Laptop mylaptop = new Laptop();
        Tanaman mytanaman = new Tanaman();
        Pohon mypohon = new Pohon();
        Tws mytws = new Tws();
        Motor mymotor = new Motor();

        System.out.println("\n--- PC ---\n");

        mypc.setCPU("Ryzen 5 2600");
        mypc.setVolume(68);
        mypc.printInfo();

        System.out.println("\n--- Laptop ---\n");

        mylaptop.setCPU("Ryzen 7 8845HS");
        mylaptop.setVolume(52);
        mylaptop.setLid("buka");
        mylaptop.setPower("nyala");
        mylaptop.printInfo();

        System.out.println("\n--- Tanaman ---\n");

        mytanaman.setJenis("Aglaonema");
        mytanaman.setUkuran(10);
        mytanaman.printInfo();
        
        System.out.println("\n--- Pohon ---\n");

        mypohon.setJenis("Pohon Buah");
        mypohon.setUkuran(25);
        mypohon.setBatang(14);
        mypohon.setDaun(6);
        mypohon.printInfo();

        System.out.println("\n--- TWS ---\n");

        mytws.setDiameter(10);
        mytws.setVolume(32);
        mytws.printInfo();

        System.out.println("\n--- Motor ---\n");

        mymotor.engineSize(160);
        mymotor.speedChange(40);
        mymotor.printInfo();
    }
}
