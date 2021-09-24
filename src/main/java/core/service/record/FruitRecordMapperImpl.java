package core.service.record;

import core.dao.Validator;
import core.dao.ValidatorImpl;
import core.model.FruitRecord;

public class FruitRecordMapperImpl implements Mapper<String, FruitRecord> {
    private static final int OPERATION_TYPE_COLUMN = 0;
    private static final int FRUIT_NAME_COLUMN = 1;
    private static final int QUANTITY_COLUMN = 2;
    private Validator validator = new ValidatorImpl();

    @Override
    public FruitRecord mappingToObject(String record) {
        String[] result;
        result = record.split(",");
        validator.validate(record);
        return (FruitRecord) new FruitRecord(result[OPERATION_TYPE_COLUMN],
                result[FRUIT_NAME_COLUMN], Integer.parseInt(result[QUANTITY_COLUMN]));
    }
}