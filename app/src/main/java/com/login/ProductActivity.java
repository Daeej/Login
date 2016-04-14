package com.login;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ProductActivity extends Activity {
  EditText name;
    EditText email;
    Spinner producttype;
    EditText des;
    EditText price;
    EditText contact;
    String NAME, EMAIL, PRODUCTTYPE, DES, PRICE, CONTACT;
    Button save;
    Context ctx = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        name = (EditText) findViewById(R.id.EditTextName);
        email = (EditText) findViewById(R.id.EditTextEmail);
        producttype = (Spinner) findViewById(R.id.SpinnerFeedbackType);
        des = (EditText) findViewById(R.id.EditTextFeedbackBody);
        price = (EditText) findViewById(R.id.EditPrice);
        contact = (EditText) findViewById(R.id.EditContact);
        save = (Button)findViewById(R.id.ButtonSendFeedback);
        save.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                NAME = name.getText().toString();
                EMAIL = email.getText().toString();
                PRODUCTTYPE = producttype.getSelectedItem().toString();
                DES = des.getText().toString();
                PRICE = price.getText().toString();
                CONTACT = contact.getText().toString();

                DatabaseProduct DB = new DatabaseProduct(ctx);
                DB.insertInformation(DB, NAME, EMAIL, PRODUCTTYPE, DES, PRICE, CONTACT);
                Toast.makeText(getBaseContext(), " Your Product has been added!", Toast.LENGTH_LONG).show();
                finish();
            }

        });
}
}

