package ci.digitalacademy.MaCantine.Models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
@Table(name ="plat")
@ToString
public class Plat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom" , nullable = false)
    private String nom;

    @Column(name = "description" , nullable = false)
    private String description;

    @OneToOne
    private Menu menu;

}
