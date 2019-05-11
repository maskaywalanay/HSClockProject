package illegaller.aida.dev.art.clocks;

import android.os.*;
import android.support.v7.app.*;

public class MainActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(setResource("main","layout"));
    }
    
    public int setResource(String nama, String tipe)
    {
        return getBaseContext().
        getResources().
        getIdentifier(nama, tipe, getBaseContext().
        getPackageName());
    }
}
