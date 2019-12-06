package by.bsuir.Serialize;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 * The type Serialize.
 *
 * @param <T> the type parameter
 */
public class Serialize<T> implements ISerialize<T>{

    /*private static final Logger log = Logger.getLogger(Serialize.class);*/

    public ArrayList<T> deserialize(String filePath){
        ArrayList<T> list = null;
        XMLDecoder decoder = null;
        try
        {
                /*log.info("XML file passed XSD validation");*/
                // Reading the object from a file
                FileInputStream file = new FileInputStream(filePath);
                decoder=new XMLDecoder(new BufferedInputStream(file));

                /*log.info("Deserialization started");*/
                // Method for deserialization of object
                list = (ArrayList<T>)decoder.readObject();
                /*log.info("Deserialization completed");*/

                decoder.close();
                file.close();

        }
        catch(Exception ex)
        {
            /*log.error(ex.getMessage());*/
        }

        return list;
    }

}
