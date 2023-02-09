package app.model.domains;

public class User extends Domain{
	private int userId;
	private String email;
	private String password;
	private String name;
	
	public User(int userId, String email, String password, String name) {
		super();
		setId(userId);
		setEmail(email);
		setPassword(password);
		setName(name);
	}
	
	public int getId() {
		return userId;
	}
	public void setId(int userId) {
		this.userId = userId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + userId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (userId != other.userId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [id=" + userId + ", email=" + email + ", password=" + password + ", name=" + name + "]";
	}
}
