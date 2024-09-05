package ci.digitalacademy.MaCantine.Services;

import ci.digitalacademy.MaCantine.Services.dto.MenuDTO;

import java.util.List;
import java.util.Optional;

public interface MenuService {

    MenuDTO save(MenuDTO menuDTO);

    MenuDTO update(MenuDTO menuDTO);

    Optional<MenuDTO> findOne(Long menu);

    List<MenuDTO> findAll();

    void delete(Long id_menu);
}
