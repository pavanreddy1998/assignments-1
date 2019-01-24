package pavan.assignment.main;

import pavan.assignment.data.Class1;
import pavan.assignment.singleton.Class2;

public class MainClass {
    public static void main(String a[]) {
        Class1 c1 = new Class1();
        c1.printGlobal();
        c1.printLocal();


        Class2 c2 = Class2.initialize("pavan");

        c2.printName();
    }
}
