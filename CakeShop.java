package HomeAssignment;

public class CakeShop {
	public static void main(String[] args) {
		
		
		// making cake type list to store cake's
		
		Cake[] cakelist=new Cake[11];
		
		//making cake objects
		
		cakelist[0]=new readymadeCake("blackforrest",10,784);
		cakelist[1]=new orderCake("kitkat",734,45);
		cakelist[2]=new orderCake("deathbychoc",938,54);
		cakelist[3]=new readymadeCake("chocolate",2,356);
		cakelist[4]=new	orderCake("strawberry",245,45);
		cakelist[5]=new readymadeCake("cheesecake",19,724);
		cakelist[6]=new orderCake("fudge",593,56);
		
		// using clone method to clone existing cakes for efficient data entry
		
		cakelist[7]=(Cake) cakelist[0].clone();
		cakelist[8]=(Cake) cakelist[2].clone();
		cakelist[9]=(Cake) cakelist[6].clone();
		cakelist[10]=(Cake) cakelist[9].clone();
		
		// initiallizing variables
		
		double sumprice=0;
		double ttlprice=0;
		double ttlquantity=0;
		double highprice;
		double highestprice=0;
		String highpricecake="";
		// looping through cakes and calculating desired outputs
		
		for(int i=0;i<cakelist.length;i++) {
			
			
			sumprice+=cakelist[i].calcPrice();
			highprice=cakelist[i].calcPrice();
			
			if(highprice>highestprice) {
				highestprice=highprice;
				
			}
			if(cakelist[i].calcPrice()==highestprice) {
				highpricecake=cakelist[i].toString();
			}
				// checking if cake belongs to readymade cake class
			
			if(cakelist[i] instanceof readymadeCake) {
				
				
				readymadeCake ready=(readymadeCake)cakelist[i]; // downcasting 
				ttlprice+=ready.calcPrice();
				ttlquantity+=ready.getQuantity();
				}
			
			}
		// displaying functions implementations
		System.out.println("Total price for all cakes is "+sumprice+" Rs\n");
		
		System.out.println("Total price for ready made cakes is "+ttlprice+" Rs\n");
		
		System.out.println("Total ready made cakes are  "+ttlquantity+"\n");
		
		System.out.printf(" %s",highpricecake);
		
		System.out.println("\nhighest price of cake is "+highestprice);
		
	}
	

}
