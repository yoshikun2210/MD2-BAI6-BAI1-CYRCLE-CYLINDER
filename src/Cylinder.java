

public class Cylinder extends Circle {
    public Cylinder (double radius, String color){
        super(radius,color);
    }
    private double height;
    public  Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return  height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getVolume(){
        return getArea()*height;
    }



    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +",volume = "+ getVolume()+
                '}';
    }
}