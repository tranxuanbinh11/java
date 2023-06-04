package tranxuanbinh.net.QLNS.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tranxuanbinh.net.QLNS.model.PhongBan;
import tranxuanbinh.net.QLNS.repository.PhongBanRepository;

import java.util.List;

@Service
public class PhongBanService {

    @Autowired
    private PhongBanRepository repo;

    public List<PhongBan> listAll() {
        return repo.findAll();
    }

    public void save(PhongBan product) {
        repo.save(product);
    }

    public PhongBan get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}