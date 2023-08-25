package az.ingress.carapp.controller;

import az.ingress.carapp.dto.CarRequestDto;
import az.ingress.carapp.dto.CarResponseDto;
import az.ingress.carapp.service.CarService;
import az.ingress.carapp.service.CarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/api/car")
@RequiredArgsConstructor
public class CarController {

  private final CarServiceImpl carServiceimpl;
    @PostMapping()
  public void create(@RequestBody CarRequestDto carRequestDto){
      carServiceimpl.createCar(carRequestDto);
    }

    @GetMapping("/{id}")
    public CarResponseDto getCarById(@PathVariable Long id){
        return carServiceimpl.getCarById(id);

    }
}

