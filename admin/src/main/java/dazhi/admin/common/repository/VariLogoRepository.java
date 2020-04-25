package dazhi.admin.common.repository;

import dazhi.admin.common.entity.VariLogo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VariLogoRepository extends JpaRepository<VariLogo, Long> {
}
