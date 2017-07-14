package com.tourismcoachbd.kuakatatravelguide;

import java.util.ArrayList;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

	public static final String DB_NAME = "Information";
	public static final int VERSION = 1;

	public static final String TABLE_NAME = "Tourism";
	public static final String ID_FIELD = "_ID";
	public static final String VISITED_FIELD = "visited";
	public static final String COST_FIELD = "cost";
	public static final String COMMENT_FIELD = "comment";
	public static final String TABLE_SQL = "CREATE TABLE " + TABLE_NAME + " ("
			+ ID_FIELD + " INTEGER PRIMARY KEY AUTOINCREMENT, " + VISITED_FIELD
			+ " TEXT, " + COST_FIELD + " TEXT, " + COMMENT_FIELD + " TEXT)";

	public DBHelper(Context context) {
		super(context, DB_NAME, null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(TABLE_SQL);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
	}

	public long insertPerson(Person person) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(VISITED_FIELD, person.getVisited());
		values.put(COST_FIELD, person.getCost());
		values.put(COMMENT_FIELD, person.getComment());
		long inserted = db.insert(TABLE_NAME, "", values);
		db.close();
		return inserted;
	}

	public ArrayList<Person> getAllPerson() {
		SQLiteDatabase db = this.getReadableDatabase();
		ArrayList<Person> all = new ArrayList<Person>();
		Cursor cursor = db
				.query(TABLE_NAME, null, null, null, null, null, null);
		if (cursor != null) {
			if (cursor.getCount() > 0) {
				cursor.moveToFirst();
				do {
					int id = cursor.getInt(cursor.getColumnIndex(ID_FIELD));
					String visited = cursor.getString(cursor
							.getColumnIndex(VISITED_FIELD));
					String cost = cursor.getString(cursor
							.getColumnIndex(COST_FIELD));
					String comment = cursor.getString(cursor
							.getColumnIndex(COMMENT_FIELD));
					Person p = new Person(id, visited, cost, comment);
					all.add(p);
				} while (cursor.moveToNext());
			}

		}

		cursor.close();
		db.close();

		return all;
	}

	public int updatePerson(Person person, int id) {
		SQLiteDatabase db = this.getWritableDatabase();
		ContentValues values = new ContentValues();
		values.put(VISITED_FIELD, person.getVisited());
		values.put(COST_FIELD, person.getCost());
		values.put(COMMENT_FIELD, person.getComment());

		int updated = db.update(TABLE_NAME, values, ID_FIELD + "=?",
				new String[] { "" + id });
		db.close();
		return updated;
	}

	public int deletePerson(int id) {
		SQLiteDatabase db = this.getWritableDatabase();
		int deleted = db.delete(TABLE_NAME, ID_FIELD + "=?", new String[] { ""
				+ id });
		db.close();
		return deleted;
	}

	public ArrayList<Person> search(String keyword) {
		SQLiteDatabase db = this.getReadableDatabase();
		ArrayList<Person> all = new ArrayList<Person>();
		Cursor cursor = db.query(TABLE_NAME, null, VISITED_FIELD + "=? OR "
				+ COST_FIELD + "=? OR " + COMMENT_FIELD + "=?", new String[] {
				keyword, keyword, keyword }, null, null, null);
		if (cursor != null) {
			if (cursor.getCount() > 0) {
				cursor.moveToFirst();
				do {
					int id = cursor.getInt(cursor.getColumnIndex(ID_FIELD));
					String visited = cursor.getString(cursor
							.getColumnIndex(VISITED_FIELD));
					String cost = cursor.getString(cursor
							.getColumnIndex(COST_FIELD));
					String comment = cursor.getString(cursor
							.getColumnIndex(COMMENT_FIELD));
					Person p = new Person(id, visited, cost, comment);
					all.add(p);
				} while (cursor.moveToNext());
			}

		}

		cursor.close();
		db.close();

		return all;
	}

}

