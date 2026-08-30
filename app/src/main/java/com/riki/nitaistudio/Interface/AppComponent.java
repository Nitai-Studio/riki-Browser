package com.riki.nitaistudio.Interface;

import com.riki.nitaistudio.activities.MainActivity;
import com.riki.nitaistudio.adapter.SuggestionsAdapter;
import com.riki.nitaistudio.app.AppModule;
import com.riki.nitaistudio.app.BrowserApp;
import com.riki.nitaistudio.app.BrowserPresenter;
import com.riki.nitaistudio.downloads.DownloadStart;
import com.riki.nitaistudio.fragment.TabsFragment;
import com.riki.nitaistudio.manager.TabsManager;
import com.riki.nitaistudio.utils.AdBlock;
import com.riki.nitaistudio.view.BrowserView;
import com.riki.nitaistudio.view.webClient.WebClient;

import dagger.Component;
import javax.inject.Singleton;

@Component(modules = {AppModule.class})
@Singleton

public interface AppComponent {
    void inject(MainActivity mainActivity);

    void inject(SuggestionsAdapter suggestionsAdapter);

    void inject(BrowserApp browserApp);

    void inject(BrowserPresenter browserPresenter);

    void inject(DownloadStart downloadStart);

    void inject(TabsFragment tabsFragment);

    void inject(TabsManager tabsManager);

    void inject(AdBlock adBlock);

    void inject(BrowserView browserView);

    void inject(WebClient webClient);
}
