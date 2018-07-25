package cn.mijack.asynctaskdemo;

import android.os.AsyncTask;

/**
 * @author Mi&Jack
 * @since 2018/7/25
 */
public class Task12 extends AsyncTask<Integer, Void, String> {

    public void doSomeThing() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    protected String doInBackground(Integer... integers) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < integers[0]; i++) {
            doSomeThing();
            sb.append(i);
        }
        return sb.toString();
    }
}
