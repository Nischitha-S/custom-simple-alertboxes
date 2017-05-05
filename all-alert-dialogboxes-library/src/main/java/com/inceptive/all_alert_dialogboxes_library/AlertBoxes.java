package com.inceptive.all_alert_dialogboxes_library;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AlertBoxes extends AppCompatActivity {

    public static Context context;
    public static String msg = "kjdhkfdkfjk";
    public static Button yesbtn;
    public static Button nobtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_boxes);
        alertDialogBoxWithOkButton(context,msg);
        alertDialogBoxWithOkAndNoButton(context,msg);
        customAlertDialogBoxWithYesAndNoBtn(context,msg);
    }


    public static void alertDialogBoxWithOkButton(Context context, String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(msg);
        builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                onOkBtnClicked();
                dialog.dismiss();
            }
        });
        builder.show();
    }

    public static void onOkBtnClicked() {
    }

    public static void alertDialogBoxWithOkAndNoButton(Context context, String msg) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setMessage(msg);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                onOkBtnClicked();
                dialog.dismiss();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                onNoBtnClicked();
                dialogInterface.dismiss();
            }
        });
        builder.show();
    }

    public static void customAlertDialogBoxWithYesAndNoBtn(Context context, String msg) {

        final Dialog dialog = new Dialog(context);
        dialog.setContentView(R.layout.alert_dialog_layout);


        TextView msgtxt = (TextView) dialog.findViewById(R.id.msgtxtid);
        yesbtn = (Button) dialog.findViewById(R.id.yesbtnid);
        nobtn = (Button) dialog.findViewById(R.id.nobtnid);


        msgtxt.setText(msg);
        yesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onYesBtnClicked();
                dialog.dismiss();
            }
        });

        nobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onNoBtnClicked();
                dialog.dismiss();
            }
        });

        dialog.show();
    }


    public static void onNoBtnClicked() {
    }

    public static void onYesBtnClicked() {
    }
}
