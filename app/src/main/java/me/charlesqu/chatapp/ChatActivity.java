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
git import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;




import java.util.ArrayList;
//git
// 11/2/17
// hello
public class ChatActivity extends AppCompatActivity {
    public static FirebaseDatabase database;
    public static DatabaseReference ref;
    ListView listview;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //everyth
        //
        //
        //
        // ing below is not
        setContentView(R.layout.chatactivity);
        editText = (EditText)findViewById(R.id.editText);
        listview = (ListView)findViewById( R.id.ListView);
         final ArrayList<String> listArray = new ArrayList<String>();

        ArrayList<String> MyArrayList = new ArrayList<String>();
        MyArrayList.add("wat");
        MyArrayList.add("wow");
        MyArrayList.add("woo");
        MyListAdapter adapter = new MyListAdapter(getApplicationContext(), MyArrayList, ChatActivity.this);
        super.onCreate(savedInstanceState);
        listview.setAdapter(adapter);


        adapter.notifyDataSetChanged();

        // listArray = []
        /*// this whole shit creates a fkin view to appear on the list
        if (convertView == null ){
            // must create a View,
            LayoutInflater inflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.chatactivity, parent, false);
        }


        // Here we can do changes the convertView, such as set a text on a TextView
        //or an image on an ImageView
        */
    }



}











