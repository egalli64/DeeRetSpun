package dd;


import java.util.List;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepo extends CrudRepository<Reviews,Integer>  {
	
	List<Reviews> findByRestaurant_id(int id);

}
