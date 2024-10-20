package lab_04;
public class ReverseArray {
    public static void main(String[] args) {
 
        int[] arr = {1, 2, 3, 4, 5};

        int[] reversedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i]; 
        }

        System.out.print("Reversed array: ");
        for (int i = 0; i < reversedArr.length; i++) {
            System.out.print(reversedArr[i] + " ");
        }
    }
}

