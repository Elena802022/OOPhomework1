public class HotDrinks {
    private String name;
    private int volume;

    public HotDrinks(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public HotDrinks() {
    }

    public void voice() {
        System.out.println("hello this is your " + name + " it is " + volume + "ml");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}



