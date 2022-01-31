package premex.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import com.example.premex.Model.Experts;
import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteAssetHelper {

    private static final String DB_NAME="db_experts.db";
    private static final int DB_VER=1;

    public Database(Context context) {
        super(context, DB_NAME, null, DB_VER);
    }

    //Function get all db_experts
    public List<Experts> getExperts()
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlSelect={"Id","NameExpert","Position","ActiveStatus","PTj","Department","Unit","Ummail","OtherEmail"};
        String tableName="expertsUM";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect, null,null,null,null,null);
        List<Experts> result = new ArrayList<>();
        if (cursor.moveToFirst())
        {
            do{
                Experts experts = new Experts();
                experts.setId(cursor.getInt(cursor.getColumnIndex ("Id")));
                experts.setNameExpert (cursor.getString(cursor.getColumnIndex ("NameExpert")));
                experts.setPosition (cursor.getString(cursor.getColumnIndex ("Position")));
                experts.setActiveStatus (cursor.getString(cursor.getColumnIndex ("ActiveStatus")));
                experts.setPTj(cursor.getString(cursor.getColumnIndex ("PTj")));
                experts.setDepartment (cursor.getString(cursor.getColumnIndex ("Department")));
                experts.setUnit (cursor.getString(cursor.getColumnIndex ("Unit")));
                experts.setUmmail (cursor.getString(cursor.getColumnIndex ("Ummail")));
                experts.setOtherEmail (cursor.getString(cursor.getColumnIndex ("OtherEmail")));

                result.add(experts);
            }while (cursor.moveToNext());

        }
        return result;

    }

    //Function get all db_experts Name
    public List<String> getNames()
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlSelect={"NameExpert"};
        String tableName="expertsUM";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect, null,null,null,null,null);
        List<String> result = new ArrayList<>();
        if (cursor.moveToFirst())
        {
            do{
                result.add(cursor.getString(cursor.getColumnIndex("NameExpert")));
            }while (cursor.moveToNext());

        }
        return result;

    }

    //Function get db_experts by Name
    public List<Experts> getExpertsbyName(String name)
    {
        SQLiteDatabase db = getReadableDatabase();
        SQLiteQueryBuilder qb = new SQLiteQueryBuilder();

        String [] sqlSelect={"Id","NameExpert","Position","ActiveStatus","PTj","Department","Unit","Ummail","OtherEmail"};
        String tableName="expertsUM";

        qb.setTables(tableName);
        Cursor cursor = qb.query(db,sqlSelect, "Name LIKE ?",new String[]{"%"+name+"%"},null,null,null);
        List<Experts> result = new ArrayList<>();
        if (cursor.moveToFirst())
        {
            do{
                Experts experts = new Experts();
                experts.setId(cursor.getInt(cursor.getColumnIndex ("Id")));
                experts.setNameExpert (cursor.getString(cursor.getColumnIndex ("NameExpert")));
                experts.setPosition (cursor.getString(cursor.getColumnIndex ("Position")));
                experts.setActiveStatus (cursor.getString(cursor.getColumnIndex ("ActiveStatus")));
                experts.setPTj(cursor.getString(cursor.getColumnIndex ("PTj")));
                experts.setDepartment (cursor.getString(cursor.getColumnIndex ("Department")));
                experts.setUnit (cursor.getString(cursor.getColumnIndex ("Unit")));
                experts.setUmmail (cursor.getString(cursor.getColumnIndex ("Ummail")));
                experts.setOtherEmail (cursor.getString(cursor.getColumnIndex ("OtherEmail")));

                result.add(experts);
            }while (cursor.moveToNext());

        }
        return result;

    }

}
