package com.login;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class ProductActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);


    }
}

/*
    public void sendFeedback(View button) {
        // Do click handling here
    }

    final EditText nameField = (EditText) findViewById(R.id.EditTextName);
    String name = nameField.getText().toString();

    final EditText emailField = (EditText) findViewById(R.id.EditTextEmail);
    String email = emailField.getText().toString();

    final EditText feedbackField = (EditText) findViewById(R.id.EditTextFeedbackBody);
    String feedback = feedbackField.getText().toString();

    final Spinner feedbackSpinner = (Spinner) findViewById(R.id.SpinnerFeedbackType);
    String feedbackType = feedbackSpinner.getSelectedItem().toString();

    final CheckBox responseCheckbox = (CheckBox) findViewById(R.id.CheckBoxResponse);
    boolean bRequiresResponse = responseCheckbox.isChecked();
}

*/


