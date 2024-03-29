package kodlamaio.northwind2.api.controllers;

import kodlamaio.northwind2.business.abstracts.ProductService;
import kodlamaio.northwind2.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public
class ProductsController {

    @Autowired
    private
    ProductService productService;


     
    @GetMapping("/getall")
    public
    List<Product> getAll(){
       return productService.getAll ();
    }


}
