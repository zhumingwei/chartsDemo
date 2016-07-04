package cn.david.zhumingwei.mylibrary.formatter;


import cn.david.zhumingwei.mylibrary.model.BubbleValue;

public interface BubbleChartValueFormatter {

    public int formatChartValue(char[] formattedValue, BubbleValue value);
}
