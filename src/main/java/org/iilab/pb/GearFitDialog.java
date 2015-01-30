package org.iilab.pb;

import android.content.Context;

import com.samsung.android.sdk.cup.ScupDialog;
import com.samsung.android.sdk.cup.ScupLabel;


/**
 * Created by jshultz on 1/30/15.
 */
public class GearFitDialog extends ScupDialog {

    public GearFitDialog(Context context) {

        super(context);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void onCreate() {
        // TODO Auto-generated method stub
        super.onCreate();

        setBackEnabled(true);
        ScupLabel helloLabel = new ScupLabel(this);
        helloLabel.setText("Hello CUP");
        helloLabel.setAlignment(ScupLabel.ALIGN_CENTER);
        helloLabel.setWidth(ScupLabel.FILL_DIALOG);
        helloLabel.setHeight(ScupLabel.FILL_DIALOG);
        helloLabel.show();


        setBackPressedListener(new BackPressedListener() {
            @Override
            public void onBackPressed(ScupDialog arg0) {
                // TODO Auto-generated method stub
                finish();
            }
        });
    }
}
