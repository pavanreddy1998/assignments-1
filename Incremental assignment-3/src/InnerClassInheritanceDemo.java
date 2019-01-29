
class Outerclass1{
    class Innerclass1{
        Innerclass1(String stringParameter){
            System.out.println("In inner class1 with string:"+stringParameter);
        }
    }
}

class Outerclass2{
   class Innerclass2 extends Outerclass1.Innerclass1{
        Innerclass2(Outerclass1 outerObject1){
            outerObject1.super("hello");
            System.out.println("In inner class2");
        }

    }
}

public class InnerClassInheritanceDemo {
public static void main(String arg[]){
    Outerclass2 outerObject2=new Outerclass2();
    Outerclass1 outerObject1=new Outerclass1();

    Outerclass2.Innerclass2 innerObject2=outerObject2.new Innerclass2(outerObject1);
}
}
