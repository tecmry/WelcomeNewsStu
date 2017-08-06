package freshmanspecial.mredrock.com.newstudents.net;


import android.widget.Toast;

import freshmanspecial.mredrock.com.newstudents.Bean.QQGroup;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class HttpService {
    public static void QQGroup(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                Retrofit retrofit = new Retrofit.Builder()
                        .baseUrl("http://www.yangruixin.com/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                        .build();

                Post myHttp = retrofit.create(Post.class);
                myHttp.getData("QQGroup")
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new Subscriber<QQGroup>() {
                            @Override
                            public void onCompleted() {
                            }

                            @Override
                            public void onError(Throwable e) {

                            }

                            @Override
                            public void onNext(QQGroup QQGroup) {
                                System.out.println("数据位："+ QQGroup.getData().get(1).getNumberX());
                            }
                        });
            }
        }).start();
    }
}
