package cn.mijack.asynctaskdemo;

import android.os.AsyncTask;

/**
 * @author Mi&Jack
 * @since 2018/7/25
 */
public class Task1 extends AsyncTask<String, String, String> {
    @Override
    protected String doInBackground(String... strings) {
com.mijack.Xlog.logMethodEnter("java.lang.String cn.mijack.asynctaskdemo.Task1.doInBackground([java.lang.String)",this,strings);try{doSomeThing();
        {com.mijack.Xlog.logMethodExit("java.lang.String cn.mijack.asynctaskdemo.Task1.doInBackground([java.lang.String)",this);return "Hello world!";}}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("java.lang.String cn.mijack.asynctaskdemo.Task1.doInBackground([java.lang.String)",this,throwable);throw throwable;}
    }

    public void doSomeThing() {
        com.mijack.Xlog.logMethodEnter("void cn.mijack.asynctaskdemo.Task1.doSomeThing()",this);try{try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }com.mijack.Xlog.logMethodExit("void cn.mijack.asynctaskdemo.Task1.doSomeThing()",this);}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("void cn.mijack.asynctaskdemo.Task1.doSomeThing()",this,throwable);throw throwable;}
    }
}
