package piofal.mzkstg;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Android on 2014-06-17.
 */
public class Wybierz_przystanek extends Activity
    {
    @Override
    protected void onCreate(Bundle savedInstanceState)
        {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wybierz_przystanek);


        String out ="";

        TextView tv = (TextView) this.findViewById(R.id.textView1);
        DataHelper dh = new DataHelper(this);

 //      out += "Czy istnieje baza danych? " + dh.dataBaseExists()+"\n";
        try
        {
//            dh.copyDataBase();
//            out += "Czy istnieje baza danych po skopiowaniu? " + dh.dataBaseExists()+"\n";
            out +="Rezultat otworzenia bazy danych: " + dh.open()+"\n";
            out += "Wynik zapytania \n" + dh.executeQuery("SELECT * FROM buslines limit 7;");
        } catch (Exception ex)
        {
            out += ex.toString() +"\n";
        }

        tv.setText(out);


        }
    }
