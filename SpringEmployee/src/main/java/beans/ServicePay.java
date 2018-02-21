package beans;

public interface ServicePay 
{
	public void changePayRate(long employeeId, double amount);
	public void changeIsProductive(long employeeId, boolean productive);
	public void hireEmployee(long employeeId, String name, double amount);
	public void terminateEmployee(long employeeId);
	public Employee getEmployee(long employeeId);
}
