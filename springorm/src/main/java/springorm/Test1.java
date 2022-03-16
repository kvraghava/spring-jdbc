package springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");  
	      
		EmployeeDao dao=(EmployeeDao)ctx.getBean("empDao");
		dao.saveEmployee(new Employee(105,"raghava",92000));
	}

}
