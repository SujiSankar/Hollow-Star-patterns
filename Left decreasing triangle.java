public class Main {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n;j++){
                if(i==1 || j==n || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    }
OUTPUT:
 *****
  *  *
   * *
    **
     *
