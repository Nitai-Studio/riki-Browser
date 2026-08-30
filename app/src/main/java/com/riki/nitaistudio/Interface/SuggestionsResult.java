package com.riki.nitaistudio.Interface;

import androidx.annotation.NonNull;
import com.riki.nitaistudio.database.HistoryItem;

import java.util.List;


public interface SuggestionsResult {
    void resultReceived(@NonNull List<HistoryItem> list);
}
