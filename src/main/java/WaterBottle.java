public class WaterBottle {
    private String name;
    private Integer volume;

    public WaterBottle(String name) {
        this.name = name;
        this.volume = 100;
    }

    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void drink(){
        this.volume -= 10;
    }

    public void empty(){
        this.volume = 0;
    }
}
