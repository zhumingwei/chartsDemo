package cn.david.zhumingwei.mylibrary.provider;


import cn.david.zhumingwei.mylibrary.model.LineChartData;

public interface LineChartDataProvider {

    public LineChartData getLineChartData();

    public void setLineChartData(LineChartData data);

}