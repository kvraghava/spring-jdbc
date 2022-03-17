package springorm;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class EmployeeDao {
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

//method to save employee  
	public void saveEmployee(Employee e) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.save(e);
	}

//method to update employee  
	public void updateEmployee(Employee e) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.update(e);
	}

//method to delete employee  
	public void deleteEmployee(Employee e) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(e);
	}

//method to return one employee of given id  
	public Employee getById(int id) {
		Session session = getSessionFactory().openSession();
		session.beginTransaction();
		Employee e = (Employee) session.get(Employee.class, id);
		return e;
	}

//method to return all employees  
	/*
	 * public List<Employee> getEmployees() { Session session =
	 * getSessionFactory().openSession(); session.beginTransaction(); List<Employee>
	 * list = new ArrayList<Employee>(); list = session.loadAll(Employee.class);
	 * return list; }
	 */
}
