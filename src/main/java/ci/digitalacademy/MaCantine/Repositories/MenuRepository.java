package ci.digitalacademy.MaCantine.Repositories;

import ci.digitalacademy.MaCantine.Models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
