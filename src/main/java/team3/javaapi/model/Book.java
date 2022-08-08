package team3.javaapi.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Book")
@Data
public class Book {
	
	@Id
    private long id;
    private String BookName;
    
    private String BookUser;
	
	

}
