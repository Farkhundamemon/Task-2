package lab_04;
public class RemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = {4, 2, 4, 1, 3, 2, 1};

        int[] uniqueArr = new int[arr.length];
        int uniqueCount = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < uniqueCount; j++) {
                if (arr[i] == uniqueArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArr[uniqueCount] = arr[i];
                uniqueCount++;
            }
        }
        
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArr[i] + " ");
        }
    }
}

