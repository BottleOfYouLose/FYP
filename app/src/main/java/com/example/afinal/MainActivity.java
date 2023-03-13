package com.example.afinal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Initialize the code variable as an empty string
    private TextView codeTextView;
    private String code = "";

    private ImageView mClosedLockImageView;
    private ImageView mOpenLockImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        codeTextView = findViewById(R.id.codeTextView);

        mClosedLockImageView = findViewById(R.id.closed_lock_imageview);
        mOpenLockImageView = findViewById(R.id.open_lock_imageview);

        mOpenLockImageView.setVisibility(View.GONE);
        mClosedLockImageView.setVisibility(View.VISIBLE);

        // Find all the buttons and set their click listeners
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code += "1";
                codeTextView.setText(code);
            }
        });

        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code += "2";
                codeTextView.setText(code);
            }
        });

        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code += "3";
                codeTextView.setText(code);
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code += "4";
                codeTextView.setText(code);
            }
        });

        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code += "5";
                codeTextView.setText(code);
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code += "6";
                codeTextView.setText(code);
            }
        });

        Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code += "7";
                codeTextView.setText(code);
            }
        });

        Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code += "8";
                codeTextView.setText(code);
            }
        });

        Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code += "9";
                codeTextView.setText(code);
            }
        });

        // Find the TextView in your layout
        TextView textView = findViewById(R.id.codeTextView);

// Set up a click listener for your "backspace" button
        Button backspaceButton = findViewById(R.id.button10);
        backspaceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the current text in the TextView
                String currentText = textView.getText().toString();

                // Check if the current text is empty (i.e. there's nothing to erase)
                if (currentText.length() == 0) {
                    return;
                }

                // Remove the last character from the current text
                String newText = currentText.substring(0, currentText.length() - 1);

                // Set the TextView's text to the new text


                code=code.replaceAll(code,newText);
                textView.setText(code);
                // Set the cursor position to the end of the new text
                if (textView instanceof EditText) {
                    code = "";
                    ((EditText) textView).setSelection(newText.length());
                }
            }
        });

        Button buttonEnter = findViewById(R.id.buttonEnter);
        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Check if the code is correct
                if (code.equals("2895")) {
                    // Code is correct, do something here
                    mOpenLockImageView.setVisibility(View.VISIBLE);
                    mClosedLockImageView.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Code is correct!", Toast.LENGTH_SHORT).show();
                    codeTextView.setText("");
                } else {

                    // Code is incorrect, show a pop-up window
                    /*AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Incorrect code");
                    builder.setMessage("The 4 digit code is not correct. Please try again.");
                    builder.setPositiveButton("OK", null);
                    AlertDialog dialog = builder.create();
                    dialog.show();*/

                    mOpenLockImageView.setVisibility(View.VISIBLE);
                    mClosedLockImageView.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this, "Code is Incorrect!", Toast.LENGTH_SHORT).show();
                    codeTextView.setText("");
                    mOpenLockImageView.setVisibility(View.GONE);
                    mClosedLockImageView.setVisibility(View.VISIBLE);
                }
                // Reset the code variable
                code = "";
                codeTextView.setText("");
            }
        });
    }
}
