package kakina.woranas.myweigh;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ooo on 10/02/2016.
 */
public class MyManage {

    //Explicit
    private MyOpen objMyOpenHelper;
    private SQLiteDatabase writeSqliteDatabase, readSqlLiteDatabase;

    public static final String table_user = "userTABLE";
    public static final String table_weight = "weightTABlE";
    public static final String column_id = "_id";
    public static final String column_user = "User";
    public static final String column_password = "Password";
    public static final String column_name = "Name";
    public static final String coulmn_date = "Date";
    public static final String column_weight = "Weight";


    public MyManage(Context context) {

        //Create & Connected
        objMyOpenHelper = new MyOpen(context);
        writeSqliteDatabase = objMyOpenHelper.getWritableDatabase();
        readSqlLiteDatabase = objMyOpenHelper.getReadableDatabase();


    } //Constructor

    // Add New Value to userTABLE
    public long addUserTable(String strUser, String strPassword, String strName) {

        ContentValues objContentValues = new ContentValues();
        objContentValues.put(column_id, strUser);
        objContentValues.put(column_password, strPassword);
        objContentValues.put(column_name, strName);




        return 0;
    }


}  // Main Class