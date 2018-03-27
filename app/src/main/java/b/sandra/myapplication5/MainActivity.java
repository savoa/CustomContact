package b.sandra.myapplication5;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Pravimo ojekat adaptera

        CharacterAdapter adapter = new CharacterAdapter(this);
        adapter.addCharacter(new Custom("CZ55", getResources().getDrawable(R.drawable.randy_marsh)));


        ListView list = (ListView) findViewById(R.id.list_view);
        list.setAdapter(adapter);


    }








}
