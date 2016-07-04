package cn.david.zhumingwei.mylibrary.listener;


import cn.david.zhumingwei.mylibrary.model.PointValue;
import cn.david.zhumingwei.mylibrary.model.SubcolumnValue;

public interface ComboLineColumnChartOnValueSelectListener extends OnValueDeselectListener {

    public void onColumnValueSelected(int columnIndex, int subcolumnIndex, SubcolumnValue value);

    public void onPointValueSelected(int lineIndex, int pointIndex, PointValue value);

}
