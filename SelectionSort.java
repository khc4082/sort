import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
      
        System.out.println("몇 개의 숫자를 정렬하시겠습니까 ?");   //숫자의 크기에 따라서 순번대로 배치
        int numCount = sc.nextInt();
        int numArr[] = new int[numCount];

      
        System.out.println("정렬할 숫자를 입력해주세요.");	// 정렬할 숫자를 입력 배열에 숫자 대입
      
        for (int i = 0; i < numArr.length; i++) {
            int num = sc.nextInt();
            numArr[i] = num;
        }

        for (int i = 0; i < numArr.length; i++) {
            System.out.println("numArr["+i+"] = "+numArr[i]);
        }



        
        int temp;	// swap

            System.out.println("선택정렬 후 값 출력");
            for (int i = 0; i < numArr.length-1; i++) {
                for (int j = i + 1; j < numArr.length; j++) {  
                    // 오름차순 
                    if (numArr[i] > numArr[j]) {
                        temp = numArr[i];
                        numArr[i] = numArr[j];
                        numArr[j] = temp;
                    }
                }
            }


       
        for (int i = 0; i < numArr.length; i++) {
            System.out.println("numArr["+i+"] = "+numArr[i]);   // 결과 출력
        }

        sc.close();
    }

}

