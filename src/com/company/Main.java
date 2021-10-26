package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

class GenericAlgorithm{
    List<String> phenotype;
    List<String> population;
    List<String> CodeGreys = new ArrayList<String>
            (Arrays.asList("0000","0001","0011","0010","0110","0111","0101","0100","1100","1101","1111","1110","1010","1011","1001","1000"));

    void PhenotypeCreation(){
        Random random = new Random();
        int temp;
        for(int i =0;i<5;i++){
            temp=random.nextInt(15);
            String temp2=Integer.toString(temp, 2);
            if(temp2.length()<4){
                for(int z=0;z<4-temp2.length();z++){
                    temp2="0"+temp2;
                }
            }
            this.phenotype.add(Integer.toString(temp, 2));
        }
    }
    void PopulationCreation(){
        int first_part;
        int second_part;
        PhenotypeCreation();
        while(population.size()!=10){

        }
    }
    static Double FitnessFunction(List<String> population){
        int min_value=Integer.MAX_VALUE;
        double valueFitnessFunction;
        for(int i = 0; i<population.size();i++){
            int temp=0;
            for(int j = 0;j<population.get(i).length();j++){
                if(population.get(i).charAt(j)=='1'){
                    temp++;
                }
            }
            if(temp<min_value){
                min_value=temp;
            }
        }
        valueFitnessFunction=1/min_value;
        return valueFitnessFunction;
    }

}
public class Main {

    public static void main(String[] args) {

    }
}
