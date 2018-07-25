package cn.mijack.asynctaskdemo;

import android.os.AsyncTask;

/**
 * @author Mi&Jack
 * @since 2018/7/25
 */
public class Task1 extends AsyncTask<String, String, String> {
    @Override
    protected String doInBackground(String... strings) {
doSomeThing();
        return "Hello world!";
    }

    public void doSomeThing() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
