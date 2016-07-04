package cn.david.zhumingwei.mylibrary.listener;


import cn.david.zhumingwei.mylibrary.model.SubcolumnValue;

public interface ColumnChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int columnIndex, int subcolumnIndex, SubcolumnValue value);

}
