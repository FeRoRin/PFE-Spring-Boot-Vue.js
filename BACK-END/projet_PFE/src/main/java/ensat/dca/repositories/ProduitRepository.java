package ensat.dca.repositories;

import ensat.dca.entites.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long>{

}
