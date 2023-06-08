public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Example-1..
        /*
        int sum = 0;
for(int i=0;i<N;i++) // 0 based indexing
sum += a[i];

Explanation : O(N)
         */
        /*
        Example 2.........
        :-

        int c1 = 0;
for(int i=0;i<n;i++)
c1+=1;
int c2=0;
for(int i=0;i<m;i++)
c2+=1;

Tome Complexity is :- O(n+m)

         */
        /*
        Example-4.......

        int count = 0;
for(int i=0;i<N;i++)
for(int j=0;j<i;j++)
count += 1;

Time Complexity is:- O(n^2)
         */
        /*
        Example 5:
Another example of Nested for loops
int count = 0;
for(int i=0;i<N;i++)
for(int j=0;j<Math.sqrt(N);j++)
count+=1;

Time Complexity is:- O(n sqrt(n));
         */
        /*
        Try this:
Calculate the time complexity for the following code snippet.
int val = 0;
for(int i = 1; i <= N; i *= k){
val++;
}
Time Complexity :- O(log N base k)
         */
        /*
        Topic 2: Space Complexity

        Example 1:
Calculate the sum of all the array elements.
int sum=0;
for(int i=0;i<N;i++)
sum+=a[i];

Space complecty :- O(N)
         */
        /*
        Example 2:
Consider the following function to store first N natural numbers in an array:
int[] a = new int[N];
for(int i=0;i<N;i++)
a[i] = i+1;
}

Space Complexcity:- O(N);
         */
        /*
        Example 3:
Let’s consider a 2-d matrix with all elements 1 in it.
int[][] a = new int[N][N];
for(int i=0;i<N;i++)
for(int j=0;j<N;j++)
A[i][j] = 1;

Space Coomplexity is:- O(N^2)
         */
        /*
        
         */
    }
}