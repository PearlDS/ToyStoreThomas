package data;


import java.util.List;

public class Product {

    Integer id;
    String title;
    String brand;
    List<Comment> comments;
    String imageLocation;


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
