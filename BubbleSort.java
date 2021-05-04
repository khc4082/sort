import java.util.Scanner;

public class ShellSort {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        final int arrNumber = 10;        // 원소가 10개인 배열을 선언

        int [] array = new int[arrNumber];





        System.out.println("10개의 값을 입력하시오");        // 먼저 값을 입력 

        for(int i= 0; i<arrNumber; i++)

        {

            System.out.print((i+1) + "번째 값: ");

            array[i] = input.nextInt();

        }



        System.out.print("입력한 값 출력: ");        //정렬이 안된 입력된 값을 출력



        for(int i= 0 ; i<arrNumber; i++)

        {

            System.out.print(array[i] + " ");

        }

        System.out.println("");





        //버블 정렬이 실행되는 부분****


        for(int i=0; i<arrNumber-1; i++)             // 10개의 값이 있으면 두 개의 값을 비교하는 과정은 9번만 진행

        {

            for(int j=0; j<(arrNumber-i)-1; j++)        //가장 큰 값을 뒤로 보내면 마지막 값 고정이되는데 i++만큼 증가하므로 -i 해준다.

            {

                if(array[j] > array[j+1])        //가장 큰값을 뒤로 보내준다.

                {

                    int tmp = array[j+1];

                    array[j+1] = array[j];

                    array[j] = tmp;

                }

            }

        }



        System.out.print("버블정렬 후 값 출력: ");



        for(int i= 0 ; i<arrNumber; i++)

        {

            System.out.print(array[i] + " ");

        }



        System.out.println("");

    }

}



