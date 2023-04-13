package Task2;

public class Main {
    public static void main(String[] args) {
        try {
            Circle c1 = new Circle(6);
            System.out.println(c1.getArea());

        } catch (IllegalArgumentException e) {
            System.out.println(e);
            System.out.println("caught in main- issue with c1");
        }
        try{
            Circle c2 = new Circle(-2);
            System.out.println(c2.getArea());
        }catch (IllegalArgumentException e){
            System.out.println(e);
            System.out.println("caught in main - issue with c2");
        }
    }

}
