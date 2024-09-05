package ci.digitalacademy.MaCantine.Services.Impl;

import ci.digitalacademy.MaCantine.Repositories.PlatRepository;
import ci.digitalacademy.MaCantine.Services.PlatService;
import ci.digitalacademy.MaCantine.Services.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PlatServiceImpl implements PlatService {

    private final PlatRepository platRepository;


    @Override
    public PlatDTO save(PlatDTO platDTO) {
        return null;
    }

    @Override
    public PlatDTO update(PlatDTO platDTO) {
        return null;
    }

    @Override
    public Optional<PlatDTO> findOne(Long id_plat) {
        return Optional.empty();
    }

    @Override
    public List<PlatDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id_plat) {

    }
}
