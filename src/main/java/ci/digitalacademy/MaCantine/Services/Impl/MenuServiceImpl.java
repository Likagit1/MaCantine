package ci.digitalacademy.MaCantine.Services.Impl;

import ci.digitalacademy.MaCantine.Repositories.MenuRepository;
import ci.digitalacademy.MaCantine.Services.MenuService;
import ci.digitalacademy.MaCantine.Services.dto.MenuDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
@Slf4j
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    @Override
    public MenuDTO save(MenuDTO menuDTO) {
        return null;
    }

    @Override
    public MenuDTO update(MenuDTO menuDTO) {
        return null;
    }

    @Override
    public Optional<MenuDTO> findOne(Long id_user) {
        return Optional.empty();
    }

    @Override
    public List<MenuDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id_menu) {

    }
}
