package com.example.salim3dd.listview_coustmadpter;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private listAdapter adapter1;
    private ArrayList<listItme> mlist1= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        ///قراءة من المصفوفة
        //String[] itme = getResources().getStringArray(R.array.index);

        /*
        //الليست العادية
        List list = new ArrayList();

        for (int i = 0; i < 50; i++) {
            list.add(i + " - Salim");
        }
        String n;
        n = String.valueOf(list.get(0));
        */

        Typeface typeface = Typeface.createFromAsset(getAssets(), "font.otf");

        LayoutInflater lin = getLayoutInflater();
        View appear = lin.inflate(R.layout.row_itme, (ViewGroup) findViewById(R.id.linear_Layout_TXT));
        TextView txtitm = (TextView) appear.findViewById(R.id.textView_name);
        txtitm.setTypeface(typeface);


        try {
            InputStream input = getAssets().open("txtfile.txt");

            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader br = new BufferedReader(isr);
            try {
                int id = 0;
                String line;
                while ((line = br.readLine()) != null) {
                    mlist1.add(new listItme(id, line, "السطر الثاني"));
                    id++;

                }
            } catch (IOException e) {

            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        adapter1 = new listAdapter(getApplicationContext(), mlist1);
        listView.setAdapter(adapter1);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), "" + view.getTag(), Toast.LENGTH_LONG).show();
            }
        });

    }

//    class ListAdapter2 extends BaseAdapter{
//        ArrayList<list_itme2> listitme = new ArrayList<list_itme2>();
//        public ListAdapter2(ArrayList<list_itme2>listitme) {
//            this.listitme=listitme;
//        }
//
//        @Override
//        public int getCount() {
//            return listitme.size();
//        }
//
//        @Override
//        public Object getItem(int position) {
//            return listitme.get(position).name;
//        }
//
//        @Override
//        public long getItemId(int position) {
//            return position;
//        }
//
//        @Override
//        public View getView(int position, View convertView, ViewGroup parent) {
//            return null;
//        }
//    }

}

