interface Cycle{
     void type();
}

class Unicycle implements Cycle{
    Unicycle(){
        System.out.println("unicycle ready");
    }
   public void type(){
        System.out.println("this is unicycle");
    }
}


class Bicycle implements Cycle{
    Bicycle(){
        System.out.println("bicycle ready");
    }
    public void type(){
        System.out.println("this is bicycle");
    }
}

class Tricycle implements Cycle{
    Tricycle(){
        System.out.println("tricycle ready");
    }
    public void type(){
        System.out.println("this is tricycle");
    }
}

class UnicycleFactory{
    public static Unicycle orderUnicycle(){
        return new Unicycle();
    }
}

class BicycleFactory{
    public static Bicycle orderBicycle(){
        return new Bicycle();
    }
}


class TricycleFactory{
    public static Tricycle orderTricycle(){
        return new Tricycle();
    }
}

public class CycleFactoryDemo {
    public static void main(String arg[]){
        Cycle unicycle=UnicycleFactory.orderUnicycle();
        Cycle bicycle=BicycleFactory.orderBicycle();
        Cycle tricycle=TricycleFactory.orderTricycle();

    }
}

/**
Output:

unicycle ready
bicycle ready
tricycle ready

*/
