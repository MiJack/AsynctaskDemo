package cn.mijack.asynctaskdemo;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        com.mijack.Xlog.logMethodEnter("void cn.mijack.asynctaskdemo.MainActivity.onCreate(android.os.Bundle)",this,savedInstanceState);try{super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Task12().execute(10);
        new Task1().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        new Task1().execute();com.mijack.Xlog.logMethodExit("void cn.mijack.asynctaskdemo.MainActivity.onCreate(android.os.Bundle)",this);}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("void cn.mijack.asynctaskdemo.MainActivity.onCreate(android.os.Bundle)",this,throwable);throw throwable;}
    }
}
