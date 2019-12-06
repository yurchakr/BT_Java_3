package by.bsuir.Serialize;

import java.util.ArrayList;

/**
 * The interface Serialize.
 *
 * @param <T> the type parameter
 */
public interface ISerialize<T> {

    /**
     * Deserialize array list.
     *
     * @param filePath the file path
     * @return the array list
     */
    ArrayList<T> deserialize(String filePath);


}
