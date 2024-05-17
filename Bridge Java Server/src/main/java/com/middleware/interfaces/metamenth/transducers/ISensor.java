package com.middleware.interfaces.metamenth.transducers;

import com.middleware.interfaces.metamenth.datatypes.IAbstractMeasure;
import com.middleware.interfaces.metamenth.datatypes.IAbstractRangeMeasure;

public interface ISensor extends IAbstractTransducer {
    String toString();
    String getMeasure();
    void setMeasure(String measure);
    IAbstractRangeMeasure getMeasureRange();
    void setMeasureRange(IAbstractRangeMeasure measureRange);
    int getDataFrequency();
    void setDataFrequency(int dataFrequency);
    String getUnit();
    void setUnit(String unit);
    //using double or float creates an error when accessing in python
    //Replace generic object type after investiation
    Object getCurrentValue();
    void setCurrentValue(Object currentValue);
    String getMeasureType();
    void setMeasureType(String measureType);
    String getSensorLogType();
    void setSensorLogType(String sensorLogType);
    void setSetPoint(IAbstractMeasure setPoint);
}