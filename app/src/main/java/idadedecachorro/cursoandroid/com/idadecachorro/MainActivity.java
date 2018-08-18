package idadedecachorro.cursoandroid.com.idadecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Atributos / tipo / nome variável
    private EditText caixaTexto;
    private Button botaoIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) //Método que irá reconhecer o app
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Para encontrar as Id's da tela e acessá-los
        caixaTexto = (EditText) findViewById(R.id.caixaTextoId);
        botaoIdade = (Button) findViewById(R.id.botaoIdadeId);
        resultadoIdade = (TextView) findViewById(R.id.resultadoIdadeId);

        //Adicionar evento de click no botão
        botaoIdade.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) //Método onclick
            {

                Toast.makeText(getApplicationContext(), "Carregando", Toast.LENGTH_SHORT).show();

                String textoDigitado = caixaTexto.getText().toString(); //Recuperar o que foi digitado e converter em string

                if (textoDigitado.isEmpty())
                    { //String vazia = pessoa não digitou nada será exibido a mensagem de erro
                        resultadoIdade.setText("Nenhum número digitado!!");
                    }
                else
                    {
                        int valorDigitado = Integer.parseInt(textoDigitado); //Converter num digitado em inteiro
                        int valorResultadoFinal = valorDigitado * 7;
                        resultadoIdade.setText("A idade do cachorro em anos humanos é: " + valorResultadoFinal + " anos");
                    }
            }
        });
    }
}
