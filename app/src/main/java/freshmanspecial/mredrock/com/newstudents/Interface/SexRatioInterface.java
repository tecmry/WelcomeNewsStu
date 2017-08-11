package freshmanspecial.mredrock.com.newstudents.Interface;


import freshmanspecial.mredrock.com.newstudents.Bean.SexRatio;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Tecmry on 2017/8/7.
 */

public interface SexRatioInterface
{
    @FormUrlEncoded
    @Headers({"Content-type:application/x-www-form-urlencoded"})
    @POST("test/apiRatio.php")
    Observable<SexRatio> savedMessage(@Field("RequestType") String RequestType);
}
