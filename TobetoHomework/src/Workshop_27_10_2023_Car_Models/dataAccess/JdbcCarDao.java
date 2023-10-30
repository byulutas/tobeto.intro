package Workshop_27_10_2023_Car_Models.dataAccess;

import Workshop_27_10_2023_Car_Models.entities.Car;

public class JdbcCarDao implements CarDao{
    @Override
    public void add(Car car) {
        System.out.println("Jdbc ile "+ car.getName() + " eklendi.");
    }

    @Override
    public void delete(Car car) {
        System.out.println("Jdbc ile "+ car.getName() + " silindi.");
    }



}