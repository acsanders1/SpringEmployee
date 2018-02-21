package beans;

//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartProgram 
{
	public static void main(String[] args)
	{
//		AnnotationConfigApplicationContext applicationContext = new 
//		AnnotationConfigApplicationContext(BeanConfiguration.class);
		ClassPathXmlApplicationContext applicationContext = new 
		ClassPathXmlApplicationContext("beans/beans.xml");
		
		ServicePay servicePay = applicationContext.getBean("servicePay", ServicePay.class);
		
		System.out.println("Before raises");
		System.out.println(servicePay.getEmployee(1).getEmployeeName() +": " +servicePay.getEmployee(1).getPayRate());
		System.out.println(servicePay.getEmployee(4).getEmployeeName() +": " +servicePay.getEmployee(4).getPayRate());
		
		servicePay.changePayRate(1L, .50);
		servicePay.changePayRate(4L, .50);

		System.out.println("After raises");
		System.out.println(servicePay.getEmployee(1).getEmployeeName() +": " +servicePay.getEmployee(1).getPayRate());
		System.out.println(servicePay.getEmployee(4).getEmployeeName() +": " +servicePay.getEmployee(4).getPayRate());
		
		System.out.println("After evaluation and next raises");
		
		servicePay.changeIsProductive(4L, true);
		servicePay.changePayRate(4L, 1.00);
		
		System.out.println(servicePay.getEmployee(4).getEmployeeName() +": " +servicePay.getEmployee(4).getPayRate());

		System.out.println("Before termination");
		System.out.println(servicePay.getEmployee(2).getEmployeeName() +": " +servicePay.getEmployee(2).getPayRate());

		servicePay.terminateEmployee(2L);
		
		System.out.println("After termination");
		try
		{
		System.out.println(servicePay.getEmployee(2).getEmployeeName() +": " +servicePay.getEmployee(2).getPayRate());
		}
		catch (Exception e)
		{
			System.out.println("Employee has been terminated");
		}

		System.out.println("Hiring new employees");
		
		servicePay.hireEmployee(7L, "Joe", 7.25);
		servicePay.hireEmployee(2L, "Ashley", 7.25);
		
		System.out.println(servicePay.getEmployee(7).getEmployeeName() +": " +servicePay.getEmployee(7).getPayRate());
		System.out.println(servicePay.getEmployee(2).getEmployeeName() +": " +servicePay.getEmployee(2).getPayRate());

		System.out.println("Getting employee info based on ID");
		System.out.println(servicePay.getEmployee(5).toString());
		
		applicationContext.close();
	}
}
