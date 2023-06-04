package tranxuanbinh.net.QLNS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tranxuanbinh.net.QLNS.model.NhanVien;

@Repository
public interface NhanVienRepository extends JpaRepository<NhanVien, String> {
}
