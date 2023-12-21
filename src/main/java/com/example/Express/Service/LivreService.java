package com.example.Express.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Express.Repository.LivreRepository;
import com.example.Express.entity.Livre;

import java.util.List;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    public Livre getLivreById(Long id) {
        return livreRepository.findById(id).orElse(null);
    }

    public Livre createLivre(Livre livre) {
        return livreRepository.save(livre);
    }

    public Livre updateLivre(Long id, Livre livre) {
        Livre existingLivre = livreRepository.findById(id).orElse(null);

        if (existingLivre != null) {
            existingLivre.setTitle_livre(livre.getTitle_livre());
            existingLivre.setAuteur(livre.getAuteur());
            existingLivre.setDate_publ(livre.getDate_publ());
            existingLivre.setNum_ISBN(livre.getNum_ISBN());
            existingLivre.setNombreExemplaires(livre.getNombreExemplaires());

            return livreRepository.save(existingLivre);
        } else {
            return null; // Livre non trouvé
        }
    }

    public void deleteLivre(Long id) {
        livreRepository.deleteById(id);
    }

    public Livre ajouterExemplaire(Long id) {
        Livre existingLivre = livreRepository.findById(id).orElse(null);

        if (existingLivre != null) {
            existingLivre.setNombreExemplaires(existingLivre.getNombreExemplaires() + 1);
            return livreRepository.save(existingLivre);
        } else {
            return null; // Livre non trouvé
        }
    }
}
