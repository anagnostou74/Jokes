package gr.mobap.androidlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidMainActivity extends AppCompatActivity {
    public static String JOKE_EXTRA = "joke_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_main);

        String aJoke = getIntent().getStringExtra(JOKE_EXTRA);
        TextView textView = findViewById(R.id.textView);
        textView.setText(aJoke);
    }
}
