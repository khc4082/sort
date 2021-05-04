import java.util.Random;

public class ShellSort {
    public static void main(String[] args) {

        Random r=new Random();
        int size=16;
        int[] arr=new int[size];

        System.out.printf("정렬 전 원소 (%d)개: ",size);
        for(int i=0; i<size; i++) {
            arr[i]=r.nextInt(99)+1;
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        ShellSort(arr);
    }

    private static void ShellSort(int[] arr) {

        int arrSize = arr.length;
        int interval = arrSize / 2;

        while (interval >= 1) {
            for (int i = 0; i < interval; i++) {
                intervalSort(arr, i, arrSize - 1, interval);

            }
            output(arr, interval);
            interval /= 2;

        }
    }

    private static void intervalSort(int[] arr, int start, int end, int interval) {

        for (int i = start + interval; i <= end; i += interval) {
            int item = arr[i];
            int j = 0;
            for (j = i - interval; j >= start && item < arr[j]; j -= interval) {
                // arr[j]의 값이 크니까 삽입
                arr[j + interval] = arr[j];
            }
            //삽입 끝낫으니 기억해둔 값 삽입
            arr[j + interval] = item;
        }
    }

    private static void output(int[] arr,int interval) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" 간격 : "+ interval);
    }
}


