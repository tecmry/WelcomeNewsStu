package freshmanspecial.mredrock.com.newstudents.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

import freshmanspecial.mredrock.com.newstudents.Bean.BestManData;
import freshmanspecial.mredrock.com.newstudents.Bean.SexRatio;
import freshmanspecial.mredrock.com.newstudents.Interface.SexRatioInterface;
import freshmanspecial.mredrock.com.newstudents.R;
import freshmanspecial.mredrock.com.newstudents.adapter.BestTeacherAdpter;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Tecmry on 2017/8/6.
 */

public class Fr_BestTeacher extends BaseFragment {
    private RecyclerView Rv;
    private BestTeacherAdpter mAdapter;
    private List<BestManData> list = new ArrayList<BestManData>();

    public static Fragment getFragment()
    {
        Fr_BestTeacher bestMan = new Fr_BestTeacher();
        return bestMan;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.special_2017_bestteacher,container,false);
        init(view);
        return view;
    }
    private void init(View view)
    {
        Rv = (RecyclerView)view.findViewById(R.id.Tc_Rv);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        mAdapter = new BestTeacherAdpter(list);
        Rv.setLayoutManager(layoutManager);
        Rv.setAdapter(mAdapter);
    }

    @Override
    protected void onFragmentVisibleChange(boolean isVisible) {
        super.onFragmentVisibleChange(isVisible);
        if (isVisible){
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("http://www.yangruixin.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            SexRatioInterface sexRatio = retrofit.create(SexRatioInterface.class);
            sexRatio.savedMessage("excellentTech")
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

                        }

                        @Override
                        public void onNext(SexRatio sexRatio) {

                        }
                    });
        }
    }
}
