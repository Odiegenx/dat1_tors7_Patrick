package Task2;

public class Circle {
    int radius;
    int diameter = radius*2;
    boolean validState = true;
    Circle(int radius) throws IllegalArgumentException {
        if(radius < 0){
            validState = false;
            throw new IllegalArgumentException("A circles Radius cant be negative!");
        }
        this.radius = radius;
    }
    public int getArea(){
        if(!validState){
            System.out.println("Cant get Area of this circle");
            return 0;
        }else {
            int area = (int) Math.PI * (this.radius * this.radius);
            return area;
        }
    }

}
