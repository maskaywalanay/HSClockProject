package illegaller.aida.dev.art.clocks;
import android.preference.*;
import android.os.*;
import android.provider.*;

public class CustomImageControl extends PreferenceActivity implements Preference.OnPreferenceChangeListener
{

    @Override
    public boolean onPreferenceChange(Preference p1, Object p2)
    {
        if(p1 == settings)
        {
            long klik = Long.valueOf(String.valueOf(p2));
            int s = settings.findIndexOfValue((String)p2);
            Settings.System.putLong(getContentResolver(), "pilih_gambar", (klik));
            settings.setSummary(settings.getEntries()[s]);
        }
        return true;
    }
    private ListPreference settings;
    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(setResource("custom_image_preference", "xml"));
        settings = (ListPreference)findPreference("pilih_gambar");
        long klik = Settings.System.getInt(getContentResolver(), "pilih_gambar", 500);
        settings.setValue(String.valueOf(klik));
        settings.setSummary(settings.getEntry());
        settings.setOnPreferenceChangeListener((Preference.OnPreferenceChangeListener)this);




    }



    public int setResource(String nama, String tipe)
    {
        return getBaseContext().
            getResources().
            getIdentifier(nama, tipe, getBaseContext().
                          getPackageName());
    }

}

