package az.ingress.carapp.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import lombok.Data;


import java.time.LocalDate;

@Data
@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String model;

    private String maker;

    private String engine;

    private String carColor;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate year;

}
