package cn.david.zhumingwei.mylibrary.formatter;


import cn.david.zhumingwei.mylibrary.model.PointValue;

public interface LineChartValueFormatter {

    public int formatChartValue(char[] formattedValue, PointValue value);
}
