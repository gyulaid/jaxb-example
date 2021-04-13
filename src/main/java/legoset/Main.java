package legoset;



import jaxb.JAXBHelper;

import java.io.FileOutputStream;
import java.net.URL;
import java.time.Year;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        LegoSet legoSet = new LegoSet();

        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setPackaging(Packaging.BOX);

        Set<String> tags = new LinkedHashSet<String>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");


        legoSet.setTags(tags);



        List minifigs = new ArrayList<Minifig>();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Imperial Stormtrooper", 1));

        legoSet.setMinifigs(minifigs);
        legoSet.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));
        legoSet.setNumber("75211");

        legoSet.setRatings(new Ratings(468, 4.4));



        JAXBHelper jaxbHelper = new JAXBHelper();


            jaxbHelper.toXML(legoSet, new FileOutputStream("legoset.xml"));


    }
}
