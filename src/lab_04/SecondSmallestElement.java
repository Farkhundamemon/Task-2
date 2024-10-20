package lab_04;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {1,6,8,5,6,20};
        
        int first = arr[0];
        int second = arr[1];
        
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] < first){
                second = first;
                first = arr[i];
            }
            else if ( arr[i] < second && arr[i] != first)
            {
                second = arr[i];
            }
        }
        System.out.println(" The smallest elemet is " + first);
        System.out.println(" The second smallest elemet is " + second);
    }

}
