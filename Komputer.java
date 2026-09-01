public class Komputer {
    private String cpu;
    private int volume = 0;

    public void setCPU(String processor){
        cpu = processor;
    }

    public void setVolume(int vol){
        if (volume <= 100 & volume >= 0) {
            volume = vol;
        } else {
            System.out.println("Rentang volume berada pada 0 - 100");
        }
    }
    
    public void printInfo() {
        System.out.println("CPU : "+cpu);
        System.out.println("Volume : "+volume+"%");
    }
}