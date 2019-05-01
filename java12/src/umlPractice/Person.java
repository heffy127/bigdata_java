package umlPractice;

public class Person {
	private int height;
	private int weight;
	private String secret;
	private String address;

	public Person(int height, int weight, String secret, String address) {
		super();
		this.height = height;
		this.weight = weight;
		this.secret = secret;
		this.address = address;
	}

	public Person(int height, int weight, String secret) {
		super();
		this.height = height;
		this.weight = weight;
		this.secret = secret;
	}

	public int getWeight() {
		return weight;
	}

	public String getSecret() {
		return secret;
	}

	public double bestWeight() {
		return (height - 100) * 0.9;
	}

}
