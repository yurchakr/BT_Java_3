package by.bsuir.autobase.dao.VehicleDao;

import by.bsuir.autobase.entity.Vehicle;
import by.bsuir.autobase.dao.DaoFactory;
import by.bsuir.Serialize.Serialize;

import java.io.*;
import java.util.ArrayList;

import by.bsuir.DBController;

/**
 * The type Vehicle dao.
 */
public class VehicleDAO implements IVehicleDAO {

    private static Serialize<Vehicle> serializer = new Serialize<Vehicle>();
    private static String filePath = getDatabasePath();

    public ArrayList<Vehicle> getVehicles(){

        return serializer.deserialize(filePath);
    }


    private static String getDatabasePath(){
        return new File("").getAbsolutePath()+"\\data\\cars.xml";
    }

}
