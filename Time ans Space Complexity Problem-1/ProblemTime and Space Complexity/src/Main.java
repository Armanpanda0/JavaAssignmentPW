public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        Q1. What is the time, and space complexity of the following code snippet?
int a = 0, b = 0;
for (i = 0; i < N; i++) {
a = a + i;
}
for (j = 0; j < M; j++) {
b = b + j;
}
Time Complexity is O(N+M)
         */
        /*
        Q2. What is the time complexity of the following code snippet?
int a = 0;
for (i = 0; i < N; i++) {
for (j = N; j > i; j--) {
a = a + i + j;
}
}
Time complexity:- O(N^2)
         */
        /*
        Q3. What is the time complexity of the following code snippet?
int i, j, k = 0;
for (i = n / 2; i <= n; i++) {
for (j = 2; j <= n; j = j * 2) {
k = k + n / 2;
}
}
Time Complexity O(NlogN)
         */
        /*
        Q4. What is the time complexity of the following code snippet?
int a = 0, i = N;
while (i > 0) {
a += i;
i /= 2;
}
Time Complexity :- I found O(N^2)....But actual ans is O(logN)
         */
        /*
        Q5. What will be the time complexity of the following code snippet?
for(int i=0;i<n;i++){
i =k
}
Time Complexity is :- O(logn base K)
         */
    }
}