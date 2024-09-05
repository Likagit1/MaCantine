package ci.digitalacademy.MaCantine.Services.Mapper;

import ci.digitalacademy.MaCantine.Models.Plat;
import ci.digitalacademy.MaCantine.Services.dto.PlatDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlatMapper extends EntityMapper<PlatDTO , Plat> {
}
