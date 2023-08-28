package az.ingress.carapp.service;

import az.ingress.carapp.dto.CarRequestDto;
import az.ingress.carapp.dto.CarResponseDto;

import java.util.List;

public interface CarServiceImpl {
    List<CarResponseDto> findAll();

    void createCar(CarRequestDto carRequestDto);

    CarResponseDto getCarById(Long id);
    public void update(Long id,CarRequestDto carRequestDto);

    void delete(Long id);
}
