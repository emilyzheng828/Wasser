package io.github.emilyzheng828.wasser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imgCoo = (ImageView)findViewById(R.id.imgCoo);
        imgCoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (toast != null) {
                    toast.cancel();
                }
                toast = Toast.makeText(MainActivity.this, "Thirsty!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
}
