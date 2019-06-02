package illegaller.aida.dev.art.clocks;
import android.appwidget.*;
import android.content.*;
import android.app.*;
import android.widget.*;

public class ClocksWidget extends AppWidgetProvider
{

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)
    {
        for(int appwidgetId : appWidgetIds)
        {
            Intent intent = new Intent(context,  MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, 0);
            RemoteViews viss = new RemoteViews(context.getPackageName(), R.layout.clocks_widget);
            viss.setOnClickPendingIntent(R.id.frame_container, pendingIntent);
            appWidgetManager.updateAppWidget(appwidgetId,  viss);
        }
    }


}

