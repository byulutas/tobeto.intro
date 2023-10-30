package Workshop_27_10_2023_Car_Models.business;



import Workshop_27_10_2023_Car_Models.core.logging.Logger;
import Workshop_27_10_2023_Car_Models.dataAccess.CarDao;
import Workshop_27_10_2023_Car_Models.entities.Car;


public class CarManager {
    //iş kuralları
    private CarDao carDao;
    private Logger[] loggers;

    public CarManager(CarDao carDao, Logger[] loggers ) {
        this.carDao = carDao;
        this.loggers=loggers;
    }

    public void add(Car car) throws Exception {
        //iş kuralları
        if (car.getTotalKm() > 50000 && car.getModelYear()< 2022){
            System.out.println("Aracın Km 50000'den büyük ve model yılı 2022'ten küçük."); ;
        }else {
            carDao.add(car);
        }
        for(Logger logger: loggers){
            logger.log(car.getName());
        }
    }
    public void delete(Car car) throws Exception{
        if(car.getModelYear() > 2022 && car.getTotalKm()<50000){
            throw new Exception("Bu özelliklerdeki araçlar silinemez.");
        }
        carDao.delete(car);
        for(Logger logger: loggers){
            logger.log(car.getName());
        }
    }
}
