# Sort Algorithm
                                                     201801658 김현성
### 1. 버블 정렬 (Bubble Sort) 

 이웃하는 숫자를 비교하여 작은 수를 앞쪽으로 이동시키는 과정을 반복하여 정렬하는 알고리즘이다.
 인접한 2개의 레코드를 비교하여 크기가 순서대로 되어 있지 않으면 서로 교환한다.
 
### 작동 구조

 - 첫번째 자리 값부터 시작해서 바로 옆의 값과 비교를 해준다.
 - 2번째 값과 3번째 값을 비교, ... , n-1번째 값과 n번째 값을 비교해준다.
 - 이 과정을 n-1번 반복한다.

### 소스
```java
public static void BubbleSort(int[] arr) {

    for(int i = 0; i < arr.length; i++) {
    
        for(int j = 0 ; j < arr.length - i - 1 ; j++) {
            if(arr[j] > arr[j+1]) {
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
```

### 결과

![image](https://user-images.githubusercontent.com/80371590/116986204-73424a80-ad08-11eb-8a05-e9dd60a4f6b5.png)


### 시간복잡도

데이터의 개수를 n개라고 가정한다면, (n -1) + (n - 2) + ... + 2 + 1 => n(n - 1)/2이 되므로, `O(n^2)`만큼의 시간이 걸린다.


### 2. 선택 정렬 (Selection Sort)

  배열중에 가장 작은 원소들을 왼쪽부터 채워나가면서 숫자를 정렬하는 방법이다.
  
### 작동 구조
  
 - 최소원소를 찾는다.
 - 그 후 ,최소원소를 맨 왼쪽원소와 교환(즉, 왼쪽부터 정렬된 원소로 채워진다.)
 - 왼쪽원소를 제외하고 원소가 하나남을때 까지 이단계를 반복한다.

### 소스
```java
public static void main(String[] args) {
     
        for (int i = 0; i < n; i++) {
            int min_index = i; // 가장 작은 원소의 인덱스 
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
```
### 결과

![image](https://user-images.githubusercontent.com/80371590/116985934-1f376600-ad08-11eb-9b17-168ffd7b3480.png)

### 시간복잡도 

- 비교 횟수
    두 개의 for 루프의 실행 횟수
    외부 루프: (n-1)번
    내부 루프(최솟값 찾기): n-1, n-2, … , 2, 1 번
- 교환 횟수
    외부 루프의 실행 횟수와 동일. 즉, 상수 시간 작업
    한 번 교환하기 위하여 3번의 이동(SWAP 함수의 작업)이 필요하므로 3(n-1)번
    T(n) = (n-1) + (n-2) + … + 2 + 1 = n(n-1)/2 = O(n^2)
    
    

### 3. 삽입 정렬(Insertion Sort)

  자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘이다.
  이 알고리즘은 대부분의 레코드가 이미 정렬되어 있는 경우에 효율적인 알고리즘이다.


### 작동 구조

 - 숫자 하나를 선택한 뒤 그 숫자 앞에 있는 수들 중 적절한 자리를 찾아서 집어넣는 방식이다.
 
### 소스

```java
public static void InsertSort(int[] arr) {
    for(int i = 1; i < arr.length; i++) {
        for(int j = i; j > 0; j--) {
            if(arr[j-1] > arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
            }
        }
    }
}
```
### 결과

![image](https://user-images.githubusercontent.com/80371590/116989087-3e37f700-ad0c-11eb-8cac-f0f5effb1cd1.png)


### 시간복잡도

- 최선의 경우

    비교 횟수 : 이동 없이 1번의 비교만 이루어진다.
    외부 루프: (n-1)번
    
    `Best T(n) = O(n)`
    
- 최악의 경우(입력 자료가 역순일 경우)
    
    비교 횟수 : 외부 루프 안의 각 반복마다 i번의 비교 수행
    외부 루프: (n-1) + (n-2) + … + 2 + 1 = n(n-1)/2 = O(n^2)
    
    교환 횟수 : 외부 루프의 각 단계마다 (i+2)번의 이동 발생
    n(n-1)/2 + 2(n-1) = (n^2+3n-4)/2 = O(n^2)
    
  `Worst T(n) = O(n^2)`




### 4. 쉘 정렬(Shell Sort)
  배열을 특정 간격(gap)으로 묶어서 gap의 자리수 특정 자리수끼리 삽입 정렬 로직을 수행하는 정렬이다. 
  
### 작동 구조

 - 간격(gap)을 설정한다.

 - 각 간격별로 분류 된 서브(부분) 리스트에 대해 삽입정렬을 한다.

 - 각 서브(부분) 리스트의 정렬이 끝나면 간격을 줄인다.

 - 간격이 1이 될 때 까지 2번 과정으로 되돌아가며 반복한다.

## 소스
```java
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
```

```java

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
```

### 결과

![image](https://user-images.githubusercontent.com/80371590/116986399-b56b8c00-ad08-11eb-9e96-6b034b5a5b94.png)


### 시간복잡도

- 평균: T(n) = `O(n^1.5)`
- 최악의 경우: T(n) = `O(n^2)`



### 각 정렬 별 장단점 비교

![image](https://user-images.githubusercontent.com/80371590/116981215-2b202980-ad02-11eb-81a1-e79597e213a1.png)




### 각 정렬 별 시간복잡도 비교

 | **이름** | **최선의 경우**	| **평균**	| **최악의 경우**	| **Run time** | 
 | ---- | ---- | ---- | ---- | ---- |
 | 버블 정렬 | n^2 | n^2 | n^2 | 22.894 |
 | 선택 정렬  |  n^2 	|  n^2	| n^2	| 10.842 |
 | 삽입 정렬 | n | n^2 | n^2 | 7.438 | 
 | 쉘 정렬 | n |	n^1.5	| n^2	| 0.056 |
 
### 각 정렬 별 속도 비교

![ezgif com-gif-maker](https://user-images.githubusercontent.com/80371590/116982472-cc5baf80-ad03-11eb-96bb-cd30c642087a.gif)

 ==> 결론,
  - 버블정렬(Bubble sort) : 주어진 배열의 마지막 위치에 있는 요소를, 정렬되지 않은 직전 요소부터 첫 요소에 이르기까지 비교해 정렬 순서가 맞지 않은 모든 경우에 대해 요소 위치를 바꿔줌. 이를 요소 수만큼 반복. `가장 간단하지만 비효율적인 알고리즘`이다.
  - 선택정렬(Selection Sort) : 요소 위치 변경 횟수를 줄여 버블정렬을 일부 개선한 알고리즘. 정렬 순서가 맞지 않으면 무조건 자리를 바꿔줬던 버블정렬과 달리, 1회 iteration마다 최소값(혹은 최대값)을 찾고 단 한번만 해당 요소 위치를 바꿔준다.
  - 삽입정렬(insertion sort) : 모든 요소에 대해 앞에서부터 차례대로 이미 정렬된 배열(sorted list)과 비교하여 sorted list 내 자신의 위치를 찾아 삽입함으로써 정렬을 완성, 입력 데이터가 이미 정렬된 상태라면 O(n)의 빠른 속도를 보이지만 그렇지 않은 경우 다른 기법을 적용하는 것이 낫다.
  - 쉘정렬(shell sort) : 정렬되지 않은 배열의 경우 비효율적인 삽입정렬을 개선한 기법. 주어진 배열의 일정 간격(gap)만큼의 요소들에 대해 삽입정렬을 반복 수행한다.
 
  

 
