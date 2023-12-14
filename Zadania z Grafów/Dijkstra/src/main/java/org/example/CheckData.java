package org.example;

import java.util.List;

public class CheckData{

    public static boolean checkIsMatrixListIsFine(List < List < Integer > > input){
        for(List < Integer > row : input){
            if( row.size() != input.size() ){
                return false;
            }
        }
        return true;
    }
    public static boolean checkIsStartVertexIsFine(List < List < Integer > > input ,Integer startVertex){
        return startVertex <= input.size() && startVertex >= 0;
    }
}
