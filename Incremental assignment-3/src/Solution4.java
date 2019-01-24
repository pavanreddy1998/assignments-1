interface Cycle1{
     void type();
}

class Unicycle1 implements Cycle1{
    Unicycle1(){
        System.out.println("unicycle ready");
    }
   public void type(){
        System.out.println("this is unicycle");
    }
}


class Bicycle1 implements Cycle1{
    Bicycle1(){
        System.out.println("bicycle ready");
    }
    public void type(){
        System.out.println("this is bicycle");
    }
}

class Tricycle1 implements Cycle1{
    Tricycle1(){
        System.out.println("tricycle ready");
    }
    public void type(){
        System.out.println("this is tricycle");
    }
}

class UnicycleFactory{
    public static Unicycle1 orderUnicycle(){
        return new Unicycle1();
    }
}

class BicycleFactory{
    public static Bicycle1 orderBicycle(){
        return new Bicycle1();
    }
}


class TricycleFactory{
    public static Tricycle1 orderTricycle(){
        return new Tricycle1();
    }
}

public class Solution4 {
    public static void main(String arg[]){
        Cycle1 unicycle=UnicycleFactory.orderUnicycle();
        Cycle1 bicycle=BicycleFactory.orderBicycle();
        Cycle1 tricycle=TricycleFactory.orderTricycle();

    }
}
