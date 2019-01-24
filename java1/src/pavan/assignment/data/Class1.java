package pavan.assignment.data;

public class Class1 {
    int i;
    char c;
    public void print_global(){
        System.out.println(this.i);
        System.out.println(this.c);
    }
    public  static void print_local() {
        int local1;
        char local2;
        //System.out.println(local1);
         //System.out.println(local2);
        /*local variables don't have default value,hence it is a compile time error.
*/
    }


}
