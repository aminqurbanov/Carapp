package az.ingress.carapp.controller;

import az.ingress.carapp.dto.CarRequestDto;
import az.ingress.carapp.dto.CarResponseDto;
import az.ingress.carapp.service.CarServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/car")
@RequiredArgsConstructor
public class CarController {

  private final CarServiceImpl carService;

  @GetMapping
  public List<CarResponseDto> findAll() {
    return carService.findAll();
  }

  @PostMapping
  public void create(@RequestBody CarRequestDto carRequestDto) {
    carService.createCar(carRequestDto);
  }

  @GetMapping("/{id}")
  public CarResponseDto getCarById(@PathVariable Long id) {
    return carService.getCarById(id);
  }

  @PutMapping("/{id}")
  public void update(@PathVariable Long id, @RequestBody CarRequestDto carRequestDto) {
    carService.update(id, carRequestDto);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id) {
    carService.delete(id);
  }
}
