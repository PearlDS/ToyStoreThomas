package toyPackage.controllers.implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import toyPackage.controllers.interfaces.ProductController;
import toyPackage.data.Product;
import toyPackage.services.interfaces.ProductService;

import java.util.List;

@Controller
public class ProductControllerImpl implements ProductController {

    @Autowired
    private ProductService productService;

    @Override
    @GetMapping("/toys")
    public String getProducts(Model model) {
        List<Product>toysFound = productService.getAllProducts();
        model.addAttribute("products", toysFound);
        return "toytest";
    }

    @Override
    @GetMapping("/toys2")
    public String getProductsOnBootStrap(Model model) {
        List<Product>toysFound = productService.getAllProducts();
        model.addAttribute("products", toysFound);
        return "index";
    }
}
