package org.bedu.veterinaria.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table (name= "veterinarians")
public class Veterinarian {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name = "id_veterinarian")
    private Long idVeterinarian;

    @Column(length = 30)
    private String name;

    @Column(length = 30)
    private String lastname;

    @Column()
    private LocalDateTime schedule;

    @Column(nullable = false, length = 13)
    private String phone;

    @Column(length = 30)
    private String specialty;
}