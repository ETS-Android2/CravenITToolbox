package net.androidbootcamp.cravenittoolbox;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button asset = (Button)findViewById(R.id.secondActivity);
        Button directory = (Button)findViewById(R.id.directory);



        asset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent1 = new Intent(MainActivity.this, Second.class);

                startActivity(intent1);

            }
        });
        directory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent2 = new Intent(getApplicationContext(), Third.class);

                    startActivity(intent2);
                }


        });









    }

    public void toScan(View v) {

        Intent scanIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mediawiki.cravencc.edu/index.php/Scan_to_Desktop_Guide"));

        startActivity(scanIntent);

    }
    public void toSetup(View v) {

        Intent scanIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mediawiki.cravencc.edu/index.php/(AS)_New_Account_Setup_Guide"));

        startActivity(scanIntent);

    }
    public void toWiki(View v) {

        Intent scanIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mediawiki.cravencc.edu/index.php/Main_Page"));

        startActivity(scanIntent);

    }

    public void toHelpDesk(View v) {

        Intent scanIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://helpdesk.cravencc.edu"));

        startActivity(scanIntent);

    }





}
