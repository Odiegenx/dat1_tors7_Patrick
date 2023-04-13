package Task3;

public class Chicken extends Animal implements Edible{
double weight;
    Chicken(double weight){
        this.weight = weight;
    }
    @Override
    public String sound() {
        return "Cluck!";
    }
    @Override
    public String howToEat() {
        return "Remove feathers, throw in oven til hot, eat!";
    }
}
