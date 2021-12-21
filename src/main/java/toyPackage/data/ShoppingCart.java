package toyPackage.data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class ShoppingCart {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToMany
    private List<Product> products;

    public ShoppingCart() {
    }

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
