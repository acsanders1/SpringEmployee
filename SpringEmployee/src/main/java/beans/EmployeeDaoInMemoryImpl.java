package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDaoInMemoryImpl implements EmployeeDao
{
	private Map<Long, Employee> employeesMap = new HashMap<Long, Employee>();
	{
		Employee employee1 = new Employee(1L, "Jen", 13.50, true);
		Employee employee2 = new Employee(2L, "Matt", 7.25, false);
		Employee employee3 = new Employee(3L, "Pete", 9.00, true);
		Employee employee4 = new Employee(4L, "Sydney", 9.50, false);
		Employee employee5 = new Employee(5L, "Logan", 8.50, true);
		Employee employee6 = new Employee(6L, "John", 7.25, true);
	
		employeesMap.put(employee1.getEmployeeId(), employee1);
		employeesMap.put(employee2.getEmployeeId(), employee2);
		employeesMap.put(employee3.getEmployeeId(), employee3);
		employeesMap.put(employee4.getEmployeeId(), employee4);
		employeesMap.put(employee5.getEmployeeId(), employee5);
		employeesMap.put(employee6.getEmployeeId(), employee6);
	}	
	
	public Map<Long, Employee> getEmployeesMap() 
	{
		return employeesMap;
	}

	public void setEmployeesMap(Map<Long, Employee> employeesMap) 
	{
		this.employeesMap = employeesMap;
	}

	public void insert(Employee employee)
	{
		// TODO Auto-generated method stub
		employeesMap.put(employee.getEmployeeId(), employee);
	}

	public void update(Employee employee) 
	{
		// TODO Auto-generated method stub
		employeesMap.put(employee.getEmployeeId(), employee);
	}

	public void update(List<Employee> employees) 
	{
		// TODO Auto-generated method stub
		for(Employee employee: employees)
		{
			update(employee);
		}
	}

	public void delete(Long employeeId) 
	{
		// TODO Auto-generated method stub
		employeesMap.remove(employeeId);
	}

	public Employee find(Long employeeId)
	{
		// TODO Auto-generated method stub
		return employeesMap.get(employeeId);
	}

	public List<Employee> find(List<Long> employeeIds) 
	{
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		for(Long id: employeeIds)
		{
			employees.add(employeesMap.get(id));
		}
		return employees;
	}

	public List<Employee> find(String employeeName) 
	{
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values())
		{
			if(employeeName.equals(employee.getEmployeeName()))
			{
				employees.add(employee);
			}
		}
		return employees;
	}

	public List<Employee> find(boolean productive) 
	{
		// TODO Auto-generated method stub
		List<Employee> employees = new ArrayList<Employee>();
		for(Employee employee: employeesMap.values())
		{
			if(productive == (employee.isProductive()))
			{
				employees.add(employee);
			}
		}
		return employees;
	}

}
