class Cycle{
    Cycle(){
        System.out.println("Cycle constructor");
    }
}

class Unicycle extends Cycle{
    Unicycle(){
        System.out.println("Unicycle constructor");
    }
    public void balance(){
        System.out.println("balancing Unicycle");
    }
}

class Bicycle extends Cycle{
    Bicycle(){
        System.out.println("Bicycle constructor");
    }
    public void balance(){
        System.out.println("balancing bicycle");
    }
}

class Tricycle extends Cycle{
    Tricycle(){
        System.out.println("Tricycle constructor");
    }


}

public class UpCastingDownCastingDemo {
    public static void main( String[] arg) {
        Unicycle uni = new Unicycle();
        Bicycle bi = new Bicycle();
        Tricycle tri = new Tricycle();
        Cycle c[]={uni,bi,tri};
        //c[0].balance();
        //c[1].balance();
        //c[2].balance();
        //No Balance method in Cycle

        //down casting
        ((Unicycle)c[0]).balance();
        ((Bicycle)c[1]).balance();
    }

}
