package com.cesar491.cesar.ccciconection;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

import Adapters.MsgAdapter;
import Data.MsgTexto;

public class Messages extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<MsgTexto> msgTextos;
    private MsgAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_message);

        msgTextos = new ArrayList<>();

        Toolbar toolbar = (Toolbar)findViewById(R.id.Toolbar);
        recyclerView = (RecyclerView)findViewById(R.id.recy_list_msg);
        LinearLayoutManager lny = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(lny);

        for (int i=0; i< 7; i++){
            MsgTexto msgTexto = new MsgTexto();
            msgTexto.setIdMessage("1");
            msgTexto.setTypeMessage(1);
            msgTexto.setMessage("Hola");
            msgTexto.setHoraMessage("12 PM");
            msgTextos.add(msgTexto);
        }

        adapter = new MsgAdapter(msgTextos);

        recyclerView.setAdapter(adapter);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
