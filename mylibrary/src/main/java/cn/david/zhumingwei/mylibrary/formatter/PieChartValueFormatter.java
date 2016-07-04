package cn.david.zhumingwei.mylibrary.formatter;


import cn.david.zhumingwei.mylibrary.model.SliceValue;

public interface PieChartValueFormatter {

    public int formatChartValue(char[] formattedValue, SliceValue value);
}
