package toyPackage.data;


import javax.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String title;
    private String brand;
    @OneToMany(mappedBy = "product", cascade = CascadeType.REMOVE)
    private List<Comment> comments;
    private String imageLocation;


    public Product() {
    }

    public Product(String title, String brand, List<Comment> comments, String imageLocation) {
        this.title = title;
        this.brand = brand;
        this.comments = comments;
        this.imageLocation = imageLocation;
    }

    public Integer getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageLocation() {
        return imageLocation;
    }

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
}
