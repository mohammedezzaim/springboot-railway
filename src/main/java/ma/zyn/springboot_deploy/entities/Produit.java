package ma.zyn.springboot_deploy.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "produitd")
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;
}
