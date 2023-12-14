package pl.ajarzab;

import java.util.List;

public final class CheckData{

    public static boolean checkAdjacencyList(List < List < Integer > > input){
        for(List < Integer > row : input){
            if( row.size() != input.size() ){
                return false;
            }
        }
        return true;
    }

}
