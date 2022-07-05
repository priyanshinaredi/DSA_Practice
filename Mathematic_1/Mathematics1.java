package maths;

public class Mathematics1 {

	public static   boolean palindrome(int n) {
		int rev=0;
		int temp=n;
		
		while(temp>0) {
			int ld=temp%10;
			rev = rev*10+ld;
			temp /=10;
		}
		return n==rev;
	}
	public static  int gcd(int a,int b) {
		if(a==b) return a;
		if(a<b) return gcd(b,a);
		if(b==0) return a;
		return gcd(a%b,b);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(palindrome(121));
		System.out.println(gcd(21,7));

	}

}
