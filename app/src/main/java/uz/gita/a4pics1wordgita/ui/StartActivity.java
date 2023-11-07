package uz.gita.a4pics1wordgita.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.cardview.widget.CardView;
import uz.gita.a4pics1wordgita.R;
import uz.gita.a4pics1wordgita.cache.GameManager1;
import uz.gita.a4pics1wordgita.models.LevelData;

public class StartActivity extends AppCompatActivity {
    LevelData levelData = new LevelData();/*
    private MainDataBase dataBase=new MainDataBase(this);*/
    private CardView level1Card, level2Card, level3Card, level4Card;
    private GameManager1 manager1;
    private ImageView buttonAbout;
    private Intent intent;

    private LinearLayout level1, level2, level3, level4;
    private int levelDataCache = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        loadViews();
        loadListeners();
        //practice();
        Window window = this.getWindow();
        buttonAbout=findViewById(R.id.btnAbout);
        buttonAbout.setOnClickListener(view->{
            intent = new Intent(StartActivity.this, AboutActivity.class);
            StartActivity.this.startActivity(intent);
        });
        window.setStatusBarColor(this.getResources().getColor(R.color.startBack));
        window.setNavigationBarColor(this.getResources().getColor(R.color.startBack));
    }

    public void loadListeners() {
        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StartActivity.this, GameActivity1.class);
                startActivity(intent);
                finish();
            }
        });
//        if (MemoryHelper2.getHelper().getLastMainLevel12()) {
//            level2.setBackgroundResource(R.color.enable_level);
//            level2.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(StartActivity.this, GameActivity2.class);
//                    startActivity(intent);
//                    finish();
//                }
//            });
//        }
//        if (MemoryHelper3.getHelper().getLastMainLevel3()) {
//            level3.setBackgroundResource(R.color.enable_level);
//            level3.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(StartActivity.this, GameActivity3.class);
//                    startActivity(intent);
//                    finish();
//                }
//            });
//        }
//        if (MemoryHelper4.getHelper().getLastMainLevel4()) {
//            level4.setBackgroundResource(R.color.enable_level);
//            level4.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent = new Intent(StartActivity.this, GameActivity4.class);
//                    startActivity(intent);
//                    finish();
//                }
//            });
//        }

    }

    public void loadViews() {
        level1Card = findViewById(R.id.level1_card);


        level1 = findViewById(R.id.start_level1);

    }

}