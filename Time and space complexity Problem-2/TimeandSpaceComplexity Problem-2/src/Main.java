public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        /*
        Q1. Calculate the time complexity of the given function:
public static void fun(int n)
{
if (n < 5)
System.out.print("College Wallah");
else {
for (int i = 0; i < n; i++) {
System.out.print(i + " ");
}
}
}
Time complexity bis :- O(N)
         */
        /*
        Q2. Calculate the time complexity of the given function:
public static void function(int n)
{
int i = 1, s = 1;
while (s < n) {
s = s + i;
i++;
}
}Time complexity is:-O(root N)
         */
        /*
        Q3. Calculate the time complexity of the given function:
public static void fun(int a, int b){
while (a != b) {
if (a > b)
a = a - b;
else
b = b - a;
}
}
time Complexity :-O(1)
         */
        /*
        Q4. Calculate the time complexity of the given function:
public static void fun(int n, int x){
for (int i = 1; i < n; i = i * x)
System.out.println(“hello”);
}
Time complexity :-O(log n base x)
         */
        /*
        Q5. Calculate the time complexity of the given function:
public static void fun(int n){
for (int i = 0; i < n / 2; i++)
for (int j = 1; j + n / 2 <= n; j++)
for (int k = 1; k <= n; k = k * 2)
System.out.println(“hello”);
}
Time complexity O(N^2 log N)
         */
    }
}