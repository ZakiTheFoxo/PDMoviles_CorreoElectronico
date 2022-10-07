package com.example.correoelectronico;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CorreoElectronico extends AppCompatActivity implements View.OnClickListener{
    // Variables
    private TextView txtRemitente, txtDestinatario, txtConCopia, txtAsunto, txtMensaje;

    private EditText edtEmailRemitente, edtEmailDestinatario, edtEmailConCopia, edtPlainAsunto, edtMultiMensaje;

    private Button btnAceptar, btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo_electronico);

        // Find on view by ID's
        // Texts
        txtRemitente = findViewById(R.id.txtRemitente);
        txtDestinatario = findViewById(R.id.txtDestinatario);
        txtConCopia = findViewById(R.id.txtConCopia);
        txtAsunto = findViewById(R.id.txtAsunto);
        txtMensaje = findViewById(R.id.txtMensaje);

        // TextFields
        edtEmailRemitente = findViewById(R.id.edtEmailRemitente);
        edtEmailDestinatario = findViewById(R.id.edtEmailDestinatario);
        edtEmailConCopia =  findViewById(R.id.edtEmailConCopia);
        edtPlainAsunto = findViewById(R.id.edtPlainAsunto);
        edtMultiMensaje = findViewById(R.id.edtMultiMensaje);

        // Buttons
        btnAceptar = findViewById(R.id.btnAceptar);
        btnCancelar = findViewById(R.id.btnCancelar);

        // Add listener to buttons
        btnAceptar.setOnClickListener(this);
        btnCancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btnAceptar){
            Toast.makeText(this, "Se presiono el boton Aceptar", Toast.LENGTH_SHORT).show();
        }
        if(view.getId() == R.id.btnCancelar){
            edtEmailRemitente.setText("");
            edtEmailDestinatario.setText("");
            edtEmailConCopia.setText("");
            edtPlainAsunto.setText("");
            edtMultiMensaje.setText("");
            Toast.makeText(this, "Se presiono el boton Cancelar", Toast.LENGTH_SHORT).show();
        }
    }
}