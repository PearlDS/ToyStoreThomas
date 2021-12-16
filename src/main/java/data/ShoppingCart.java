package data;


import java.util.List;


public class ShoppingCart {


    private Integer id;

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
