package az.ingress.carapp.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class CarResponseDto {
    private Long id;
    private String model;
    private String maker;
    private String engine;
    private String carColor;
    private LocalDate year;
}
