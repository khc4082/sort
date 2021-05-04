# Sort Algorithm

### 1. 버블 정렬 (Bubble Sort) 
 이웃하는 숫자를 비교하여 작은 수를 앞쪽으로 이동시키는 과정을 반복하여 정렬하는 알고리즘이다.
 인접한 2개의 레코드를 비교하여 크기가 순서대로 되어 있지 않으면 서로 교환한다.

### 2. 선택 정렬 (Selection Sort)
  배열중에 가장 작은 원소들을 왼쪽부터 채워나가면서 숫자를 정렬하는 방법이다.
  
최소원소를 찾은 후 

=> 최소원소를 맨 왼쪽원소와 교환(즉, 왼쪽부터 정렬된 원소로 채워진다.)

=> 왼쪽원소를 제외하고 원소가 하나남을때 까지 이단계를 반복한다.


### 시간복잡도
데이터의 개수를 n개라고 가정한다면, (n -1) + (n - 2) + ... + 2 + 1 => n(n - 1)/2이 되므로, `O(n^2)`만큼의 시간이 걸린다. 

### 시간복잡도 비교

 | **이름** | **최선의 경우**	| **평균**	| **최악의 경우**	| **Run time** | 
 | ---- | ---- | ---- | ---- | ---- |
 | 버블 정렬 | n^2 | n^2 | n^2 | 22.894 |
 | 선택 정렬  |  n^2 	|  n^2	| n^2	| 10.842 |
 | 삽입 정렬 | n | n^2 | n^2 | 7.438 | 
 | 쉘 정렬 | n |	n^1.5	| n^2	| 0.056 |
  

 
