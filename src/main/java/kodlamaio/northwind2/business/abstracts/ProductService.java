package kodlamaio.northwind2.business.abstracts;

import kodlamaio.northwind2.entities.concretes.Product;

import java.util.List;

public
interface ProductService {
    List<Product> getAll();
}
