package ensat.dca.repositories;

import ensat.dca.entites.LigneCommande;
import ensat.dca.entites.LigneCommandeKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface LigneCommandeRepository extends JpaRepository<LigneCommande, LigneCommandeKey> {
    List<LigneCommande> findByCommandeId(long commandeId);
}
