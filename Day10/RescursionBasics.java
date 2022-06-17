package recursion1;

public class RescursionBasics {

	
	static void blankfunction() {
		blankfunction();
	}
	
	static void printNnaturalNumbers(int n) {
		//basecondition
		if (n==0)
			return;
		//System.out.println(n);
		// sub problem 
		printNnaturalNumbers(n-1);
		
	
	}
	
	static int sumNnaturalnums(int n) {
		if(n==0) {
			return 0;
			
		}
		if(n<=1) {
			return n;
		}
		return sumNnaturalnums(n-1)+n;
		
		
	}
	static int powerofn(int a,int b) {
		if(b==0) {
			return 1;
			
		}
		if(b==1) return a;
		if(a==0) return 0;
		if(a==1) return 1;
		
		return powerofn(a,b-1)*a;
		
		
	}
	
	
static int countpathsinmatrix(int n,int m) {
	if (n==1||m==1) return 1;
	int rightside=countpathsinmatrix(n,m-1);
	int down=countpathsinmatrix(n-1,m);
	
	return rightside+down;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//blankfunction();
		
		printNnaturalNumbers(6);
		System.out.println(sumNnaturalnums(1));
		System.out.println(powerofn(3,4));
		System.out.println(countpathsinmatrix(3,4));
	}

}
