package id.servkit.direktori;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class MapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_maps);
    }

    public void toMainActivity(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toMapsActivity(View view) {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void toDialogServices(View view) {
        final AlertDialog dialogBuilder = new AlertDialog.Builder(this).create();
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialog_services, null);
        Button cancel = dialogView.findViewById(R.id.buttonCancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogBuilder.dismiss();
            }
        });
        dialogBuilder.setView(dialogView);
        dialogBuilder.show();
    }
}
