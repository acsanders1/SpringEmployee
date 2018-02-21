package beans;

public class ServicePayImpl implements ServicePay
{
	private EmployeeDao employeeDao;
	
	public ServicePayImpl(EmployeeDao employeeDao)
	{
		this.employeeDao = employeeDao;
	}
	
	public EmployeeDao getEmployeeDao()
	{
		return employeeDao;
	}
	
	public void setEmployeeDao(EmployeeDao employeeDao)
	{
		this.employeeDao = employeeDao;
	}
	
	public void changePayRate(long employeeId, double amount) 
	{
		// TODO Auto-generated method stub
		Employee employee = employeeDao.find(employeeId);
		if(employee.isProductive())
		{
			employee.setPayRate(employee.getPayRate() + amount);
			employeeDao.update(employee);
		}
	}

	public void changeIsProductive(long employeeId, boolean productive)
	{
		Employee employee = employeeDao.find(employeeId);
		employee.setProductive(productive);
		employeeDao.update(employee);
	}
	
	public void hireEmployee(long employeeId, String name, double amount) 
	{
		// TODO Auto-generated method stub
		Employee employee = new Employee(employeeId, name, amount, false);
		employeeDao.insert(employee);
	}

	public void terminateEmployee(long employeeId) 
	{
		// TODO Auto-generated method stub
		employeeDao.delete(employeeId);
	}

	public Employee getEmployee(long employeeId) 
	{
		// TODO Auto-generated method stub
		return employeeDao.find(employeeId);
	}

}
