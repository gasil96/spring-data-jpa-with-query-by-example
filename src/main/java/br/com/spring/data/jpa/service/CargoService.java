package br.com.spring.data.jpa.service;

import br.com.spring.data.jpa.entity.Cargo;
import br.com.spring.data.jpa.repository.CargoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class CargoService implements ICargoService {

    @Autowired
    private CargoRepository cargoRepository;

    @Override
    public void salvar(Cargo cargo) {
        cargoRepository.save(cargo);
    }

    @Override
    public void alterar(Cargo cargo) throws Exception {
        if (cargoRepository.existsById(cargo.getId())) {
            cargoRepository.save(cargo);
            return;
        }
        throw new Exception("Não foi possivel localizar o Cargo de ID: " +
                cargo.getId() + " para atualizar");
    }

    @Override
    public Optional<Cargo> buscarPorId(Long id) {
        return cargoRepository.findById(id);
    }

    @Override
    public void deletarPorId(Long id) {
        cargoRepository.deleteById(id);
    }
}
