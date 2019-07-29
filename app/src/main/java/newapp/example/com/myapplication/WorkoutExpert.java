package newapp.example.com.myapplication;

import java.util.ArrayList;
import java.util.List;

public class WorkoutExpert
{
    List<String> getWorkouts (String workouttypes)
    {
        List<String> workout= new ArrayList<String>();

        if(workouttypes.equals( "Chest" ))
        {
            workout.add("Bench Press");
            workout.add( "Cable Plays" );
        }
        else if(workouttypes.equals( "Triceps" ))
        {
            workout.add("Tricep Ext");
            workout.add( "Tricep PushDowns" );
        }
        else if(workouttypes.equals( "Shoulder" ))
        {
            workout.add("abc");
            workout.add( "pqr" );
        }
        else if(workouttypes.equals( "Biceps" ))
        {
            workout.add("Bicep curl");
            workout.add( "Bicep round" );
        }
        return workout;
    }




}
