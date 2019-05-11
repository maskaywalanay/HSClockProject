package illegaller.aida.dev.art.clocks;
import android.widget.*;
import android.content.*;
import android.util.*;
import android.os.*;
import android.provider.*;

public class ImageViewBackground extends ImageView
{
    private  Handler mHandler;
    private Runnable mTricker;
    private int settings;


    public ImageViewBackground(Context context, AttributeSet attr)
    {
        super(context, attr);

        mHandler = new Handler();
        mTricker = new Runnable()
        {
            public void run()
            {
                UpdateImage();
                mHandler.postDelayed(this, 500);

            }
        };

        mTricker.run();
    }


    private void UpdateImage()
    {
        settings = Settings.System.getInt(getContext().getContentResolver(), "pilih_gambar", 0 );

        switch (settings)
        {
            default:{return;}

            case 0:
                ImageViewBackground.this.setBackgroundColor(0x00000000);
                return ;

            case 1:
                setBackgroundResource(setResource("bg_01", "drawable"));
                return;

            case 2:
                setBackgroundResource(setResource("bg_02", "drawable"));
                return;

            case 3:
                setBackgroundResource(setResource("bg_03", "drawable"));
                return;

            case 4:
                setBackgroundResource(setResource("bg_04", "drawable"));
                return;

            case 5:
                setBackgroundResource(setResource("bg_05", "drawable"));
                return;

            case 6:
                setBackgroundResource(setResource("bg_06", "drawable"));
                return;

            case 7:
                setBackgroundResource(setResource("bg_07", "drawable"));
                return;

        }



    }

    public int setResource(String nama, String tipe)
    {
        return getContext().
            getResources().getIdentifier(nama, tipe, getContext().
                                         getPackageName());
    }
}

