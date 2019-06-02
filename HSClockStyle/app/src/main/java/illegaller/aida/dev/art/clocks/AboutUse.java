package illegaller.aida.dev.art.clocks;
import android.support.v7.app.*;
import android.os.*;
import android.view.*;

public class AboutUse extends AppCompatActivity
{
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        this.setContentView(setResource("about", "layout"));
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this method
		getMenuInflater().inflate(R.menu.about_menus,menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// TODO: Implement this method
		if(item.getItemId() == R.id.item_exit)
		{
			finishAffinity();
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

