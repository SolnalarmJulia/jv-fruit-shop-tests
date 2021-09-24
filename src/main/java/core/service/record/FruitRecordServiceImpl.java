package core.service.record;

import core.model.FruitRecord;
import java.util.ArrayList;
import java.util.List;

public class FruitRecordServiceImpl implements FruitRecordService {

    @Override
    public List<FruitRecord> parserFruit(List<String> createList) {
        List<FruitRecord> fruitList = new ArrayList<>();
        Mapper<String, FruitRecord> recordMap = new FruitRecordMapperImpl();
        for (String record : createList) {
            fruitList.add(recordMap.mappingToObject(record));
        }
        return fruitList;
    }
}
