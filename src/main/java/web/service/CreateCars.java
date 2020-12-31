package web.service;

import web.model.Car;

import java.util.LinkedList;
import java.util.List;

public class CreateCars {
    public static List<Car> getFiveCars(int count){
        List<Car> fiveCars=new LinkedList<>();
        fiveCars.add(new Car("Lambo",550,300));
        fiveCars.add(new Car("Volga",150,160));
        fiveCars.add(new Car("Mazda",200,180));
        fiveCars.add(new Car("BMW",250,200));
        fiveCars.add(new Car("AKA",50,150));
        return fiveCars.subList(0,count);
    }
}
