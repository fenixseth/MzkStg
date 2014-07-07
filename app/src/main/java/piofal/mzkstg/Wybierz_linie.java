package piofal.mzkstg;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Wybierz_linie extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wybierz_linie);

    String out ="";

    TextView tv = (TextView) this.findViewById(R.id.textView);
    DataHelper dh = new DataHelper(this);

    out += "Czy istnieje baza danych? " + dh.dataBaseExists()+"\n";
    try
    {
        dh.copyDataBase();
        out += "Czy istnieje baza danych po skopiowaniu? " + dh.dataBaseExists()+"\n";
        out +="Rezultat otworzenia bazy danych: " + dh.open()+"\n";
        out += "Wynik zapytania \n" + dh.executeQuery("SELECT * FROM favourites limit 5;");
    } catch (Exception ex)
    {
        out += ex.toString() +"\n";
    }

    tv.setText(out);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.wybierz_linie, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

public void onlickHandler(View v)
    {
        switch (v.getId())
        {
            case R.id.linia7:
                ladujDrugaAktywnosc();
                break;
            case R.id.linia12:
                ladujDrugaAktywnosc();
                break;
            case R.id.linia14:
                ladujDrugaAktywnosc();
                break;
            case R.id.linia16:
                ladujDrugaAktywnosc();
                break;
            case R.id.linia17:
                ladujDrugaAktywnosc();
                break;
            case R.id.linia19:
                ladujDrugaAktywnosc();
                break;
            case R.id.linia25:
                ladujDrugaAktywnosc();
                break;
            case R.id.linia27:
                ladujDrugaAktywnosc();
                break;
            case R.id.linia15:
                ladujDrugaAktywnosc();
                break;
            default:
                break;

        }
    }

private void ladujDrugaAktywnosc()
    {
    Intent intent = new Intent(Wybierz_linie.this, Wybierz_przystanek.class);
    startActivity(intent);
    }
}
