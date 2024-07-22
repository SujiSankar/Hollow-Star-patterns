class HelloWorld {
    public static void main(String[] args) {
        int i,j,n=5;
        for(i=1;i<=n;i++)
        {
            for(j=i;j<=n;j++)
            {
              System.out.print(" ");
            }
            for(j=1;j<=n;j++)
            {
                if(i==n||j==n ||i==1 ||j==1){
               System.out.print("*"); }
               else
               {
                  System.out.print(" "); 
               }
            }
            System.out.println();
        }
    }
}
OUTPUT:
     *****
    *   *
   *   *
  *   *
 *****
