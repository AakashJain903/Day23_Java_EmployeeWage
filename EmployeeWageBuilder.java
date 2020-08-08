import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class EmployeeWageBuilder implements IEmpWage
{
	private LinkedList<EmpWageCompute> companyEmpWageList;
	private Map<String,EmpWageCompute> companyToEmpWageMap;

	public void EmployeeWageBuilder() 
	{
	  companyEmpWageList = new LinkedList<>();
	  companyToEmpWageMap = new HashMap<>();
	}
	
	public void addCompanyEmpWage(String company, int empRatePerHrs, int numOfWorkingDays, int totalHrsInMonth)  
	{
		EmpWageCompute empwagecompute = new EmpWageCompute(company, empRatePerHrs, numOfWorkingDays, totalHrsInMonth);
		companyEmpWageList.add(empwagecompute);
		companyToEmpWageMap.put(company, empwagecompute);
	}
	
	public void computeEmpWage() 
	{
		for(int i =0;i<companyEmpWageList.size();i++) 
		{
			EmpWageCompute empwagecompute = companyEmpWageList.get(i);
			empwagecompute.setTotalWage(this.monthlyWageCompute(empwagecompute));
			System.out.println("Daily wage for " + empwagecompute.getCompany() + " is " + empwagecompute.getDailywage());
			System.out.println(empwagecompute);
		}
	}

	public int getTotalWage(String company)
	{
		return companyToEmpWageMap.get(company).getTotalWage();
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
		empwage.addCompanyEmpWage("Reliance Fresh", 20, 20, 10);
		empwage.addCompanyEmpWage("Dmart", 10, 22, 20);
		empwage.computeEmpWage();
		System.out.println("Total wage for Reliance Fresh is " + empwage.getTotalWage("Reliance Fresh"));
	
	}
}