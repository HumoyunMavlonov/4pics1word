package uz.gita.a4pics1wordgita.cache;

import android.content.Context;
import android.content.SharedPreferences;

public class CoinManager {
    private static final String PREF_NAME = "MyAppPrefs";
    private static final String COIN_KEY = "coin_key";
    private SharedPreferences sharedPreferences;

    private static CoinManager instance;

    private CoinManager(Context context) {
        sharedPreferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public static CoinManager getInstance(Context context) {
        if (instance == null) {
            instance = new CoinManager(context);
        }
        return instance;
    }

    public int getCoins() {
        return sharedPreferences.getInt(COIN_KEY, 0);
    }

    public void setCoins(int coins) {
        sharedPreferences.edit().putInt(COIN_KEY, coins).apply();
    }
}

