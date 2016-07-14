
public class EmployeeDetails {
	private String name;
	private int employee_id;
	private String employee_gender;
	
	public EmployeeDetails()
	{
		name="Jack";
		employee_id=123;
		employee_gender="Male";
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employeee_id) {
		this.employee_id = employeee_id;
	}
	public String getEmployee_gender() {
		return employee_gender;
	}
	public void setEmployee_gender(String employee_gender) {
		this.employee_gender = employee_gender;
	}
	
	
	

}
