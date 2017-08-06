package freshmanspecial.mredrock.com.newstudents.net;

import freshmanspecial.mredrock.com.newstudents.Bean.QQGroup;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;



public interface Post {
        @POST("test/apiRatio.php")
        @FormUrlEncoded
        Observable<QQGroup> getData(@Field("RequestType")String RequestType);
}
