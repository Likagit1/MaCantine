package ci.digitalacademy.MaCantine.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;
@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name ="menu")
@ToString
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom_menu" , nullable = false)
    private Instant NomMenu;

    @Column(name = "creaton_date" , nullable = false)
    private Instant CreationDate;


}
