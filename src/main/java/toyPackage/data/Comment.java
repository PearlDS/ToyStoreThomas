package toyPackage.data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Comment {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    private Product product;
    private String words;
    private Date dayOfComment;
    @ManyToOne
    private User user;


    public Comment() {
    }

    public Comment(Product product, String words, Date dayOfComment, User user) {
        this.product = product;
        this.words = words;
        this.dayOfComment = dayOfComment;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public Date getDayOfComment() {
        return dayOfComment;
    }

    public void setDayOfComment(Date dayOfComment) {
        this.dayOfComment = dayOfComment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
