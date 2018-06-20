package smartcampus.edata.com.myapplication;


import java.util.ArrayList;
import java.util.List;


import android.app.Activity;

import android.os.Bundle;
import android.view.Menu;

import smartcampus.edata.com.myapplication.addd.TimeTableView;


public class MainActivity extends Activity {
    private TimeTableView mTimaTableView;
//    private List<TimeTableModel> mList;
    private List<Time> mList1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mList = new ArrayList<TimeTableModel>();
        mList1 = new ArrayList<Time>();
        mTimaTableView = (TimeTableView) findViewById(R.id.main_timetable_ly);
        addList();
//        mTimaTableView.setTimeTable(mList);
        mTimaTableView.setTimeTable(mList1);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

    private void addList() {
//        mList.add(new TimeTableModel(0, 1, 2, 1, "8:20", "10:10", "财务报表分析",
//                "王老师", "1", "2-13"));
//        mList.add(new TimeTableModel(0, 3, 4, 1, "8:20", "10:10", "审计实务",
//                "李老师", "2", "2-13"));
//        mList.add(new TimeTableModel(0, 6, 7, 1, "8:20", "10:10", "市场营销实务",
//                "王", "3", "2-13"));
        mList1.add(new Time( 1, 1,"财务报表分析",
                "1" , "1"));
        mList1.add(new Time(  1, 1,"市场营销实务就记得你弟",
                "1", "2"));
        mList1.add(new Time( 3, 3, "审计实务",
                "3", "2"));
        mList1.add(new Time( 3, 3, "叔孙女士还是你划算",
                "3", "5"));
//        mList.add(new TimeTableModel(0, 6, 7, 2, "8:20", "10:10", "财务管理实务",
//                "老师1", "4", "2-13"));
//        mList.add(new TimeTableModel(0, 8, 9, 2, "8:20", "10:10", "财务报表分析",
//                "老师2", "5", "2-13"));
//
//        mList.add(new TimeTableModel(0, 1, 2, 3, "8:20", "10:10", "审计实务",
//                "老师3", "6", "2-13"));
//
//        mList.add(new TimeTableModel(0, 6, 7, 3, "8:20", "10:10", "管理会计实务",
//                "老师4", "7", "2-13"));
//        mList.add(new TimeTableModel(0, 8, 9, 4, "8:20", "10:10", "管理会计实务",
//                "老师5", "9", "2-13"));
//        mList.add(new TimeTableModel(0, 3, 5, 4, "8:20", "10:10", "财务管理实务",
//                "老师4", "8", "2-13"));
//        mList.add(new TimeTableModel(0, 6, 8, 5, "8:20", "10:10", "证券投资分析",
//                "老师7", "11", "2-13"));
//        mList.add(new TimeTableModel(0, 3, 5, 5, "8:20", "10:10", "税务筹划",
//                "老师6", "10", "2-13"));

    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.main_screenshot:
//                ScreenshotUtil.getBitmapByView(this, (ScrollView) findViewById(R.id.main_scrollview));
//                break;
//        }
//        return true;
//    }
}
