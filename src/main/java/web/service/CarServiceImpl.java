package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.LinkedList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private List<Car> fiveCars=new LinkedList<>();
    {
        fiveCars.add(new Car("Lambo",550,300));
        fiveCars.add(new Car("Volga",150,160));
        fiveCars.add(new Car("Mazda",200,180));
        fiveCars.add(new Car("BMW",250,200));
        fiveCars.add(new Car("AKA",50,150));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count > 0 && count <= 5) {
           return fiveCars.subList(0,count);
        } else {
           return fiveCars;
        }
    }
}
