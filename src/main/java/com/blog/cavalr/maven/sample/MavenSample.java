package com.blog.cavalr.maven.sample;


import java.util.ArrayList;
import java.util.List;

/**
 * This class is Sample class to show the javadocs generated with
 * maven plugin <b>attach-javadocs</b>
 *  
 * @author cavalr
 * @version 1.0
 * @since 1.0
 */
public class MavenSample {

    public static void main(String[] args) {
        System.out.println("Maven Sample");
    }


    /**
     * Returns the list of the nearby cities. 
     * The nearby city location are calculated based on the provided 
     * latitude and longitude and given radius.
     * <p>
     * The method always returns immediately, whether or not the 
     * the location is valid or not. For invalid latitude and longitude 
     * an empty list of the cities are returned. 
     *
     * @param  latitude  an absolute URL giving the base location of the image
     * @param  longitude the location of the image, relative to the url argument
     * @param  radius the location of the image, relative to the url argument
     * @return      nearby cities to given location
     */
    public List<String> searchNearby(String latitude, String longitude, int radius) {
        List<String> cities = new ArrayList<String>();
        return cities;

    }
}
