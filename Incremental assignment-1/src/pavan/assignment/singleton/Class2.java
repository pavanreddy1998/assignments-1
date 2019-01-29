package pavan.assignment.singleton;

public class Class2 {
    String name;
    public  static Class2 initialize(String name)
    {
        Class2 objectOfClass2=new Class2();
        objectOfClass2.name=name;
        return objectOfClass2;
    }
    public void printName(){
        System.out.println(name);
    }
}
