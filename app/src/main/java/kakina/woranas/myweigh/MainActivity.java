package kakina.woranas.myweigh;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.nsd.NsdManager;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    //Explicit
    private WeightTABLE objWeightTABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Connected Database
        connectedDatabase();
        //Test Update
        // testerUpdate();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    } // onCreate

    //check Regis
    MainActivity() {
    }

    ;
private void checkRegister() {
    SQLiteDatabase objSqLiteDatabase = openOrCreateDatabase(MyOpen.class.getName(), MODE_PRIVATE, null);
    Cursor objCursor = objSqLiteDatabase.rawQuery("SELECT * FROM userTABLE", null);
    if (objCursor.getCount() == 0) {
        Intent objIntent = new Intent(MainActivity.this, registerMain2Activity.class);
    }//if
}//check register


    public void clickUpdate(View view) {
        //Show Intent
        Intent objIntent = new Intent(MainActivity.this, FromRecordWeightActiyty.class);
        startActivity(objIntent);

    } //clickUpdate

    private void testerUpdate() {
        objWeightTABLE.addNewValueToSQLite("testDate", 123.45);
    }// testerUpdate

    private void connectedDatabase() {
        objWeightTABLE = new WeightTABLE(this);
    } //connectedDatabase

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
} // main class
