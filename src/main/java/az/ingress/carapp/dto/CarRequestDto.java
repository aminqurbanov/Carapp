package az.ingress.carapp.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;


import java.time.LocalDate;
@Data
public class CarRequestDto {

    private String model;

    private String maker;

    private String engine;

    private String carColor;

    private LocalDate year;

}
