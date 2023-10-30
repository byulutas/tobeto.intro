package Workshop_27_10_2023_Car_Models.dataAccess;

import Workshop_27_10_2023_Car_Models.entities.Car;

public interface CarDao {
    void add(Car car);
    void delete(Car car);

}
