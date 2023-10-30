package Workshop_27_10_2023_Car_Models.dataAccess;

import Workshop_27_10_2023_Car_Models.entities.Car;

public class HibernateCarDao implements CarDao {
    @Override
    public void add(Car car) {
        System.out.println("Hibernate ile " + car.getName() + " eklendi.");
    }

    @Override
    public void delete(Car car) {
        System.out.println("Hibernate ile " + car.getName() + " silindi.");
    }


}
