public class InsertionSort  {
    
    public static void main(String[] args) {
        int[] arr = { 40, 10, 50, 90, 80, 30, 60 };

        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i=1; i < arr.length; i++) {
            int standard = arr[i];
            int compareIndex = i-1;

            while(compareIndex >= 0 && standard < arr[compareIndex]) {
                arr[compareIndex+1] = arr[compareIndex];
                compareIndex--;
            }

            arr[compareIndex + 1] = standard;
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
