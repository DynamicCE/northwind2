package kodlamaio.northwind2.business.concretes;

import kodlamaio.northwind2.business.abstracts.ProductService;
import kodlamaio.northwind2.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind2.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public
class ProductManager implements ProductService {

    @Autowired
    private
    ProductDao productDao;


    @Override
    public
    List<Product> getAll () {
        return null;
    }
}
