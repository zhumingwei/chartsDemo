package cn.david.zhumingwei.chartsdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import cn.david.zhumingwei.chartsdemo.R;
import cn.david.zhumingwei.mylibrary.gesture.ZoomType;
import cn.david.zhumingwei.mylibrary.model.Axis;
import cn.david.zhumingwei.mylibrary.model.AxisValue;
import cn.david.zhumingwei.mylibrary.model.Column;
import cn.david.zhumingwei.mylibrary.model.ColumnChartData;
import cn.david.zhumingwei.mylibrary.model.SubcolumnValue;
import cn.david.zhumingwei.mylibrary.util.ChartUtils;
import cn.david.zhumingwei.mylibrary.view.ColumnChartView;

/**
 * Created by zhumingwei on 16/7/4.
 */
public class MyColumnChartActivity extends AppCompatActivity {

    ColumnChartView chart;
    private boolean hasAxes;
    private boolean hasAxesNames;
    private ColumnChartData data;
    private boolean hasLabels;
    private boolean hasLabelForSelected;

    @Override

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_column_chart);
        chart = (ColumnChartView) findViewById(R.id.chart);
        chart.setZoomType(ZoomType.HORIZONTAL);
        reset();
        generateDefaultData();
        chart.setZoomLevelWithAnimation(1,0,1);
    }

    private void reset() {
        hasAxes = true;
        hasAxesNames = true;
        hasLabels = false;
        hasLabelForSelected = false;
        chart.setValueSelectionEnabled(hasLabelForSelected);

    }

    private void generateDefaultData() {
        hasAxes=true;
        hasAxesNames=true;
        hasLabels=true;
        hasLabelForSelected=true;
        List<AxisValue> axisValueList=new ArrayList<>();

        int numSubcolumns = 1;
        int numColumns = 20;
        // Column can have many subcolumns, here by default I use 1 subcolumn in each of 8 columns.
        List<Column> columns = new ArrayList<Column>();
        List<SubcolumnValue> values;
        for (int i = 0; i < numColumns; ++i) {

            values = new ArrayList<SubcolumnValue>();
            for (int j = 0; j < numSubcolumns; ++j) {
                values.add(new SubcolumnValue((float) Math.random() * 50f + 5, ChartUtils.pickColor()));
            }

            Column column = new Column(values);

            column.setHasLabels(hasLabels);
            column.setHasLabelsOnlyForSelected(hasLabelForSelected);

            columns.add(column);

            axisValueList.add(new AxisValue(i).setLabel("lab"+i));
        }

        data = new ColumnChartData(columns);

        if (hasAxes) {
            Axis axisX = new Axis();
            Axis axisY = new Axis().setHasLines(true);
            if (hasAxesNames) {
                axisX.setName("Axis X");
                axisY.setName("Axis Y");
            }

            axisX.setValues(axisValueList);
            data.setAxisXBottom(axisX);
            data.setAxisYLeft(axisY);

        } else {
            data.setAxisXBottom(null);
            data.setAxisYLeft(null);
        }

        chart.setColumnChartData(data);

    }
}
