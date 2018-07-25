package cn.mijack.asynctaskdemo;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Task12().execute(10);
        new Task1().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR);
        new Task1().execute();
    }
}
