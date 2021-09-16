package com.manhal.todolist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.menhal.todolist.Note;

import java.util.ArrayList;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteHolder>{

    ArrayList<Note> notes;
    Context context;
    public  NoteAdapter(ArrayList<Note> arrayList, Context context){
        notes = arrayList;
        this.context =context;
    }
    @NonNull
    @Override
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view   = LayoutInflater.from(context).inflate(R.layout.note_holder,parent, false);
        return new NoteHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int position) {
        holder.title.setText(notes.get(position).getTitle());
        holder.description.setText(notes.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }

    class  NoteHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView description;
        ImageView imgEdit;
        public NoteHolder(@NonNull View itemView) {
            super(itemView);

            title =itemView.findViewById(R.id.txt_note_name);
            description = itemView.findViewById(R.id.txt_note_description);
            imgEdit = itemView.findViewById(R.id.img_edit);
        }
    }
}