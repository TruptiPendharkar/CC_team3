package team3.javaapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CounterParty")
@Data
public class CounterParty {
	 	
		@Id
	    private long id;
	    private String Name;

	    
}