public class Main {
    public static void main(String[] args) {
        HotDrinks hotDrinks = new HotDrinks("americano", 200);
        //hotDrinks.setName("capucino");
        //hotDrinks.setVolume(150);
        hotDrinks.voice();
        Coffee coffee = new Coffee("makijato", 200);
        coffee.setTemperature(80);
        coffee.voice();
        Tea tea = new Tea("lipton", 250);
        tea.setTemperature(60);
        tea.voice();
    }
}
