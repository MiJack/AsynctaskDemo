package cn.mijack.asynctaskdemo;

import android.os.AsyncTask;

/**
 * @author Mi&Jack
 * @since 2018/7/25
 */
public class Task12 extends AsyncTask<Integer, Void, String> {

    public void doSomeThing() {
        com.mijack.Xlog.logMethodEnter("void cn.mijack.asynctaskdemo.Task12.doSomeThing()",this);try{try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }com.mijack.Xlog.logMethodExit("void cn.mijack.asynctaskdemo.Task12.doSomeThing()",this);}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("void cn.mijack.asynctaskdemo.Task12.doSomeThing()",this,throwable);throw throwable;}
    }


    @Override
    protected String doInBackground(Integer... integers) {
        com.mijack.Xlog.logMethodEnter("java.lang.String cn.mijack.asynctaskdemo.Task12.doInBackground([java.lang.Integer)",this,integers);try{StringBuffer sb = new StringBuffer();
        for (int i = 0; i < integers[0]; i++) {
            doSomeThing();
            sb.append(i);
        }
        {com.mijack.Xlog.logMethodExit("java.lang.String cn.mijack.asynctaskdemo.Task12.doInBackground([java.lang.Integer)",this);return sb.toString();}}catch(Throwable throwable){com.mijack.Xlog.logMethodExitWithThrowable("java.lang.String cn.mijack.asynctaskdemo.Task12.doInBackground([java.lang.Integer)",this,throwable);throw throwable;}
    }
}
