package com.example.Express.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Express.entity.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {
    // Ajoutez des méthodes personnalisées si nécessaire
}
