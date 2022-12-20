public class Institute {

	public String name;
	public String address;

	public Institute(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void expelStudent() {
		// TODO - implement Institute.expelStudent
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

	public String getAddress() {
		return this.address;
	}

	/**
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}