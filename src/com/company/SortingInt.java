package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by kogbe on 20/08/2018.
 */
public class SortingInt {

    public static void  main(String[] args){

        //File Location
        String fileLocation = "C://temp/lineInt.txt";
        List<Integer> list =  new ArrayList<>();

        //read file into stream, try-with-resources
        try(Stream<String> stream = Files.lines(Paths.get(fileLocation))){

              stream.filter(n -> { return  Integer.parseInt(n) % 2 ==0;}) //Lambda Anonymous block -- reduce data set
                    .mapToInt(n -> Integer.parseInt(n))                   // map by performing  operation on data set
                    .sorted()                                             //Sort filtered and Mapped data set
                    .forEach(System.out::println);                        // loop through data

        }catch (IOException ex){
            ex.printStackTrace();
        }


        list.forEach(System.out::println);
    }

}
