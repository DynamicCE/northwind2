package kodlamaio.northwind2.dataAccess.abstracts;

import kodlamaio.northwind2.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public
interface ProductDao extends JpaRepository<Product,Integer>  {
}
