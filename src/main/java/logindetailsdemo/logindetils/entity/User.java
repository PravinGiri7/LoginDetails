package logindetailsdemo.logindetils.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id; 

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
public class User {
	@Id
	private String name;
	private String username;
	private String password;
	private String gender;
	private Date date;
	private String city;
	@Override
	public String toString() {
		return "User [name=" + name + ", username=" + username + ", password=" + password + ", gender=" + gender
				+ ", date=" + date + ", city=" + city + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
