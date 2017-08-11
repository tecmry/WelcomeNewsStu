package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import freshmanspecial.mredrock.com.newstudents.Bean.PieChartData;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.View.PieChartView;


public class Fr_DifficultProject extends Fragment {
    private List<PieChartData> list;
    private PieChartView pieChartView;
    private int[] color=new int[3];
    private int[] transparentcoolor = new int[3];
    public Fr_DifficultProject() {
    }

    public static Fragment getFrament()
    {
        Fr_DifficultProject Fr_DifficultProject = new Fr_DifficultProject();
        return Fr_DifficultProject;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_difficultproject,container,false);
        PieChartData pieChartData_1 = new PieChartData();
        pieChartData_1.setType("ABC");
        pieChartData_1.setValue(0.55f);
        PieChartData pieChartData_2 = new PieChartData();
        pieChartData_2.setType("ABV");
        pieChartData_2.setValue(0.75f);
        PieChartData pieChartData_3 = new PieChartData();
        pieChartData_3.setType("ABX");
        pieChartData_3.setValue(0.69f);
        list = new ArrayList<PieChartData>();
        list.add(pieChartData_1);
        list.add(pieChartData_2);
        list.add(pieChartData_3);
         color = new int[]{R.color.special_2017_InsideCircle, R.color.special_2017_MiddleCircle,
        R.color.special_2017_OutsideCircle};
        transparentcoolor = new int[]{R.color.special_2017_Transparent_InsideCircle,R.color.special_2017_Transparent_MiddleCircle,
                R.color.special_2017_Transparent_OutsideCircle};
        pieChartView = (PieChartView)view.findViewById(R.id.difficult_Piechartview);
        System.out.println("被执行了");
        pieChartView.setColor(color,transparentcoolor);
        pieChartView.setPieDataList(list);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("onStart执行了");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("onResume执行了");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("onPause执行了");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("onStop执行了");
    }


}
