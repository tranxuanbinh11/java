package tranxuanbinh.net.QLNS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tranxuanbinh.net.QLNS.model.PhongBan;
@Repository
public interface PhongBanRepository extends JpaRepository<PhongBan, String> {
}
