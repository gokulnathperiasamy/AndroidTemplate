package com.kpgn.androidtemplate.utility;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;

import com.kpgn.androidtemplate.R;
import com.kpgn.androidtemplate.constant.ApplicationConstant;

public class DialogUtil {

    public static void showAboutMessage(final Context context) {
        final AlertDialog alertDialog = new AlertDialog.Builder(context)
                .setPositiveButton(context.getResources().getString(R.string.app_name),     // Set button text
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                launchPlayStore(context);
                            }
                        }).create();
        alertDialog.setTitle(R.string.app_name);
        alertDialog.setMessage(context.getResources().getString(R.string.app_name));        // Set message
        alertDialog.show();
    }

    private static void launchPlayStore(Context context) {
        Uri uri = Uri.parse("market://details?id=" + ApplicationConstant.APP_ID);
        Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
        try {
            context.startActivity(goToMarket);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}