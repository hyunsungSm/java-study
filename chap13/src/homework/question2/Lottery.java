package homework.question2;

import java.util.Objects;

public class Lottery implements Comparable<Lottery>{
	private String name;
	private String phone;
	
	public Lottery() {
	}

	public Lottery(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Lottery)) {
			return false;
		}
		Lottery other = (Lottery) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public int compareTo(Lottery l) {
		if (name.equals(l.name)) {
			return phone.compareTo(l.phone);
		}
		return 0;
	}		
}
