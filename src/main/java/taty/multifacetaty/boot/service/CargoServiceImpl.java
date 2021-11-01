package taty.multifacetaty.boot.service;

import taty.multifacetaty.boot.dao.CargoDao;
import taty.multifacetaty.boot.domain.Cargo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

    @Autowired
    private CargoDao dao;


    @Override
    public void salvar(Cargo cargo) {

    }

    @Override
    public void editar(Cargo cargo) {

    }

    @Override
    public void excluir(Long id) {

    }

    @Override
    public Cargo buscarPorId(Long id) {
        return null;
    }

    @Override
    public List<Cargo> buscarTodos() {
        return null;
    }
}
