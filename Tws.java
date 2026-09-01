public class Tws {
    private int diameterDriver;
    private int volume;

    public void setDiameter(int diameter) {
        diameterDriver = diameter;
    }

    public void setVolume(int vol) {
        if (volume <= 100 & volume >= 0) {
            volume = vol;
        } else {
            System.out.println("Rentang volume berada pada 0 - 100");
        }
    }

    public void printInfo() {
        System.out.println("Diameter Driver : " + diameterDriver+" mm");
        System.out.println("Volume : "+ volume+"%");
    }
}
