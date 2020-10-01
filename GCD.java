package mathematicsCp;

public class GCD {

	public static int gcd(int a,int b) {
		if(b==0) return a;
		return gcd(b,a%b);
	}
	public static void main(String[] args) {
		int ans=gcd(24,60);
		System.out.println(ans);

	}

}
