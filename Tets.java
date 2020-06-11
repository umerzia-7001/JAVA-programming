package exercise;

public class Tets {
	public static void main(String[] args) {
		
		
		SalariedEmployee salEmp=new SalariedEmployee("abc", "def", "982-293-293", 2300);
		
		
		HourlyEmployee hourEmp=new HourlyEmployee("qwe", "rty", "738-383-928", 6720, 2);
		
		CommisionEmployee comEmp=new CommisionEmployee("ali", "zubair", "098-223-234",145.8,87);
		BasePlusComissionEmployee baseEmp=new BasePlusComissionEmployee("zoha", "hameed", "783-273-383", 9303.9, 0.51,45 );
		System.out.printf("Employee processed individually :\n");
		System.out.printf("%s\n%s: $%,.2f",salEmp,"earned ",salEmp.earnings());
		
		System.out.printf("%s\n%s: $%,.2f\n\n",hourEmp,"earned",hourEmp.earnings());
		System.out.printf("%s\n%s: $%,.2f",comEmp,"earned ",comEmp.earnings());
		
		System.out.printf("%s\n%s: $%,.2f",baseEmp,"eearned ",baseEmp.earnings());
		
		System.out.println("\n *** IMPLEMENTING GIVEN TASK ***");
		System.out.println("");
		Employee [] Emp=new Employee[6];
		// upcasting
		Emp[0]=new SalariedEmployee("abc", "def", "982-293-293", 2300);
		Emp[1]=new HourlyEmployee("qwe", "rty", "738-383-928", 6720, 2);
		Emp[2]=new BasePlusComissionEmployee("ali", "zubair","098-223-234",148,987, 89);                                              
		Emp[3]=new CommisionEmployee("zoha", "hameed", "783-273-383", 93.9,67.9);
		Emp[4]=new BasePlusComissionEmployee("tahir", "moaz", "398-123-532", 783.36, 150, 0);
		Emp[5]=new SalariedEmployee("ali", "zubair", "098-223-234",145.8);
		
		for(int i=0;i<Emp.length;i++) {
			
			
			if(Emp[i] instanceof BasePlusComissionEmployee) {
				BasePlusComissionEmployee BaseEmp=(BasePlusComissionEmployee)Emp[i];
				BaseEmp.setBaseSalary(BaseEmp.getBaseSalary()*1.1);
				System.out.printf("New Salary is :"+BaseEmp.earnings()+"\n");
			}
			
		}
		
	}

}
