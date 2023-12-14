package main;

import java.util.List;

public final class CheckData{

    public static boolean checkMatrix(List < List < Integer > > input){
        for(List <Integer> x : input){
            if(x.size() != input.size()){
                return false;
            }

            for(Integer y : x){
                if(!(y == 1 || y == 0)){
                    return false;
                }
            }
        }
        return true;
    }
}
