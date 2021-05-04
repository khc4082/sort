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
public static void BubleSort(int[] arr) {
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
            // 스와프
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

### 3. 삽입 정렬(Insertion Sort)

  자료 배열의 모든 요소를 앞에서부터 차례대로 이미 정렬된 배열 부분과 비교하여, 자신의 위치를 찾아 삽입함으로써 정렬을 완성하는 알고리즘이다.


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




### 4. 쉘 정렬(Shell Sort)
  배열을 특정 간격(gap)으로 묶어서 gap의 자리수 특정 자리수끼리 삽입 정렬 로직을 수행하는 정렬이다. 
  
### 작동 구조

 - 간격(gap)을 설정한다.

 - 각 간격별로 분류 된 서브(부분) 리스트에 대해 삽입정렬을 한다.

 - 각 서브(부분) 리스트의 정렬이 끝나면 간격을 줄인다.

 - 간격이 1이 될 때 까지 2번 과정으로 되돌아가며 반복한다.

## 소스
```java
```





### 시간복잡도 비교

 | **이름** | **최선의 경우**	| **평균**	| **최악의 경우**	| **Run time** | 
 | ---- | ---- | ---- | ---- | ---- |
 | 버블 정렬 | n^2 | n^2 | n^2 | 22.894 |
 | 선택 정렬  |  n^2 	|  n^2	| n^2	| 10.842 |
 | 삽입 정렬 | n | n^2 | n^2 | 7.438 | 
 | 쉘 정렬 | n |	n^1.5	| n^2	| 0.056 |
  

 
