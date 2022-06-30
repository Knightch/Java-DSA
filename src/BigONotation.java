public class BigONotation {
    public static void doublingLoopVariable(int n){
        for(int i = 1; i<n;){
            System.out.println("Value of i is:"+i);
            i = i * 2;
        }
    }

    public static void halvingLoopVariable(int n){
        for(int i = n; i>0;){
            System.out.println("Value of i is:"+i);
            i = i / 2;
        }
    }

    public static  void main(String[] args){
//        doublingLoopVariable(100);
        halvingLoopVariable(100);
    }
}
