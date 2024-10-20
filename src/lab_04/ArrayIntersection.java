package lab_04;

public class ArrayIntersection {
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        int[] intersection = new int[Math.min(array1.length, array2.length)];
        int checkIntersect = 0; 

        for (int i = 0; i < array1.length; i++) {

            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
         
                    boolean alreadyExists = false;
                    for (int k = 0; k < checkIntersect; k++) {
                        if (intersection[k] == array1[i]) {
                            alreadyExists = true;
                            break;
                        }
                    }
                    if (!alreadyExists) {
                        intersection[checkIntersect++] = array1[i];
                    }
                }
            }
        }
        System.out.print("Intersection: ");
        for (int i = 0; i <checkIntersect; i++) {
            System.out.print(intersection[i] + " ");
        }
    }
}
