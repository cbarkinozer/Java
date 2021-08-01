package insuranceManagementSystem;

public enum AuthenticationStatus {
	FAIL(0), SUCCESS(1);

	private int status;

	AuthenticationStatus(int status) {
		this.status = status;
	}

	public int getStatus() {
		return this.status;
	}
}
