import java.io.Serializable;

@SuppressWarnings("serial")
public class Profile1 implements Serializable {
private String name;
private String surname;
private String patronymic;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public String getPatronymic() {
	return patronymic;
}
public void setPatronymic(String patronymic) {
	this.patronymic = patronymic;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}