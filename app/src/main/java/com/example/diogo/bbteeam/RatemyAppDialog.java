package com.example.diogo.bbteeam;

import android.app.Dialog;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;

/**
 * Created by diogo on 05/12/2016.
 */

public class RatemyAppDialog extends Dialog {

    public RatemyAppDialog(Context context) {
        super(context);
    }

    //Definam static...
    public static void Initialize(final Context context){
        final RatemyAppDialog ratemyAppDialog  = new RatemyAppDialog(context);
        ratemyAppDialog.setContentView(R.layout.diaog_ratemyapp);

        final Button rate = (Button) ratemyAppDialog.findViewById(R.id.rateus);
        rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO FAZER CENAS QUE SAO PRECISAS
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.google.com"));
                context.startActivity(intent);
            }
        });
        Button dontrate = (Button) ratemyAppDialog.findViewById(R.id.dontrate);
        dontrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ratemyAppDialog.isShowing())
                    ratemyAppDialog.dismiss();
            }
        });
        ratemyAppDialog.show();

    }
}
