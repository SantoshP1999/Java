
//  Fibonacci Series

//  Approach 1

class FibonacciSeries{
    public static void main(String[]args){
        int num=8;
        int a=0,b=1,c=0;
        for(int i=0;i<num-2;i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(c);
    }
}