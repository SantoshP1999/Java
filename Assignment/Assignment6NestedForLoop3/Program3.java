/*WAP to print following pattern
    10
    9  8
    7  6  5
    4  3  2  1
 */

 class Program3{
    public static void main(String[] args) {
        int n=4;
        int a=10;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(a+" ");
            a--;
        }
        System.out.println();
       } 
    }
}