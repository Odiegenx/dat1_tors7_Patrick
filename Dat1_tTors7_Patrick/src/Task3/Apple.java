package Task3;

public class Apple extends Fruit implements Edible{
    int weight;
        Apple(int weight){
            this.weight = weight;
        }
    @Override
    public String howToEat() {
        return "wash and use teeth";
    }
}
