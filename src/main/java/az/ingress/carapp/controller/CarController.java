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

  private final CarServiceImpl carServiceimpl;
  @GetMapping
  public List<CarResponseDto> findAll() {
    return carServiceimpl.findAll();
  }
  @PostMapping()
  public void create(@RequestBody CarRequestDto carRequestDto){
    carServiceimpl.createCar(carRequestDto);
  }

  @GetMapping("/{id}")
  public CarResponseDto getCarById(@PathVariable Long id){
    return carServiceimpl.getCarById(id);

  }
  @PutMapping("/{id}")
  public void update(@PathVariable Long id, @RequestBody CarRequestDto carRequestDto){
    carServiceimpl.update(id,carRequestDto);
  }
  @DeleteMapping("/{id}")
  public void delete(@PathVariable Long id){
    carServiceimpl.delete(id);
  }
}