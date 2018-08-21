package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by kogbe on 21/08/2018.
 */
public class SortNumbers {

    public static void main(String[] args){

        String fileLocation = "C://temp//line3.txt";

        try (Stream<String> stream = Files.lines(Paths.get(fileLocation))) {

           List<String[]>  splitFileContent =  stream.map(line -> line.split(","))
                                .collect(Collectors.toList());


            List<Integer> sortedListed =
                    new ArrayList<String>(Arrays.asList(splitFileContent.get(0)))
                            .stream()
                            .mapToInt(value -> Integer.parseInt(value))       //This is convert to integer
                            .sorted()                                         //This is sorted
                            .boxed().collect(Collectors.toList());            //This is forced integer collection of primitives

            //build comma seperated

            String reconstructOutput =
                        sortedListed.stream()
                        .map(value -> String.valueOf(value))
                        .collect(Collectors.joining(","));


            System.out.println(reconstructOutput);

        }catch(IOException  ex){
            ex.printStackTrace();
        }
    }
}
