public class OddPosition {
    public static void main(String[] args) {
        int[] a={10,11,12,13,14,15};
        for(int i:a){
            if(i%2 == 0){
                System.out.println("even Position : "+i);
            }
            else{
                System.out.println("Odd Position : "+i);
            }
        }
    }
}
