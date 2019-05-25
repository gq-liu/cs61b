import java.io.*;

class PrintPrimeNum {
	public static void main(String[] arg) throws IOException {
		System.out.println("This program print all prime numbers under n (including n), please enter the integer number n:");
		BufferedReader inputNum = new BufferedReader(new InputStreamReader(System.in));
		String numberString = inputNum.readLine();
		int n = Integer.parseInt(numberString);
		printPrimeNumber(n);
	}
	public static void printPrimeNumber(int n){
		boolean prime[] = new boolean[n+1];
		int i;
		for (i = 1; i<= n; i++){
			prime[i] = true;
		}
		
		for (int divisor = 2; divisor*divisor <= n; divisor++){
			if (prime[divisor]){
				for (i = 2*divisor; i <= n; i = i + divisor){
					prime[i] = false;
				}
			}
		}
		for (i = 2; i <= n;i++){
			if (prime[i]){
				System.out.print(" " + i);
			}
		}
	}
}
