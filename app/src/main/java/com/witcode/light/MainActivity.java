
package com.witcode.light;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout llCoche = (LinearLayout) findViewById(R.id.ll_coche);
        llCoche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MaterialDialog.Builder  dialogBuilder = new MaterialDialog.Builder(MainActivity.this);
                dialogBuilder
                        .title("¿Quieres sincronizar ahora?")
                        .positiveText("Sincronizar")
                        .onPositive(new MaterialDialog.SingleButtonCallback() {
                            @Override
                            public void onClick(@NonNull MaterialDialog dialog, @NonNull DialogAction which) {

                            }
                        })
                        .negativeText("Cancelar")
                        .build().show();
            }
        });
    }

    int GetLights(double distance, String type){
        int res=0;



        return res;
    }
}
