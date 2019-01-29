package pavan.assignment.main;

import pavan.assignment.data.Class1;
import pavan.assignment.singleton.Class2;

public class MainClass {
    public static void main(String a[]) {
        Class1 objectOfClass1 = new Class1();
        objectOfClass1.printGlobal();
        objectOfClass1.printLocal();

        Class2 objectOfClass2 = Class2.initialize("pavan");
        objectOfClass2.printName();
    }
}
