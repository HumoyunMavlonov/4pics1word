package uz.gita.a4pics1wordgita.app;

import android.app.Application;

import androidx.appcompat.app.AppCompatDelegate;

import uz.gita.a4pics1wordgita.cache.LevelCache1;
import uz.gita.a4pics1wordgita.cache.MaxScoreCache;
import uz.gita.a4pics1wordgita.cache.ScoreCache1;
import uz.gita.a4pics1wordgita.main.HelpButtonClicked;
import uz.gita.a4pics1wordgita.main.MemoryHelper2;


public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        LevelCache1.init(this);
        ScoreCache1.initScore(this);
        MaxScoreCache.initMaxScore(this);

        MemoryHelper2.init(this);
        HelpButtonClicked.init(this);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }
}
