package ci.digitalacademy.MaCantine.Services.Mapper;

import ci.digitalacademy.MaCantine.Models.Menu;
import ci.digitalacademy.MaCantine.Services.dto.MenuDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuMapper extends EntityMapper<MenuDTO, Menu> {

}
