public interface IEmpWage 
{
	public void addCompanyEmpWage(String company, int empRatePerHrs, int numOfWorkingDays, int totalHrsInMonth);
	public void computeEmpWage();
}