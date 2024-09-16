package java_practice;

public class gcd {
	
	public static int gcdFind(int a, int b) {
//		int ans = 0;
//		for(int i=1; i<=a && i<=b; i++) {
//			if(a%i==0 && b%i==0) {
//				ans=i;
//			}
//		}
//		return ans;
//	}
		while(a!=b){
            if(a>b){
                a=a-b;
                 return a;
            }
            else{
                b=b-a;
                // return b;
            }
                
        }
                 return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(gcdFind(22,18));
	}

}
