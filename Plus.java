public class Main {
    public static void main(String[] args) {
        int n = 7; 
        for (int i = 1; i  <=  n; i++) {
            for (int j = 1; j  <=  n; j++) {
                               if (i == n / 2 +1 || j == n / 2 +1)//[n/2=3.5 compiler will take it as 3 then add 1 to it] {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                        System.out.println();
        }
    }
}
OUTPUT:
   *   
   *   
   *   
*******
   *   
   *   
   *   
