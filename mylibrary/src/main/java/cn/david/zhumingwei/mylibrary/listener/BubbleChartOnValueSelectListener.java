package cn.david.zhumingwei.mylibrary.listener;


import cn.david.zhumingwei.mylibrary.model.BubbleValue;

public interface BubbleChartOnValueSelectListener extends OnValueDeselectListener {

    public void onValueSelected(int bubbleIndex, BubbleValue value);

}
