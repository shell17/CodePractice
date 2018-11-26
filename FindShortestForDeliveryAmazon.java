package com.practice;


// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
import java.util.*;

// CLASS BEGINS, THIS CLASS IS REQUIRED
public class FindShortestForDeliveryAmazon
{
    Double computeDistanceOfTruckFromLocation(List<Integer> location){
        //assuming location has only 2 values
        if(location.size() > 2){
            throw new IllegalArgumentException("Location cannot be more than 2 values");
        }

        //x2 + y2
        int sumOfSquares = (location.get(0) * location.get(0)) +
                (location.get(1) * location.get(1));
        double distance =  Math.sqrt(sumOfSquares);
        return Double.valueOf(distance);

    }

    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    List<List<Integer>> ClosestXdestinations(int numDestinations,
                                             List<List<Integer>> allLocations,
                                             int numDeliveries)
    {
        // WRITE YOUR CODE HERE
        //treemap to store distance for given location and will be inserted in sorted order with lowest being first ,
        //using double for saving decimal places
        TreeMap<Double,List<List<Integer>>> sortedDistanceMap = new TreeMap<>();


        //loop through all locations and compute distance
        for(List<Integer> oneLocation : allLocations ){
            List<List<Integer>> listOfList = new ArrayList<List<Integer>>();

            Double distance = computeDistanceOfTruckFromLocation(oneLocation);
            if(!sortedDistanceMap.containsKey(distance)){
                sortedDistanceMap.put(distance, listOfList);
            }
            listOfList.add(oneLocation);
            sortedDistanceMap.get(distance).add(oneLocation);

        }

        //loop through map for numOfdeliveries times and return List containing shortest distance locations


    /*    List<List<Integer>> allDestinations = sortedDistanceMap.values();
        //Collection<List<Integer>> c = sortedDistanceMap.values();
        List<List<Integer>> closestDestinations = new ArrayList<List<Integer>>();
        for(int i =0; i<numDeliveries; i++){
            closestDestinations.add(allDestinations.get(i));
            //closestDestinations.add(c.get(i));
        }*/


        Collection<List<List<Integer>>> c = sortedDistanceMap.values();
        Iterator<List<List<Integer>>> iter  = c.iterator();

        List<List<Integer>> closestDestinations = new ArrayList<List<Integer>>();

        while(iter.hasNext()){
            List<List<Integer>> listOfList = iter.next();
            if(!listOfList.isEmpty()){
                int i =1;
                while(i<numDeliveries){
                    //closestDestinations.add(listOfList);
                    List<Integer> oneCloseLocation = listOfList.get(i);
                    closestDestinations.add(oneCloseLocation);
                    i++;
                }
                if(i==numDeliveries)
                    break;
            }

        }
        return closestDestinations;
    }


    public static void main(String[] args){
        List<Integer> loc1 = Arrays.asList(2,1);
        List<Integer> loc2 = Arrays.asList(1,1);
        List<Integer> loc3 = Arrays.asList(1,3);
        List<Integer> loc4 = Arrays.asList(5,3);
        List<Integer> loc5 = Arrays.asList(4,4);


        List<List<Integer>> locations = Arrays.asList(loc1,loc2,loc3,loc4,loc5);
        FindShortestForDeliveryAmazon s = new FindShortestForDeliveryAmazon();
        List<List<Integer>> lists = s.ClosestXdestinations(2,locations,2);
        System.out.println("Distance is : ");
        for(List<Integer> smallList : lists){
            System.out.println();
            System.out.println(smallList.toString());
        }

                

    }

    // METHOD SIGNATURE ENDS
}