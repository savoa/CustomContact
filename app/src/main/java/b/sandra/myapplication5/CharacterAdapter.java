package b.sandra.myapplication5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by student on 27.3.2018.
 */

public class CharacterAdapter extends BaseAdapter {


    private Context mContext;
    private ArrayList<Custom>mCharacters;

    public CharacterAdapter(Context context){

        mContext = context;
        mCharacters = new ArrayList<Custom>();

    }

    public void addCharacter(Custom character){//Ubacuje elemente u listu

        mCharacters.add(character);
        notifyDataSetChanged();


    }




    @Override
    public int getCount() {//Koliko imam item-a u listi
        return  mCharacters.size();//Velicina liste
    }

    @Override
    public Object getItem(int position) {//Vraca ID od view-a,vraca objekat na koji smo kliknuli
        Object rv = null;

        try{

            rv = mCharacters.get(position);

        }catch (IndexOutOfBoundsException e){


            e.printStackTrace();//Vraca gde je pukao program


        }


        return rv;

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {//Mozemo da dobijemo View

       // View view = convertView;

        if(convertView == null){//Ako je View null moramo da ga inflejtujemo jer ga necemo videti,povezacemo ga sa XML-om

            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.row_item,null);
            ViewHolder holder = new ViewHolder();
            holder.image = (ImageView) convertView.findViewById(R.id.image);
            holder.name = (TextView) convertView.findViewById(R.id.name);
            convertView.setTag(holder);//Da bi znao koji holder koristi


        }

        Custom character = (Custom) getItem(position);
        ViewHolder holder = (ViewHolder) convertView.getTag();
        holder.image.setImageDrawable(character.slika);
        holder.name.setText(character.ime);

        return convertView;

    }

    private class ViewHolder{

        public ImageView image = null;
        public TextView name = null;



    }



}
