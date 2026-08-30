package com.riki.nitaistudio.utils.schedulerUtils;

import androidx.annotation.NonNull;
import com.riki.nitaistudio.Interface.Scheduler;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class WorkerScheduler implements Scheduler {
    private final Executor mWorker = Executors.newFixedThreadPool(4);

    @Override 
    public void execute(@NonNull Runnable runnable) {
        this.mWorker.execute(runnable);
    }
}
