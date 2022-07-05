package maths2;

import java.util.Arrays;

public class Maths_2 {
	
	public static boolean checkprime(int n)
	{
		for(int i=2;i<n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static boolean checkprimeefficient(int n)
	{
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static boolean checkprimemoreefficient(int n)
	{	
		if (n==2||n==3) return true;
		if (n==1 || n%2==0 || n%3==0) return false;
		for(int i=5;i*i<=n;i+=6) {
			if(n%i==0||n%(i+2)==0) return false;
		}
		return true;
	}
	public static void divisors(int n) {
		
		for(int i=1;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				System.out.println(n/i);
			}
		}
	}
public static void divisorssorted(int n) {
		int i=1;
		for(;i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				
			}
		}
		for(;i>=1;i--) {
			if(n%i==0) {
				if(n/i !=i) System.out.println(n/i);
			}
		}
	}
public static void untillprime(int n) {
	for(int i=1;i<=n;i++) {
		if(checkprimemoreefficient(i)) System.out.println(i);;
	}
}
public static void sieveoferasthosthenes(int n) {
	boolean isPrime[] = new boolean[n+1];
	Arrays.fill(isPrime,true);
	for(int i=2;i*i<=n;i++) {
		if(isPrime[i]) {
			for(int j=2*i;j<=n;j = j+=i) {
				isPrime[j]=false;
			}
		}
	}
	for(int i=2;i<=n;i++) {
		if(isPrime[i]) System.out.println(i);
	}
	
}
public static int fastPower(int a,int b) {
	if(b==0) return 1;
	int half=fastPower(a,b/2);
	int full = half*half;
	if( b%2!=0) full=full*a;
	return full;
}
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println(checkprimeefficient(42 ));
		//divisorssorted(36);
		//untillprime(30);
		sieveoferasthosthenes(30);
		System.out.println(fastPower(3,4));

	}

}
