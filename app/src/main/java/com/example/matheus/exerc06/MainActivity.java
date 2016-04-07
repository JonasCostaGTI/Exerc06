package com.example.matheus.exerc06;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public List adiciona(View view){
        List lista = new ArrayList();

        EditText idCampoProprietario = (EditText) findViewById(R.id.idCampoProprietario);
        TextView idCampoCPF = (TextView) findViewById(R.id.idCampoCpf);

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf(idCampoCPF.getText().toString());
        pessoa.setNome(idCampoProprietario.getText().toString());

        TextView idCampoPlaca = (TextView) findViewById(R.id.idCampoPlaca);
        EditText idCampoMarca = (EditText) findViewById(R.id.idCampoMarca);
        EditText idCampoModelo = (EditText) findViewById(R.id.idCampoModelo);
        EditText idCampoEndereco = (EditText) findViewById(R.id.idCampoEndereco);


        Veiculo veiculo = new Veiculo();
        veiculo.setEnderecoVistoria(idCampoEndereco.getText().toString());
        veiculo.setMarca(idCampoMarca.getText().toString());
        veiculo.setModelo(idCampoModelo.getText().toString());
        veiculo.setPlaca(idCampoPlaca.getText().toString());

        pessoa.setVeiculo(veiculo);

        lista.add(pessoa);

        idCampoProprietario.setText(null);
        idCampoCPF.setText(null);

        idCampoPlaca.setText(null);
        idCampoMarca.setText(null);
        idCampoModelo.setText(null);
        idCampoEndereco.setText(null);



        return lista;




    }


}
