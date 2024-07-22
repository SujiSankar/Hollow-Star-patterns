public class Main {
    public static void main(String[] args) {
        int n = 5;
        int i,j;
        for(i=1;i<n;i++){
           
            for(j=1;j<=i;j++){
                if(j==i||j==1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
           
            for(j=1;j<=i;j++){
                if(j==i||j==1){
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
* * 
*   * 
*     * 
*       * 
*     * 
*   * 
* * 
* 
