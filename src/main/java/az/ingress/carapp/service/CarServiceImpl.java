package az.ingress.carapp.service;

import az.ingress.carapp.dto.CarRequestDto;
import az.ingress.carapp.dto.CarResponseDto;

public interface CarServiceImpl {
    void createCar(CarRequestDto carRequestDto);

    CarResponseDto getCarById(Long id);
}
