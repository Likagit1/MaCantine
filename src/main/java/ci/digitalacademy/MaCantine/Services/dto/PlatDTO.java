package ci.digitalacademy.MaCantine.Services.dto;

import ci.digitalacademy.MaCantine.Models.Menu;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatDTO {
    private Long id;
    private String nom;
    private String description;
    private Menu menu;
}
