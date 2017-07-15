package mistus.cr_income_and_expenditure_app;

import android.app.DialogFragment;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by msi-1 on 2017/4/13.
 */

public class menuAddFragmentDialog extends DialogFragment implements View.OnClickListener {
    Button okButton ;
    Button cancelButton ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_add_income_and_expenditure, container, false);
        getDialog().getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        this.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.AppTheme);

        okButton = (Button)view.findViewById(R.id.OK);
        cancelButton = (Button)view.findViewById(R.id.Cancel);

        okButton.setOnClickListener(this);
        cancelButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view){

        switch (view.getId()){

            case R.id.OK:
                //Do Ok Function

                dismiss();
                break;

            case R.id.Cancel:
                dismiss();
                break;

            default:
                return;

        }
    }

}
