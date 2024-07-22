public class Main {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++)
            {
                 System.out.print("  ");
            }
           
            for(j=1;j<i;j++){
                if(i==n||j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(j=1;j<=i;j++){
                if(j==i || i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        }
    }

OUTPUT:
          * 
        *   * 
      *       * 
    *           * 
  * * * * * * * * * 
