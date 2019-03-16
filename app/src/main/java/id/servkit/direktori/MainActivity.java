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

//    public void toHutangDhLihatUbah(View view) {
//        final AlertDialog dialogBuilder = new AlertDialog.Builder(this).create();
//        LayoutInflater inflater = this.getLayoutInflater();
//        View dialogView = inflater.inflate(R.layout.dialog_tambahan_ubah, null);
//
//        Button button1 = dialogView.findViewById(R.id.buttonSubmit);
//        Button button2 = dialogView.findViewById(R.id.buttonCancel);
//
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                dialogBuilder.dismiss();
//            }
//        });
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // DO SOMETHINGS
//                dialogBuilder.dismiss();
//            }
//        });

}
