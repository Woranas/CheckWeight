package kakina.woranas.myweigh;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ooo on 27/01/2016.
 */
public class WeightTABLE {
    //Explicit
    private MyOpen objMyOpenHelper;
    private SQLiteDatabase writeSQLite, readSQLite;
    public static final String TABLE_WEIGHT = "weightTABLE";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_DATE = "Date";
    public static final String COLUMN_WEIGHT = "Weight";


    public WeightTABLE(Context context) {

        objMyOpenHelper = new MyOpen(context);
        writeSQLite = objMyOpenHelper.getWritableDatabase();
        readSQLite = objMyOpenHelper.getReadableDatabase();

    }//Constructor

    //add new value to SQLite
    public long addNewValueToSQLite(String strDate, double douWeight) {
        ContentValues objContentValue = new ContentValues();
        objContentValue.put(COLUMN_DATE, strDate);
        objContentValue.put(COLUMN_WEIGHT, douWeight);


        return writeSQLite.insert(TABLE_WEIGHT, null, objContentValue);
    }   //addNewValueSQLite

} //main Class
