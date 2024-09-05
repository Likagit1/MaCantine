package ci.digitalacademy.MaCantine.Services;

import ci.digitalacademy.MaCantine.Models.Plat;
import ci.digitalacademy.MaCantine.Services.dto.MenuDTO;
import ci.digitalacademy.MaCantine.Services.dto.PlatDTO;

import java.util.List;
import java.util.Optional;

public interface PlatService {

    PlatDTO save(PlatDTO platDTO);

    PlatDTO update(PlatDTO platDTO);

    Optional<PlatDTO> findOne(Long id_plat);

    List<PlatDTO> findAll();

    void delete(Long id_plat);
}
