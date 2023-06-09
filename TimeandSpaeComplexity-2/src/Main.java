public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        Problem 1:
Calculate the time complexity for the following code snippet.
int val = 0;
for(int i = 1; i <= N; i += i){
val++;
}
TimeComplexity :-O(logN)
         */
        /*
        Problem 2:
Calculate the time complexity for the following code snippet.
int val = 0;
for(int i = 1; i <= N; i *= 2){
for(int j = 1; j <= i; j++) {
val++;
}
}
Time Complexity :- O(N)   < loop 1 is log_N and for loop 2^log_N=N>
         */
        /*
        Problem 3:
Calculate the time complexity for the following code snippet.
int val = 0;
for(int i = 1; i <= N; i *= 2){
for(int j = N; j > i; j–-) {
val++;
}
}
Time Complexity :- O(Nlog N)
         */
        /*
        Problem 4:
Calculate the time complexity for the following code snippet.
int val = 0;
for(int i = 2; i <= N; i *= i){
val++;
}
Time Complexity :- O(log(log N))
         */
    }
}