package com.example.correoelectronico;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CorreoElectronico extends AppCompatActivity {
    // Variables
    TextView txtRemitente, txtDestinatario, txtConCopia, txtAsunto, txtMensaje;

    EditText edtEmailRemitente, edtEmailDestinatario, edtEmailConCopia, edtPlainAsunto, edtMultiMensaje;

    Button btnAceptar, btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo_electronico);

        // Texts
        txtRemitente = findViewById(R.id.txtRemitente);
    }


}