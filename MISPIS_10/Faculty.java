import java.util.Collection;

public class Faculty {

	Employee dean;
	public Institute institutes;
	public String name;

	public Institute getInstitutes() {
		return this.institutes;
	}

	/**
	 * 
	 * @param institutes
	 */
	public void setInstitutes(Institute institutes) {
		this.institutes = institutes;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @param dean
	 * @param institutes
	 * @param name
	 */
	public Faculty(Dean dean, Collection institutes, String name) {
		// TODO - implement Faculty.Faculty
	}

	public void setSessionDate() {
		// TODO - implement Faculty.setSessionDate
	}

}