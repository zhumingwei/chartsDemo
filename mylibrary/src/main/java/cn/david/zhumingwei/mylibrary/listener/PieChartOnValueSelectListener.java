package cn.david.zhumingwei.mylibrary.listener;


import cn.david.zhumingwei.mylibrary.model.SliceValue;

public interface PieChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int arcIndex, SliceValue value);

}
