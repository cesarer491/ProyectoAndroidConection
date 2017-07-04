package Adapters;


import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.cesar491.cesar.ccciconection.R;

import java.util.ArrayList;

import Data.MsgTexto;

public class MsgAdapter extends RecyclerView.Adapter<MsgAdapter.MsgViewHolder> {

    private ArrayList<MsgTexto> msgTextos;

    public MsgAdapter(ArrayList<MsgTexto> msgTextos) {
        this.msgTextos = msgTextos;
    }

    @Override
    public MsgViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.messages,parent,false);
        return new MsgViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MsgViewHolder holder, int position) {

        holder.TxtMessage.setText(msgTextos.get(position).getMessage());
        holder.TxtHora.setText(msgTextos.get(position).getHoraMessage());
    }

    @Override
    public int getItemCount() {
        return msgTextos.size();
    }

    static class MsgViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView TxtMessage;
        TextView TxtHora;

        MsgViewHolder(View item){
            super(item);
            cardView = (CardView)item.findViewById(R.id.cvmessage);
            TxtMessage = (TextView)item.findViewById(R.id.txtmessage);
            TxtHora = (TextView)item.findViewById(R.id.txthora);

        }
    }
}
