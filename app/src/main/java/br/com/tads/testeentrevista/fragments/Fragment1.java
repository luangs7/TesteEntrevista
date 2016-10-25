package br.com.tads.testeentrevista.fragments;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import br.com.tads.testeentrevista.R;

public class Fragment1 extends Fragment  {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_1, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       final EditText dado = (EditText) view.findViewById(R.id.editText);
        Button button = (Button) view.findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dado.getText().length() > 0){
                    Fragment2.addItem(dado.getText().toString());
                    Toast.makeText(getContext(), "Item adicionado!", Toast.LENGTH_SHORT).show();
                    dado.setText("");

                }else{
                    Toast.makeText(getContext(), "Campo vazio", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}
