package net.androidbootcamp.cravenittoolbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        final EditText tag = (EditText) findViewById(R.id.tag);
        final EditText serialNumber = (EditText) findViewById(R.id.serialNumber);
        final EditText model = (EditText) findViewById(R.id.model);
        final Spinner building = (Spinner) findViewById(R.id.txtBuildings);
        final EditText room = (EditText) findViewById(R.id.room);

        Button email = (Button) findViewById(R.id.btnEmail);
        email.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent email = new Intent(Intent.ACTION_SEND);

                //Fill this with the data

                email.setType("plain/text");
                email.putExtra(Intent.EXTRA_EMAIL, new String[] {"helpdesk@cravencc.edu"});
                email.putExtra(Intent.EXTRA_SUBJECT, "Inventory Update By Mobile");
                email.putExtra(Intent.EXTRA_TEXT, "Tag Number:" + tag.getText().toString()+'\n'+"Serial Number:"+serialNumber.getText().toString()
                        +'\n'+"Model:"+model.getText().toString()+'\n'+"Building:"+building.getSelectedItem().toString()+'\n'+"Room:"+room.getText().toString()+'\n'+'\n'+"Sent from the Craven Assets Locator Application");



                startActivity(Intent.createChooser(email, "Send mail..."));
            }
        });
    }
}
