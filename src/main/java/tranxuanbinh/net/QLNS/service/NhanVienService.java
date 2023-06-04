package tranxuanbinh.net.QLNS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tranxuanbinh.net.QLNS.model.NhanVien;
import tranxuanbinh.net.QLNS.repository.NhanVienRepository;

@Service
public class NhanVienService {

    @Autowired
    private NhanVienRepository repo;

    public List<NhanVien> listAll() {
        return repo.findAll();
    }

    public void save(NhanVien product) {
        repo.save(product);
    }

    public NhanVien get(String id) {
        return repo.findById(id).get();
    }

    public void delete(String id) {
        repo.deleteById(id);
    }
}