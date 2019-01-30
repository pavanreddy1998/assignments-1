public class Solution4 {
    Solution4(String parameter){
        System.out.println(parameter);
    }

    public static void main(String arg[])
    {
      Solution4 objectsOfSolution4[]=new Solution4[10];

       for(int i=0;i<10;i++){
           objectsOfSolution4[i]=new Solution4("hi");
       }
    }
}


/**
Output:
hi
hi
hi
hi
hi
hi
hi
hi
hi
hi
*/
