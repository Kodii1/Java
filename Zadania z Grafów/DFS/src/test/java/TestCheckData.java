import org.example.CheckData;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCheckData{

    @Test
    public void testCorrectData(){
        List < List < Integer > > inputList = new ArrayList <>();
        inputList.add(List.of(1 ,3, 4, 6));
        inputList.add(List.of(2 ,5, 6));
        inputList.add(List.of(3 ,1, 5, 7, 8));
        inputList.add(List.of(4 ,1, 5, 7, 8));
        inputList.add(List.of(5 ,2, 3, 4, 7));
        inputList.add(List.of(6 ,1, 2, 7));
        inputList.add(List.of(7 ,3, 4, 5, 6));
        inputList.add(List.of(8 ,3, 4 ));

        Integer startVertex = 1;

        CheckData checkData = new CheckData();

        assertTrue(checkData.checkIsAdjacencyListIsFine(inputList));
        assertTrue(checkData.checkIsStartVertexIsFine(inputList, startVertex));
    }
    @Test
    public void testWrongStartVertex(){
        List < List < Integer > > inputList = new ArrayList <>();
        inputList.add(List.of(1 ,3, 4, 6));
        inputList.add(List.of(2 ,5, 6));
        inputList.add(List.of(3 ,1, 5, 7, 8));
        inputList.add(List.of(4 ,1, 5, 7, 8));
        inputList.add(List.of(5 ,2, 3, 4, 7));
        inputList.add(List.of(6 ,1, 2, 7));
        inputList.add(List.of(7 ,3, 4, 5, 6));
        inputList.add(List.of(8 ,3, 4 ));

        Integer startVertex = -1;

        CheckData checkData = new CheckData();

        assertTrue(checkData.checkIsAdjacencyListIsFine(inputList));
        assertFalse(checkData.checkIsStartVertexIsFine(inputList, startVertex));
    }
    @Test
    public void testWrongAdjacencyList(){
        List < List < Integer > > inputList = new ArrayList <>();
        inputList.add(List.of(1 ,3, 4, 6));
        inputList.add(List.of(2 ,5, 6));
        inputList.add(List.of(3 ,1, 5, 7, 8));
        inputList.add(List.of(4 ,1, 5, 7, 8));
        inputList.add(List.of(5 ,2, 3, 4, 7));
        inputList.add(List.of(6 ,1, 2, 7));
        inputList.add(List.of(7 ,3, 4, 5, 6));
        inputList.add(List.of(8 ,3, 9 ));
        Integer startVertex = 1;

        CheckData checkData = new CheckData();

        assertFalse(checkData.checkIsAdjacencyListIsFine(inputList));
        assertTrue(checkData.checkIsStartVertexIsFine(inputList, startVertex));
    }
}
