package pl.akademiakodu.Shops.repository;

import org.springframework.data.repository.CrudRepository;
import pl.akademiakodu.Shops.model.Comment;

public interface CommentRepository extends CrudRepository<Comment,Integer> {

}
