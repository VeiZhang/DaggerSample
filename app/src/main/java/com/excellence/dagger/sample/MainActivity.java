package com.excellence.dagger.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Wukong wukong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.tv);

        XiYouComponent component = DaggerXiYouComponent.builder().xiYouProvidesModule(new XiYouProvidesModule()).build();
        component.inject(this);
        component.inject(wukong);

        textView.setText(wukong.useJinGuBang());
    }
}