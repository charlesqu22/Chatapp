package me.charlesqu.chatapp;

import android.app.ListActivity;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
// 11/2/17
// hello
public class ChatActivity extends AppCompatActivity {
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listview = (ListView)findViewById( R.id.ListView);
        //everyth
        //
        //
        //
        // ing below is not
        setContentView(R.layout.chatactivity);
        listview.setAdapter(new ListAdapter() {
            @Override
            public boolean areAllItemsEnabled() {
                return false;
            }

            @Override
            public boolean isEnabled(int i) {
                return false;
            }

            @Override
            public void registerDataSetObserver(DataSetObserver dataSetObserver) {

            }

            @Override
            public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

            }

            @Override
            public int getCount() {
                return 0;
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public boolean hasStableIds() {
                return false;
            }
/*TODO GetView*/
            @Override
            public View getView(int position,View convertView, ViewGroup parent) {
                 // this whole shit creates a fkin view to appear on the list
                    if (convertView == null ){
                        // must create a View,
                        LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        convertView = inflater.inflate(R.layout.chatactivity, parent, false);
                    }
                    // Here we can do changes yto the convertView, such as set a text on a TextView
                    //or an image on an ImageView

                return null;
            }

            @Override
            public int getItemViewType(int i) {
                return 0;
            }

            @Override
            public int getViewTypeCount() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
        });

    }



}











