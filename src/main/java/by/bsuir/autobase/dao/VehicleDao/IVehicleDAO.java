package by.bsuir.autobase.dao.VehicleDao;

import java.util.ArrayList;
import by.bsuir.autobase.entity.Vehicle;

/**
 * The interface Vehicle dao.
 */
public interface IVehicleDAO {

    /**
     * Gets vehicles.
     *
     * @return the vehicles
     */
    ArrayList<Vehicle> getVehicles();
}
