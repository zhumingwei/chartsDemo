package cn.david.zhumingwei.chartsdemo.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import cn.david.zhumingwei.chartsdemo.R;
import cn.david.zhumingwei.mylibrary.model.ColumnChartData;
import cn.david.zhumingwei.mylibrary.view.ColumnChartView;

public class MainActivity extends AppCompatActivity {
    ColumnChartView lineChartView;
    private ColumnChartData data;
    private boolean hasAxes;
    private boolean hasAxesNames;
    private boolean hasLabelForSelected;
    private boolean hasLabels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main_activity_menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.main_menu_column:
                startActivity(new Intent(this, ColumnChartActivity.class));

                break;
            case R.id.main_menu_commbo_column_line:
                startActivity(new Intent(this, ComboLineColumnChartActivity.class));
                break;
            case R.id.main_menu_line:
                startActivity(new Intent(this, LineChartActivity.class));
                break;
//            case R.id.main_menu_good_bad:
//                startActivity(new Intent(this,GoodBadChartActivity.class));
//                break;
            case R.id.main_menu_line_column_dependence:
                startActivity(new Intent(this, LineColumnDependencyActivity.class));
                break;
            case R.id.main_menu_pie_chart:
                startActivity(new Intent(this, PieChartActivity.class));
                break;
            case R.id.main_menu_preview_column_chart:
                startActivity(new Intent(this, PreviewColumnChartActivity.class));
                break;
            case R.id.main_menu_preview_line_chart:
                startActivity(new Intent(this, PreviewLineChartActivity.class));
                break;
            case R.id.main_menu_speed_chart:
                startActivity(new Intent(this, SpeedChartActivity.class));
                break;
            case R.id.main_menu_tempo_chart:
                startActivity(new Intent(this, TempoChartActivity.class));
                break;
            case R.id.main_menu_viewpager_charts:
                startActivity(new Intent(this, ViewPagerChartsActivity.class));
                break;
            case R.id.main_menu_bubble:
                startActivity(new Intent(this, BubbleChartActivity.class));
                break;
            case R.id.main_menu_mycolumn_charts:
                startActivity(new Intent(this,MyColumnChartActivity.class));
                break;

        }
        return true;
    }


}
