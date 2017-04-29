package mistus.cr_income_and_expenditure_app;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Handler handler = new Handler();
        handler.postDelayed(
                new Runnable (){
                    @Override
                    public void run() {
                        Intent intent = new Intent();
                        //intent.setClass(WelcomePageActivity.this,MainActivity.class);
                        intent.setClass(WelcomeActivity.this,MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
                ,2000);
    }
}
