class EmployeeWageBuilder
{
	private String company;
	private int empRatePerHrs;
	private int numOfWorkingDays;
	private int totalHrsInMonth;

	public String getCompany()
	{
		return company;
	}

	public int empRatePerHrs()
	{
		return empRatePerHrs;
	}

	public int getNumOfWorkingDays()
	{
		return numOfWorkingDays;
	}

	public int getTotalHrsInMonth()
	{
		return totalHrsInMonth;
	}

	public EmployeeWageBuilder(String company, int empRatePerHrs, int numOfWorkingDays, int totalHrsInMonth)
	{
		this.company = company;
		this.empRatePerHrs = empRatePerHrs;
		this.numOfWorkingDays = numOfWorkingDays;
		this.totalHrsInMonth = totalHrsInMonth;
	}

	public void emp_WageBuilder(int empRatePerHrs)
	{
		int empFullDayHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		int totalWorkingDay = 0;

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

	public static int monthlyWageCompute(EmployeeWageBuilder empwagecompute)
	{
		int dailyWage = dailyWageCompute(empwagecompute.totalHrsInMonth, empwagecompute.empRatePerHrs);
		return dailyWage * empwagecompute.numOfWorkingDays;
	}

	public static void welcome()
	{
		System.out.println("welcome to Employee Wage Computation");
	}

	public static void main(String arg[])
	{
		welcome();
		EmployeeWageBuilder wageCal1 = new EmployeeWageBuilder("Reliance Fresh", 8, 10, 20);
		System.out.println("company" + wageCal1.getCompany() + "Total wage is :");
		System.out.println(monthlyWageCompute(wageCal1));
		EmployeeWageBuilder wageCal2 = new EmployeeWageBuilder("Dmart", 10, 11, 20);
		System.out.println("company" + wageCal2.getCompany() + "Total wage is :");
		System.out.println(monthlyWageCompute(wageCal2));
		
	}
}