package illegaller.aida.dev.art.clocks;
import android.support.v7.app.*;
import android.os.*;

public class AboutUse extends AppCompatActivity
{
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        this.setContentView(setResource("about", "layout"));
    }


    public int setResource(String nama, String tipe)
    {
        return getBaseContext().
            getResources().
            getIdentifier(nama, tipe, getBaseContext().
                          getPackageName());
    }


}

