package az.ingress.carapp.service;

import az.ingress.carapp.dto.CarRequestDto;
import az.ingress.carapp.dto.CarResponseDto;
import az.ingress.carapp.entity.Car;
import az.ingress.carapp.repository.CarRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Service
@RequiredArgsConstructor
public class CarService implements CarServiceImpl {

    private final ModelMapper modelMapper;
    private final CarRepository carRepository;
    @Override
    public void createCar(CarRequestDto carRequestDto) {
        Car car = modelMapper.map(carRequestDto,Car.class);
        carRepository.save(car);


    }
    @Override
    public CarResponseDto getCarById(Long id){
        Car car = carRepository.findById(id).orElseThrow(()->new RuntimeException());
        return modelMapper.map(car, CarResponseDto.class);
    }
}
