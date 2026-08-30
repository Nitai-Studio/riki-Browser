package com.riki.nitaistudio.search;

import android.content.Context;
import androidx.annotation.NonNull;

import com.riki.nitaistudio.Interface.Action;
import com.riki.nitaistudio.Interface.Subscriber;
import com.riki.nitaistudio.Interface.SuggestionsResult;
import com.riki.nitaistudio.app.BrowserApp;
import com.riki.nitaistudio.database.HistoryItem;
import com.riki.nitaistudio.utils.Observable;

import java.util.List;

public class SuggestionsManager {
    private static volatile boolean sIsTaskExecuting;

    public enum Source {
        GOOGLE
    }

    public static boolean isRequestInProgress() {
        return sIsTaskExecuting;
    }

    public static Observable<List<HistoryItem>> getObservable(@NonNull final String str, @NonNull Context context, @NonNull final Source source) {
        final BrowserApp browserApp = BrowserApp.get(context);

        return Observable.create(new Action<List<HistoryItem>>() {
            @Override
            public void onSubscribe(@NonNull final Subscriber<List<HistoryItem>> subscriber) {
                sIsTaskExecuting = true;

                if (source == Source.GOOGLE) {
                    new GoogleSuggestionsTask(str, browserApp, new SuggestionsResult() {
                        @Override
                        public void resultReceived(@NonNull List<HistoryItem> list) {
                            subscriber.onNext(list);
                            subscriber.onComplete();
                        }
                    }).run();
                }

                sIsTaskExecuting = false;
            }
        });
    }
}