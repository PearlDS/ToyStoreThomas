package toyPackage.services.interfaces;

import toyPackage.data.Product;

import java.util.List;

public interface ProductService {

    void createProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(int id);
}
