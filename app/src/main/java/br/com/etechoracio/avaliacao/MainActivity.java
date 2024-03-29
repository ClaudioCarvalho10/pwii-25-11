package br.com.etechoracio.avaliacao;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import javax.xml.transform.Result;

import br.com.etechoracio.avaliacao.service.ProjetoAPIService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;
import retrofit2.http.Path;



public class MainActivity extends AppCompatActivity{


    EditText editNum1;
    EditText editNum2;


      private ProjetoAPIService service;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editNum1 = findViewById(R.id.editNum1);
        editNum2 = findViewById(R.id.editNum2);

     this.service = new Retrofit.Builder().baseUrl("http://172.16.58.22:8001/api/funcoes/quadrado")
             .addConverterFactory(JacksonConverterFactory.create())
             .build()
             .create(ProjetoAPIService.class);



    }

public void onProcessar (View View){
        Call<String> call = this.service.executar(editNum1.getText().toString(),editNum2.getText().toString());
        call.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                String resultado = response.body();
                Toast toast = Toast.makeText(Resultado(

                ));
                toast.show();
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        }





    }



    }



}
