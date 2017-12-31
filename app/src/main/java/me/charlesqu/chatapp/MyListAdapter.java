package me.charlesqu.chatapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class MyListAdapter extends BaseAdapter{
    Context context;
    ArrayList<String> myArrayList;
    Activity activity;
    public MyListAdapter(Context context, ArrayList <String> array, Activity activity) {
        super();
        this.context = context;
        this.myArrayList = array;
        this.activity = activity;
    }
    @Override
    public int getCount(){
        return myArrayList.size();
    }


    @Override
    public Object getItem(int position) {
        return getItem(position);
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        String message = myArrayList.get(position);//remember, myArrayList is our ListAdapter class object initiated by an ArrayList argument passed in the constructor

        LayoutInflater inflater = (LayoutInflater) context.getSystemService (Context.LAYOUT_INFLATER_SERVICE);
        View myCellLayout = inflater.inflate(R.layout.chatactivity, null);
        TextView messageTextView = (TextView) myCellLayout.findViewById(R.id.editText);  // messageTV is the id of your message textview in your custom made message cell XML
        messageTextView.setText(message);

        //now you set the convertView to be displayed as your custom layout.
        convertView = myCellLayout;




        //Your Code to make your custom text message view.
        //: Look up how to inflate your custom view in getView method of a BaseAdapter class
        return convertView;
    }
}


