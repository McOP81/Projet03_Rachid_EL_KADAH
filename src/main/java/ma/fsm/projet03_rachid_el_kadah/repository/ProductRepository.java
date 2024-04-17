package ma.fsm.projet03_rachid_el_kadah.repository;

import ma.fsm.projet03_rachid_el_kadah.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
