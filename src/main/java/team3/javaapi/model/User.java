package team3.javaapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "Users")
@Data
public class User {
	
	@Id
	private long Id;
	
	private String Name;
	private String Email;
	private String Role;
	
	
	
	
}
