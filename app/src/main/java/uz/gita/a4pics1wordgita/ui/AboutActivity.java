package uz.gita.a4pics1wordgita.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


import uz.gita.a4pics1wordgita.R;

public class AboutActivity extends AppCompatActivity {

    private ImageView btnBack;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_notes);

        Window window = this.getWindow();

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        btnBack=findViewById(R.id.backToMain);
        window.setStatusBarColor(this.getResources().getColor(R.color.startBack));
        window.setNavigationBarColor(this.getResources().getColor(R.color.startBack));

        btnBack.setOnClickListener(view->{
            Intent intent = new Intent(AboutActivity.this,StartActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
