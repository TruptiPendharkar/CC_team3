package team3.javaapi.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import team3.javaapi.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
