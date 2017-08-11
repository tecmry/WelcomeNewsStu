package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import freshmanspecial.mredrock.com.newstudents.Bean.PieChartData;
import freshmanspecial.mredrock.com.newstudents.Bean.SexRatio;
import freshmanspecial.mredrock.com.newstudents.Interface.SexRatioInterface;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.View.PieChartView;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;


public class Fr_MenWomen extends Fragment {
    private PieChartView pieChartView;
    private TextView textView;
    private PieChartData Data_men = new PieChartData();
    private PieChartData Data_women = new PieChartData();
    private List<SexRatio.DataBean> ratio = new ArrayList<>();
    private List<PieChartData> list = new ArrayList<PieChartData>();
    private int color[] = new int[]{R.color.special_2017_men,R.color.special_2017_women};
    private int transparent[] = new int[]{R.color.special_2017_transman,R.color.special_2017_transwomen};
    public static Fragment getFragment()
    {
        Fr_MenWomen Fr_MenWomen = new Fr_MenWomen();
        return Fr_MenWomen;
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_menwomen,container,false);
        textView = (TextView)view.findViewById(R.id.men_Tv_school);
        System.out.println("size:"+list.size());

        pieChartView = (PieChartView)view.findViewById(R.id.men_PieChartView);
        init();
        System.out.println("Data_man"+Data_men.getType());
        list.add(Data_men);
        list.add(Data_women);
        pieChartView.setPieDataList(list);
        pieChartView.setColor(color, transparent);
         return view;
    }

    private void init()
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Retrofit retrofit = new Retrofit.Builder()
                                    .baseUrl("http://www.yangruixin.com/")
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                                    .build();
                SexRatioInterface sexRatio = retrofit.create(SexRatioInterface.class);
                sexRatio.savedMessage("SexRatio")
                        .subscribeOn(Schedulers.io())
                        .doOnNext(new Action1<SexRatio>() {
                            @Override
                            public void call(SexRatio sexRatio) {

                            }
                        })
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeOn(Schedulers.io())
                        .subscribe(new Subscriber<SexRatio>() {
                            @Override
                            public void onCompleted() {

                            }

                            @Override
                            public void onError(Throwable e) {
                            Log.d("TAG",e.toString());
                            }

                            @Override
                            public void onNext(SexRatio sexRatio) {
                                Log.d("TAG","Completed");
                                System.out.println(sexRatio.getStatus());
                                ratio = sexRatio.getData();
                                System.out.println(Float.valueOf(ratio.get(0).getMenRatio()));
                                Data_men.setValue(Float.valueOf(ratio.get(0).getMenRatio()));
                                Data_men.setType(ratio.get(0).getCollege());
                                Data_women.setValue(Float.valueOf(ratio.get(0).getWomenRatio()));
                                Data_women.setType(ratio.get(0).getCollege());
                                System.out.println("list:" + list.get(0).getValue());
                            }
                        });

            }
        }).start();
    }


}
