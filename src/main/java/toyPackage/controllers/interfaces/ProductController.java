package toyPackage.controllers.interfaces;

import org.springframework.ui.Model;

public interface ProductController {

    String getProducts(Model model);
    String getProductsOnBootStrap(Model model);

}
