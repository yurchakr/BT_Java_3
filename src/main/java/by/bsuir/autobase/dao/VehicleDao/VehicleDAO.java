package by.bsuir.autobase.dao.VehicleDao;

import by.bsuir.Parsers.DOM;
import by.bsuir.Parsers.SAX;
import by.bsuir.Parsers.StAX;
import by.bsuir.autobase.entity.Vehicle;
import by.bsuir.autobase.dao.DaoFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLStreamException;
import java.io.*;
import java.util.ArrayList;

public class VehicleDAO implements IVehicleDAO {

    public ArrayList<Vehicle> getVehicles() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
        ArrayList<Vehicle> vehicles = null;
        String filePath = "C:\\Users\\Aleksey\\Desktop\\универ\\5_сем\\BT\\lab3\\data\\cars.xml";

        /*
        // SAX Parser
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        SAX saxParser = new SAX();
        parser.parse(new File(filePath), saxParser);
        vehicles = saxParser.getResult();
        */

        // StAX Parser
        InputStream inputStream = new FileInputStream(filePath);
        StAX staxParser = new StAX(inputStream);
        vehicles = staxParser.getResult();

        /*
        // DOM Parser
        DOM domParser = new DOM();
        vehicles = domParser.getResult(filePath);
        */

        return vehicles;
    }


    private static String getDatabasePath(){
        return new File("").getAbsolutePath()+"\\data\\cars.xml";
    }

}
