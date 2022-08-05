package org.example;

import org.example.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    @Autowired
    private RestTemplate restTemplate;

    private final String URL = "http://localhost:8080/api/cars/";

    public List<Car> showAllCars() {
        ResponseEntity<List<Car>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<Car>>() {
                });
        List<Car> carList = responseEntity.getBody();
        return carList;
    }

    public Car getCar(int id) {
        Car car = restTemplate.getForObject(URL + "/" + id, Car.class);
        return car;
    }

    public void deleteCar(int id) {
        restTemplate.delete(URL+"/" + id, Car.class);
        System.out.println("Тачка с id "+ id + " была удалена");
    }

    public void updateCar(Car car) {
        if (car.getId() == 0) {
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(URL, car, String.class);
            System.out.println("Новая тачка была добавлена в БД");
            System.out.println(responseEntity.getBody());
        }else {
            restTemplate.put(URL,car);
            System.out.println("Тачка с id = " + car.getId() + "была обновлена");
        }
    }
}
