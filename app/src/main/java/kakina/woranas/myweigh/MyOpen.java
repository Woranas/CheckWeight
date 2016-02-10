package kakina.woranas.myweigh;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.SQLClientInfoException;

/**
 * Created by ooo on 27/01/2016.
 */
public class MyOpen extends SQLiteOpenHelper{
    //ExpIfcit
    private static final String DATABASE_NAME = "my_weight.db";
    private static final int DATABASS_VERSION = 1;
    private static final String CREATE_TABLE = "create table weightTABLE(_id integer primary key, " + " Date text, Weight double); ";
    private static final String create_table_user = "create table weightTABLE(_id integer primary key, " + "User text, " + "Password text, " + "Name text,);";
    public MyOpen(Context context) {
        super(context, DATABASE_NAME, null, DATABASS_VERSION);

    } // Constructor


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    } //onCreate


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    } //onUpgrade
} // main class
