package freshmanspecial.mredrock.com.newstudents.utils;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by king on 2017/8/3.
 */

public class MyApplication extends AppCompatActivity {
    private static Context context;

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        context=getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }
}
