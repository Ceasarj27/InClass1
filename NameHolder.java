public abstract class NameHolder {
	protected String firstName;
	protected String lastName;
	
	public abstract String describeSelf();
	
	@Override
	public String toString() {
		return "First name: " + firstName + " Last name: " + lastName;
		
	}
	
	protected void setFirstName(String firstName) throws NameException {
		if (!firstName.isEmpty())
			this.firstName = firstName;
		else
			throw new NameException("wrong");
	}
	
	protected void setLastName(String lastName) throws NameException {
		if (!lastName.isEmpty())
			this.lastName = lastName;
		else
			throw new NameException("wrong");
	}

	protected  String getFirstName() {
		return new String(firstName);
	}
	
	protected String getLastName() {
		return new String(lastName);
	}

}