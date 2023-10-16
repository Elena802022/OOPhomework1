public class Tea extends HotDrinks {
    private int temperature;

    @Override
    public void voice() {
        System.out.println("Please it is your tea " + getName() + temperature);
    }

    public Tea(String name, int volume) {
        super(name, volume);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
