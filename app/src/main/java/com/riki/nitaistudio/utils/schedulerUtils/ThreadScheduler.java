package com.riki.nitaistudio.utils.schedulerUtils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.riki.nitaistudio.Interface.Scheduler;


public class ThreadScheduler implements Scheduler {
    @NonNull
    private final Handler mHandler;

    public ThreadScheduler(@NonNull Looper looper) {
        this.mHandler = new Handler(looper);
    }

    @Override 
    public synchronized void execute(@NonNull Runnable runnable) {
        this.mHandler.post(runnable);
    }
}
