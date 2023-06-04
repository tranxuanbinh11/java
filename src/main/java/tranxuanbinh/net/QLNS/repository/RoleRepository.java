package tranxuanbinh.net.QLNS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tranxuanbinh.net.QLNS.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}
