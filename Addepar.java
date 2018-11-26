package com.example.helloworld;



    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class Addepar {


        /*
         * Complete the function below.
         */

        class Position {
            String companyName;
            int numOfShares;

            Position(String companyName, int numOfShares) {
                this.companyName = companyName;
                this.numOfShares = numOfShares;
            }
        }

        static class Transaction{
            String companyName;
            String transactionType;
            int numOfShares;
            int cash;
            Transaction(String c, String t, int n, int cash){
                this.companyName = c;
                this.transactionType = t;
                this.numOfShares =n;
                this.cash = cash;
            }
        }

        static void reconcile(String[] fileContents) {

            int expectedShares = 0, i=0;
            String[] companyNames = new String[2];
            Map<String,Integer> position = new HashMap<String,Integer>();
            Map<String,Integer> finalPosition = new HashMap<String,Integer>();
            Map<String, Transaction> transaction = new HashMap<>();

            while(fileContents[i]!=null){
                if(fileContents.equals("D0-POS")){
                    position.put(fileContents[i++], Integer.valueOf(fileContents[i++]));
                    position.put(fileContents[i++], Integer.valueOf(fileContents[i++]));
                    position.put(fileContents[i++], Integer.valueOf(fileContents[i++]));
                }
                if(fileContents.equals("D1-TRN")){
                    transaction.put(fileContents[i++], new Transaction(fileContents[i++],fileContents[i++],Integer.valueOf(fileContents[i++]),Integer.valueOf(fileContents[i++]) ));
                    transaction.put(fileContents[i++], new Transaction(fileContents[i++],fileContents[i++],Integer.valueOf(fileContents[i++]),Integer.valueOf(fileContents[i++]) ));
                }
                if(fileContents.equals("D1-POS")){
                    finalPosition.put(fileContents[i++], Integer.valueOf(fileContents[i++]));
                    finalPosition.put(fileContents[i++], Integer.valueOf(fileContents[i++]));
                    finalPosition.put(fileContents[i++], Integer.valueOf(fileContents[i++]));
                }
            }

            //actual logic
            for(String company: position.keySet()){

            }
        }
        public static void main(String[] args)  {
            Scanner in = new Scanner(System.in);
            int fileContents_size = 0;
            fileContents_size = Integer.parseInt(in.nextLine().trim());

            String[] fileContents = new String[fileContents_size];
            for(int i = 0; i < fileContents_size; i++) {
                String fileContents_item;
                try {
                    fileContents_item = in.nextLine();
                } catch (Exception e) {
                    fileContents_item = null;
                }
                fileContents[i] = fileContents_item;
            }


            reconcile(fileContents);

        }
    }



