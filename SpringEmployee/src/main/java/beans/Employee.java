package beans;

public class Employee 
{
	private long employeeId;
	private String employeeName;
	private double payRate;
	private boolean productive;
	
	public Employee()
	{
		
	}
	
	public Employee(long employeeId, String employeeName, double payRate, boolean productive)
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.payRate = payRate;
		this.productive = productive;
	}

	public long getEmployeeId() 
	{
		return employeeId;
	}

	public void setEmployeeId(long employeeId) 
	{
		this.employeeId = employeeId;
	}

	public String getEmployeeName() 
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName) 
	{
		this.employeeName = employeeName;
	}

	public double getPayRate() 
	{
		return payRate;
	}

	public void setPayRate(double payRate) 
	{
		this.payRate = payRate;
	}

	public boolean isProductive() 
	{
		return productive;
	}

	public void setProductive(boolean productive) 
	{
		this.productive = productive;
	}
	
	@Override
	public String toString() 
	{
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", payRate=" + payRate
				+ ", productive=" + productive + "]";
	}
}
