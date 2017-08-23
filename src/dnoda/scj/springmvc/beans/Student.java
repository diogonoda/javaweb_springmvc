package dnoda.scj.springmvc.beans;

public class Student {
	private String name;
	private String birthdate;

	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String dataNasc) {
		this.birthdate = dataNasc;
	}
}
