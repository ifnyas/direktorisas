package id.servkit.direktori;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
    }

    public void toMapsActivity(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
}
