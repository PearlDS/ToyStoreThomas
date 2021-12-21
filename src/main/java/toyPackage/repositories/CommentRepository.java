package toyPackage.repositories;

import toyPackage.data.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Integer> {

//    @Query("Select c From Comment c Where c.productId = :id")
//    List<Comment> findByProductId(@Param("id") int productId);

    List<Comment> findByProductId(int productId);

}
