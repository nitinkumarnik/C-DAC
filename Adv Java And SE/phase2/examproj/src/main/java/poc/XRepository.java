package poc;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;




@Repository 
 public interface XRepository extends JpaRepository<Eraser, Integer>{

	@Query("from Eraser where type = :x")
	List<Eraser> oncat(@Param("x") int y);
}


