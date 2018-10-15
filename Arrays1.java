public class Practice {
    public static void main(String[] args) {

        int [] x = {-1,0,1,2,-1,-4};
//        int [][] elements = {};
        for(int i=0;i<1;i++){
            for(int j=i+1;j<x.length;j++){
                for(int k = j+1;k<x.length;k++){

                    if(x[i] + x[j] + x[k] == 0 ){
//                        int y = x[i];
//                        int z=x[j];
//                        int a =x[k];

                        //int [] b = {x[i],x[j],x[k]};
//                        elements[0] = b;
                      System.out.println("["+x[i]+", "+x[j]+", "+x[k]+"]");
                    }
                }
            }
        }
//        for(int a = 0; a < elements.length; a++){
//            System.out.print("[");
//            for (int b = 0; b < elements[a].length; b++){
//                System.out.print(elements[a][b] + ", ");
//            }
//            System.out.print("]");
//        }
    }
}
