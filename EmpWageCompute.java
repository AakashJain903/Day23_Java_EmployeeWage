public class EmpWageCompute
{
	private String company;
	private int empRatePerHrs;
	private int numOfWorkingDays;
	private int totalHrsInMonth;
	private int totalWage;
	private int dailywage;

	public int getDailywage()
	{
		return dailywage;
	}

	public void setDailywage(int dailywage)
	{
		this.dailywage = dailywage;
	}

	public int getTotalWage()
	{
		return totalWage;
	}

	public void setTotalWage(int totalWage)
	{
		this.totalWage = totalWage;
	}

	public String getCompany()
	{
		return company;
	}

	public int getEmpRatePerHrs()
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

	public void EmpWageCompute(String company, int empRatePerHrs, int numOfWorkingDays, int totalHrsInMonth)
	{
		this.company = company;
		this.empRatePerHrs = empRatePerHrs;
		this.numOfWorkingDays = numOfWorkingDays;
		this.totalHrsInMonth = totalHrsInMonth;
	}

	public String toString()
	{
		return "Total Employee's Wage for company" + this.company + " is " + this.totalWage;
	}
}