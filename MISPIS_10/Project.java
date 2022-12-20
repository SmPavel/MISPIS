import java.util.Date;

public class Project {

	public String name;
	public Date start;
	public Date end;

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

	public Date getStart() {
		return this.start;
	}

	/**
	 * 
	 * @param start
	 */
	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return this.end;
	}

	/**
	 * 
	 * @param end
	 */
	public void setEnd(Date end) {
		this.end = end;
	}

	/**
	 * 
	 * @param name
	 * @param start
	 * @param end
	 */
	public Project(String name, Date start, Date end) {
		// TODO - implement Project.Project
	}

	public void publishResults() {
		// TODO - implement Project.publishResults
	}

}