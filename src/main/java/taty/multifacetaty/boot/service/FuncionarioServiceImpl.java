package taty.multifacetaty.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import taty.multifacetaty.boot.dao.FuncionarioDao;
import taty.multifacetaty.boot.domain.Funcionario;

import java.util.List;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

    @Autowired
    private FuncionarioDao dao;

    @Transactional(readOnly = false)
    @Override
    public void salvar(Funcionario funcionario) {
        dao.save(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void editar(Funcionario funcionario) {
        dao.update(funcionario);
    }

    @Transactional(readOnly = false)
    @Override
    public void excluir(Long id) {
        dao.delete(id);
    }

    @Transactional(readOnly = true)
    @Override
    public Funcionario buscarPorId(Long id) {
        return dao.findById(id);
    }
    @Transactional(readOnly = true)
    @Override
    public List<Funcionario> buscarTodos() {
        return dao.findAll();
    }

//    @Override
//    public boolean funcionarioTemCargos(Long id) {
//        return false;
//    }

//    @Override
//    public boolean funcionarioTemSalario(Long id) {
//        if (buscarPorId(id).getSalario()) {
//            return false;
//        }
//        return true;
//    }
}