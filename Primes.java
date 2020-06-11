package Test;

public class Primes {
	public static void main(String[] args) {
	
		//making boolean array
		boolean[] prime=new boolean[1000];
		for(int i=0;i<1000;i++) {
			prime[i]=true;
		}  //iterating through array and initializing elemnts to true
		
		for(int y=2;y*y<1000;y++) {
			if(prime[y]==true) { //checking multiple values of true values and setting them false
				for(int x=y*2;x<prime.length;x+=y) {
					prime[x]=false;
				}
			}
		}
		System.out.println("Prime numbers are ");
		for(int z = 2;z<1000;z++) {
			if( prime[z]==true) { //printing true values
			System.out.println(z+" ");
			}
		}
	
				
	}

}
