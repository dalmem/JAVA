package encap.obj;

public class Hotel {
	int i;
	Chef chef;
	Employee emp;
	String s;
	
	public Hotel() {
		this.chef = new Chef();
		this.emp = new Employee();
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public Chef getChef() {
		return chef;
	}
	public void setEmp(Employee emp) {
		this.emp =emp;
	}
	public Employee getEmp() {
		return emp;
	}
}
