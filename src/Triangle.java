public class Triangle {
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            // for 0 -> 1 star, 1-> 3 star, 2-> 5 star
            int j=i*2+1;
            while(j>1){
                System.out.print("* ");
                j--;
            }
            System.out.print("*\n");
        }
    }
}
