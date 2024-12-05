package ma.projet.grcp.service;

import ma.projet.grcp.entity.Compte;
import ma.projet.grcp.repo.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompteService {
    private final Repository compteRepository;

    public CompteService(Repository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }

    public Compte findCompteById(String id) {
        return compteRepository.findById(id).orElse(null);
    }

    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }
}
