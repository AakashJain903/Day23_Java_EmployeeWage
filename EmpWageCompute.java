class EmpWageCompute
{
	private String company;
	private int empRatePerHrs;
	private int numOfWorkingDays;
	private int totalHrsInMonth;
	private int totalWage;

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