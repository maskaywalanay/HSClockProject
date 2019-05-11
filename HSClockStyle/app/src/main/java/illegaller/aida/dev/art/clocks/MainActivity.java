package illegaller.aida.dev.art.clocks;

import android.os.*;
import android.support.v7.app.*;
import android.view.*;
import android.content.*;

public class MainActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(setResource("main" , "layout"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // TODO: Implement this method
        getMenuInflater().inflate(R.menu.app_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // TODO: Implement this method
        switch(item.getItemId())
        {
            case R.id.item1:
                // configuration 
                startActivity(new Intent(this,CustomImageControl.class));
                return true;

            case R.id.item2:
                // Activity di panggil dari menu
                startActivity(new Intent(this,AboutUse.class));
                return true;

            case R.id.item3:
                finishAffinity();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }



    public int setResource(String nama, String tipe)
    {
        return getBaseContext().
            getResources().
            getIdentifier(nama, tipe, getBaseContext().
                          getPackageName());
    }
}

