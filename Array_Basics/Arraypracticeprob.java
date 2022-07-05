package arrays1;

public class Arraypracticeprob {
	
public static int smallest(int[] a){
	int small=0;
	for(int i=1;i<a.length;i++) {
		if(a[i]<a[small]) {
			small=i;
		}
	}
	return a[small];
	
}

public static int thirdlargest(int[] a) {
	int l,s,t;
	l=0;s=0;t=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]>a[l]) {
			t=s;
			s=l;
			l=i;
		}
		else if(a[i]<a[l] && a[i]>a[s]) {
			t=s;
			s=i;
			
		}
		else if(a[i]<a[s]) {
			t=i;
		}
		
	}
	return a[t];
}

public static boolean checksort(int[] a) {
	boolean chk=false;
	for(int i=0;i<a.length-1;i++) {
		if(!(a[i]<a[i+1])) {
			chk=true;
			break;
		}
	}
	return chk;
	
}

public static int[] reversearr(int[] a) {
	int temp=0;
	for(int i=0;i<a.length/2;i++) {
		temp=a[i];
		a[i]=a[a.length-(i+1)];
		a[a.length-(i+1)]=temp;
	}
	return a;
}

public static int[] rightgreatest(int[] a) {
	for(int i=0;i<a.length-1;i++) {
		int max=i+1;
		for(int j=i+1;j<a.length;j++) {
			if(a[max]<a[j]) {
				max=j;
			}
		}
		a[i]=a[max];
	}
	a[a.length-1]=0;
	return a;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,7,8,4,5};
		int[] b= {11,55,3,45,78,90};
		int[] c= {12,23,34,45,56,67,78};
		int[] d= {7,5,8,9,6,8,5,7,4,6};
		
		//1
		System.out.println(smallest(a));
		
		//2
		System.out.println(thirdlargest(b));
		
		//3
		if(checksort(c)) {
			System.out.println("Not sorted");
		}
		else {
			System.out.println("Sorted");
		}
		//4
		for(int j:reversearr(b)) {
			System.out.print(j+" ");
		}
		System.out.println(" ");
		//5
		
		for(int i:rightgreatest(d)) {
			System.out.print(i+" ");
		}

	}

}
