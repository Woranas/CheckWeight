package kakina.woranas.myweigh;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registerMain2Activity extends AppCompatActivity {

    //Explinct
    private EditText userEditText, passEditText, nameEditText;
    private String userString, passString, nameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_main2);

    // Bind Widget
        bindWidget();



    }//Main Menhod

    private void bindWidget() {
        userEditText = (EditText) findViewById(R.id.editText2);
        passEditText = (EditText) findViewById(R.id.editText3);
        nameEditText = (EditText) findViewById(R.id.editText4);
    }

    public void clickRegit(View view) {
        userString = userEditText.getText().toString().trim();
        passString = passEditText.getText().toString().trim();
        nameString = nameEditText.getText().toString().trim();
        if (userString.equals("")|| passString.equals("") || nameString.equals("")) {
            //Have Space
            Toast.makeText(registerMain2Activity.this,getResources().getString(R.string.have_space),
                    Toast.LENGTH_LONG).show();
        } else {
            //no space
            MyManage objMyManage = new MyManage(this);
            objMyManage.addUserTable(userString, passString, nameString);
            Toast.makeText(registerMain2Activity.this,getResources().getString(R.string.Success_regis),Toast.LENGTH_SHORT).show();
            finish();

        }

    }
}
