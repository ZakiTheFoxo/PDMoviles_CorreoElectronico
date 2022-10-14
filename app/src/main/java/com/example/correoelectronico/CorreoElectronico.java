package com.example.correoelectronico;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CorreoElectronico extends AppCompatActivity{
    // Variables
    private TextView    txtRemitente, txtDestinatario, txtConCopia, txtAsunto, txtMensaje;

    private EditText    edtEmailRemitente, edtEmailDestinatario, edtEmailConCopia, edtPlainAsunto, edtMultiMensaje;

    private Button      btnEnviar, btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo_electronico);

        // Find on view by ID's
        // Texts
        txtRemitente    = findViewById(R.id.txtRemitente);
        txtDestinatario = findViewById(R.id.txtDestinatario);
        txtConCopia     = findViewById(R.id.txtConCopia);
        txtAsunto       = findViewById(R.id.txtAsunto);
        txtMensaje      = findViewById(R.id.txtMensaje);

        // TextFields
        edtEmailRemitente       = findViewById(R.id.edtEmailRemitente);
        edtEmailDestinatario    = findViewById(R.id.edtEmailDestinatario);
        edtEmailConCopia        = findViewById(R.id.edtEmailConCopia);
        edtPlainAsunto          = findViewById(R.id.edtPlainAsunto);
        edtMultiMensaje         = findViewById(R.id.edtMultiMensaje);

        // Buttons
        btnEnviar   = findViewById(R.id.btnEnviar);
        btnCancelar = findViewById(R.id.btnCancelar);

        // Add listener to buttons
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Se presiono el boton Enviar", Toast.LENGTH_SHORT).show();

                Intent intent   = new Intent();

                intent.setAction(Intent.ACTION_SEND);

                intent.putExtra(Intent.EXTRA_EMAIL, edtEmailRemitente.getText().toString());
                intent.putExtra(Intent.EXTRA_EMAIL, edtEmailDestinatario.getText().toString());
                intent.putExtra(Intent.EXTRA_CC, edtEmailConCopia.getText().toString());
                intent.putExtra(Intent.EXTRA_SUBJECT, edtPlainAsunto.getText().toString());
                intent.putExtra(Intent.EXTRA_TEXT, edtMultiMensaje.getText().toString());
            }
        });
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtEmailRemitente.setText("");
                edtEmailDestinatario.setText("");
                edtEmailConCopia.setText("");
                edtPlainAsunto.setText("");
                edtMultiMensaje.setText("");

                Toast.makeText(getApplicationContext(), "Se presiono el boton Cancelar", Toast.LENGTH_SHORT).show();
            }
        });
    }
}