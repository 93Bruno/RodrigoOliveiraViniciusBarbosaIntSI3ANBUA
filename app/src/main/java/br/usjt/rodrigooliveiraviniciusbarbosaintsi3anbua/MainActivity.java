package br.usjt.rodrigooliveiraviniciusbarbosaintsi3anbua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "br.usjt.rodrigooliveiraviniciusbarbosaintsi3anbua.MESSAGE";
    public final static String EXTRA_INTERESSE_1 = "br.usjt.rodrigooliveiraviniciusbarbosaintsi3anbua.MESSAGE";
    public final static String EXTRA_INTERESSE_2 = "br.usjt.rodrigooliveiraviniciusbarbosaintsi3anbua.MESSAGE";

    public Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lista de itens de interesse
        spinner = (Spinner) findViewById(R.id.interesse_array);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.interesse_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText_nome);
        String message = "Bem vindo(a), " + editText.getText().toString() + "!";
        //Carrega no Bundle para enviar mais de uma Extra
        Bundle extras = new Bundle();
        extras.putString("EXTRA_MESSAGE", message);

        // Envia tipo Interesse
        spinner = (Spinner) findViewById(R.id.interesse_array);
        String vInteresse = spinner.getSelectedItem().toString();

        if (vInteresse.equals("Técnico")) {
            extras.putString("EXTRA_INTERESSE_1", "Concrete Mathematics");
            extras.putString("EXTRA_INTERESSE_2", "The C++ Programming Language");
            intent.putExtras(extras);
        } else {
            extras.putString("EXTRA_INTERESSE_1", "Rozinho dog");
            extras.putString("EXTRA_INTERESSE_2", "Vinão TOP");
            intent.putExtras(extras);
        }
        startActivity(intent);
    }


}
