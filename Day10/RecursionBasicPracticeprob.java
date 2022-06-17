package recursion1;

public class RecursionBasicPracticeprob {
	
	
	static int factorial(int n) {
		if (n==0||n==1) return 1;
		return factorial(n-1)* n;
		
	}
	static int sumofsqauresofnnaturalnum(int n) {
		if(n==1) return 1;
		
		return sumofsqauresofnnaturalnum(n-1)+(n*n);
	}
	static int palindromearray(int[] arr,int begin,int end) {
		
		if (begin>=end) return 1;
		
		if(arr[begin]==arr[end]) {
			return palindromearray(arr,begin+1,end-1);
		}
		else {
			return 0;
		}}
	static int gcd(int a,int b) {
		if (b==0) return a;
		if (a==b) return a;
			return gcd(b,a%b);
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,3,2,1};
		
		//1
		System.out.println(palindromearray(a,0,a.length-1));
		
		//2
		System.out.println(factorial(3));
		
		//3
		System.out.println(sumofsqauresofnnaturalnum(3));
		
		//4
		System.out.println(gcd(24,24));
	}

}
