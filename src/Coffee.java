public class Coffee extends HotDrinks {
    private int temperature;
    @Override
    public void voice() {
        System.out.println("Please it is your coffee " + getName() + temperature);
    }

    public Coffee(String name, int volume) {
        super(name, volume);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

