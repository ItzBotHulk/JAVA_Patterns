public class pattern {
    public static void main(String args[]){
        
    /* // # 1st - Pattern(square) :
        // * * * * * 
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

        int n = 5; 
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();
        } */


    /* //# 2nd - Pattern(Hollow Square) :
        //   * * * * * 
        //   *       * 
        //   *       * 
        //   *       * 
        //   * * * * * 

        // int n = 4;
        // for(int i = 0; i<=n; i++) {
        //     for(int j = 0; j<=n; j++){
        //         if(i == 0 || j == 0 || i == n  || j == n){
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // } */


    /* //# 3rd - Pattern(Right Half Pyramid) :
        //   * 
        //   * * 
        //   * * * 
        //   * * * * 
        //   * * * * * 
        //   * * * * * *

        // int n = 5;
        // for(int i = 0; i<=n; i++){
        //     for(int j = 0; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // } */


    /* //# 4th - Pattern(Reverse Right Half Pyramid) :
       // * * * * * 
       // * * * * 
       // * * * 
       // * * 
       // * 

    int n = 5;
    for(int i = 0; i<n; i++){
        for(int j = n; j>i; j--){
            System.out.print("* ");
        }
        System.out.println();
    }  */


    //# 5th - Pattern(Left Half Pyramid) :

    
        for(int i = 0; i<5-1; i++){
            for(int j = 5-1; j>i; j-- ){
                System.out.print("  ");
            }
            for(int j = 1; j <= i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
