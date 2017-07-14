package com.tourismcoachbd.kuakatatravelguide;
import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class User_info extends Activity implements OnClickListener {

	private EditText etVisited, etCost, etComment;
	private Button btnAdd, btnShow, btnNext, btnPrev, btnUpdate, btnDelete;
	private TextView txtView;
	private ArrayList<Person> allPerson;
	private int currentIndex = 0;

	private DBHelper dbHelper;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_inf);

		dbHelper = new DBHelper(this);
		etVisited = (EditText) findViewById(R.id.etVisited);
		etCost = (EditText) findViewById(R.id.etCost);
		etComment = (EditText) findViewById(R.id.etComment);

		btnAdd = (Button) findViewById(R.id.btnAdd);
		btnShow = (Button) findViewById(R.id.btnShow);
		btnNext = (Button) findViewById(R.id.btnNext);
		btnPrev = (Button) findViewById(R.id.btnPrev);
		btnUpdate = (Button) findViewById(R.id.btnUpdate);
		btnDelete = (Button) findViewById(R.id.btnDelete);
		
		btnAdd.setOnClickListener(this);
		btnShow.setOnClickListener(this);
		btnNext.setOnClickListener(this);
		btnPrev.setOnClickListener(this);
		btnUpdate.setOnClickListener(this);
		btnDelete.setOnClickListener(this);


		txtView = (TextView) findViewById(R.id.txtViewInfo);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnAdd:
			addContact();
			break;
		case R.id.btnShow:
			viewContacts();
			break;
		case R.id.btnNext:
			moveNext();
			break;
		case R.id.btnPrev:
			movePrevious();
			break;
		case R.id.btnUpdate:
			updateContact();
			break;
		case R.id.btnDelete:
			deleteContact();
			break;
		default:
			break;
		}

	}
	
	private void addContact() {
		String visited = etVisited.getText().toString();
		String cost = etCost.getText().toString();
		String comment = etComment.getText().toString();
		
		
		if (("".equals(etVisited.getText().toString().trim()) || "".equals(etCost.getText().toString().trim()) || "".equals(etComment.getText().toString().trim())))
		{
	        Toast.makeText(this, "Input field(s) is empty!", Toast.LENGTH_LONG).show();
	    }
		
		else{
			
			Person person = new Person(visited, cost, comment);
			long inserted = dbHelper.insertPerson(person);
			if (inserted == -1) {
			Toast.makeText(getApplicationContext(), "Insert operation failed!",
					Toast.LENGTH_LONG).show();
		}
		
		else{
			Toast.makeText(getApplicationContext(), "Data inserted successfully.",
					Toast.LENGTH_LONG).show();
			        viewContacts();
			        etVisited.setText("");
			        etComment.setText("");
			        etCost.setText("");
		}
		}
	}

	private void viewContacts() {
		allPerson = dbHelper.getAllPerson();
		if (allPerson == null || allPerson.size() == 0) {
			txtView.setText("No recod(s) found!");
			Toast.makeText(getApplicationContext(), "No record(s) found!",
						Toast.LENGTH_LONG).show();
		}
		else {
			txtView.setText(allPerson.size() + " record(s) found");
			for (Person p : allPerson) {
				txtView.append("\n" + p.toString());
			}

			Person currentPerson = allPerson.get(currentIndex);
			etVisited.setText(currentPerson.getVisited());
			etCost.setText(currentPerson.getCost());
			etComment.setText(currentPerson.getComment());
		}
	}

	private void moveNext() {
		
		if (allPerson == null || allPerson.size() == 0) {
			Toast.makeText(getApplicationContext(), "No recod(s) found!",
					Toast.LENGTH_LONG).show();
			}
		
	else { if (allPerson != null) {
			if (currentIndex < (allPerson.size() - 1)) {
				currentIndex++;
				Person currentPerson = allPerson.get(currentIndex);
				etVisited.setText(currentPerson.getVisited());
				etCost.setText(currentPerson.getCost());
				etComment.setText(currentPerson.getComment());
			}
		}
	}
	}

	public void movePrevious() {
		
		if (allPerson == null || allPerson.size() == 0) {
			Toast.makeText(getApplicationContext(), "No recod(s) found!",
					Toast.LENGTH_LONG).show();
			}
		else{
			
		if (allPerson != null) {
			if (currentIndex > 0) {
				currentIndex--;
				Person currentPerson = allPerson.get(currentIndex);
				etVisited.setText(currentPerson.getVisited());
				etCost.setText(currentPerson.getCost());
				etComment.setText(currentPerson.getComment());
			}
		}
		 }
		}
		
	private void updateContact() {
		
		allPerson = dbHelper.getAllPerson();
		if (allPerson == null || allPerson.size() == 0) {
			Toast.makeText(getApplicationContext(), "No recod(s) found!",
					Toast.LENGTH_LONG).show();
			}
		
		else{
			
			if (("".equals(etVisited.getText().toString().trim()) || "".equals(etCost.getText().toString().trim()) || "".equals(etComment.getText().toString().trim())))
			{
		        Toast.makeText(this, "Input field(s) is empty!", Toast.LENGTH_LONG).show();
		    }
			
			else{
		int currentId = allPerson.get(currentIndex).getId();

		String updatedVisited = etVisited.getText().toString();
		String updatedCost = etCost.getText().toString();
		String updatedComment = etComment.getText().toString();
		Person updatedPerson = new Person(updatedVisited, updatedCost,
				updatedComment);
		int updated = dbHelper.updatePerson(updatedPerson, currentId);
		
		if (updated > 0) {
			Toast.makeText(getApplicationContext(), "Data updated successfully",
					Toast.LENGTH_LONG).show();
			viewContacts();
		} else {
			Toast.makeText(getApplicationContext(), "Update operation failed!",
					Toast.LENGTH_LONG).show();
		}
		}
		}
		allPerson = dbHelper.getAllPerson();
	}

	private void deleteContact() {
		
		allPerson = dbHelper.getAllPerson();
		if (allPerson == null || allPerson.size() == 0) {
			Toast.makeText(getApplicationContext(), "No recod(s) found!",
					Toast.LENGTH_LONG).show();
			}
		
		else{
		
		int currentId = allPerson.get(currentIndex).getId();
		int deleted = dbHelper.deletePerson(currentId);
		
		allPerson = dbHelper.getAllPerson();
			
		if (deleted > 0) {
			Toast.makeText(getApplicationContext(), "Data deleted successfully",
					Toast.LENGTH_LONG).show();
			allPerson = dbHelper.getAllPerson();
			
			if (allPerson == null || allPerson.size() == 0) {
				txtView.setText("No recod(s) found!");
				}
			else {
				txtView.setText(allPerson.size() + " record(s) found");
				for (Person p : allPerson) {
					txtView.append("\n" + p.toString());
				}

		        Person currentPerson = allPerson.get(currentIndex);
				etVisited.setText(currentPerson.getVisited());
				etCost.setText(currentPerson.getCost());
				etComment.setText(currentPerson.getComment());
			}
		} 
		else{
			Toast.makeText(getApplicationContext(), "Delete operation failed!",
					Toast.LENGTH_LONG).show();
			}
		}
		
		allPerson = dbHelper.getAllPerson();
		if (allPerson == null) {
			etVisited.setText("");
			etCost.setText("");
			etComment.setText("");
		} else {
			if (currentIndex < (allPerson.size() - 1)) {
				Person currentPerson = allPerson.get(currentIndex);
				etVisited.setText(currentPerson.getVisited());
				etCost.setText(currentPerson.getCost());
				etComment.setText(currentPerson.getComment());
			} else {
				etVisited.setText("");
				etCost.setText("");
				etComment.setText("");
			}
		}
	}
}
