package cn.david.zhumingwei.mylibrary.listener;


import cn.david.zhumingwei.mylibrary.model.PointValue;

public interface LineChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int lineIndex, int pointIndex, PointValue value);

}
