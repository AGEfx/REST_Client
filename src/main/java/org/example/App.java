package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);

//        List<Car> carList = communication.showAllCars();
//        System.out.println(carList);

//        Car car = communication.getCar(5);
//        System.out.println(car);

//        Car car = new Car("Go", "Fe", "Fe", 22);
//        car.setId(12);
//        communication.updateCar(car);

            communication.deleteCar(11);

    }
}
