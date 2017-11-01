package br.usjt.rodrigooliveiraviniciusbarbosaintsi3anbua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        // Pegar o nome
        Bundle extras = intent.getExtras();
        String message = extras.getString("EXTRA_MESSAGE");
        TextView txtResultado = (TextView) findViewById(R.id.text_nomeSelecionado);
        txtResultado.setText(message);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);


        //interesse
        String interesse1 = extras.getString("EXTRA_INTERESSE_1");
        TextView textViewInteresse = (TextView) findViewById(R.id.editText_livro1);
        textViewInteresse.setText(interesse1);
        textView.setText(interesse1);

        String interesse2 = extras.getString("EXTRA_INTERESSE_2");
        TextView textViewInteresse2 = (TextView) findViewById(R.id.editText_livro2);
        textViewInteresse2.setText(interesse2);
        textView.setText(interesse2);


    }

}
