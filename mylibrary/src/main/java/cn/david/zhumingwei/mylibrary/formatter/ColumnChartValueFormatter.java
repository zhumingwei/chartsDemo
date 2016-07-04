package cn.david.zhumingwei.mylibrary.formatter;


import cn.david.zhumingwei.mylibrary.model.SubcolumnValue;

public interface ColumnChartValueFormatter {

    public int formatChartValue(char[] formattedValue, SubcolumnValue value);

}
