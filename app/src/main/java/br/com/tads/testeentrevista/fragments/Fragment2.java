package br.com.tads.testeentrevista.fragments;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import br.com.tads.testeentrevista.R;

public class Fragment2 extends Fragment  {

    private ListView listView;
    static List<String> array = new ArrayList<>();
    List<String> array2 = new ArrayList<>();
    static ArrayAdapter<String> adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_2, null);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        listView = (ListView) view.findViewById(R.id.listView);

        adapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, array);
        listView.setAdapter(adapter);


    }



    public static void addItem(String item){
        array.add(item);
        adapter.notifyDataSetChanged();
    }
}
