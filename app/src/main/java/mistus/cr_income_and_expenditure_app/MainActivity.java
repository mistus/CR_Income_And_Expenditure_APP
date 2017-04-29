package mistus.cr_income_and_expenditure_app;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
//public class MainActivity extends Activity {

    private RecordPageFragment RecordPageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        setDefaultFragment();

        //Admob
        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    private void setDefaultFragment(){
        RecordPageFragment = new RecordPageFragment();
        FragmentTransaction FragmentTransaction = getFragmentManager().beginTransaction();
        FragmentTransaction.replace(R.id.mainFrameLayout, RecordPageFragment);
        FragmentTransaction.commit();
    }

    //Action bar追加小圖示
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch(item.getItemId()){

            case R.id.addIcon:

                FragmentTransaction ft = getFragmentManager().beginTransaction();
                ft.addToBackStack(null);
                // Create and show the dialog.
                android.app.DialogFragment newFragment = new menuAddFragmentDialog();
                newFragment.show(ft, "dialog");


                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
