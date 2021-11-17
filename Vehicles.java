 interface Vehicle {
     void acceleration();

     void comfortability();

 }
 class car implements Vehicle{

     @Override
     public void acceleration() {
         System.out.println("average acceleration");
     }

     @Override
     public void comfortability() {
         System.out.println("Higher comfortability");
     }
 }
class Bike implements Vehicle{

    @Override
    public void acceleration() {
        System.out.println("High acceleration");
    }

    @Override
    public void comfortability() {
        System.out.println("Comfortable");
    }
}
class Bicycle implements Vehicle{

    @Override
    public void acceleration() {
        System.out.println("Low acceleration");
    }

    @Override
    public void comfortability() {
        System.out.println("less comfortable");
    }
}
public class Vehicles{
    public static void main(String[] args){
        System.out.println("Features of a car:");
        Vehicle obj1=new car();
        obj1.acceleration();
        obj1.comfortability();
        System.out.println("Features of a Bike:");
        Vehicle obj2=new Bike();
        obj2.acceleration();
        obj2.acceleration();
        System.out.println("Features of a Bicycle");
        Vehicle obj3=new Bicycle();
        obj3.acceleration();
        obj3.comfortability();
    }
}