class EmployeeWageBuilder implements IEmpWage
{
	private int numOfCompany=0;
	private EmpWageCompute[] companyEmpWageArray;

	public void EmployeeWageBuilder() 
	{
	  companyEmpWageArray = new EmpWageCompute[5];
	}
	
	public void addCompanyEmpWage(String company, int empRatePerHrs, int numOfWorkingDays, int totalHrsInMonth)  
	{
		companyEmpWageArray[numOfCompany]= new EmpWageCompute(company, empRatePerHrs, numOfWorkingDays, totalHrsInMonth);
		numOfCompany++;
	}
	
	public void computeEmpWage() 
	{
		for(int i =0;i<numOfCompany;i++) 
		{
			companyEmpWageArray[i].setTotalWage(this.monthlyWageCompute(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	public void emp_WageBuilder(int empRatePerHrs)
	{
		int empFullDayHrs = 0;
		int totalHrsInMonth=0;
		int empCheck = (int) Math.floor(Math.random()*10) % 3;

		switch (empCheck)
		{
			case 0 :
				empFullDayHrs = 8;
			break;

			case 1 :
				empFullDayHrs = 4;
			break;

			default :
				empFullDayHrs = 0;
			break;
		}

		int dailyWage = dailyWageCompute(totalHrsInMonth, empRatePerHrs);
		System.out.println("Full time Employee Daily Wage is :" + dailyWage);
		int monthlyWage = 20 * dailyWage;
		System.out.println("Employee monthly wage is :" + monthlyWage);
	}

	public static int dailyWageCompute(int totalHrsInMonth, int empRatePerHrs)
	{
		int dailyWage = empRatePerHrs * totalHrsInMonth;
		return dailyWage;
	}

	public static int monthlyWageCompute(EmpWageCompute empwagecompute)
	{
		int dailyWage = dailyWageCompute(empwagecompute.getTotalHrsInMonth(), empwagecompute.getEmpRatePerHrs());
		return dailyWage * empwagecompute.getNumOfWorkingDays();
	}

	public static void welcome()
	{
		System.out.println("welcome to Employee Wage Computation");
	}

	public static void main(String arg[])
	{
		welcome();
		EmployeeWageBuilder empwage = new EmployeeWageBuilder();
		empwage.addCompanyEmpWage("Reliance Fresh", 5, 20, 10);
		empwage.addCompanyEmpWage("Dmart", 10, 22, 20);
		empwage.computeEmpWage();	
	}
}