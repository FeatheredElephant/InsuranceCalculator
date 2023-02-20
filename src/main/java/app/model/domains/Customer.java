package app.model.domains;

public class Customer {

	int id;
	int userId;

	public Customer(int id, int userId) {
		this.id = id;
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Customer{" +
				"id=" + id +
				", userId=" + userId +
				'}';
	}
}