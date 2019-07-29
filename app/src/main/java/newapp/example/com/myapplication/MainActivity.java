package newapp.example.com.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;

import java.util.List;

public class MainActivity extends Activity {
    private WorkoutExpert expert = new WorkoutExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    public void onClickFindWorkout(View view)
    {
        TextView workouts = findViewById(R.id.workout);
        Spinner workouttype = findViewById(R.id.workouttype);

        String workout=String.valueOf(workouttype.getSelectedItem());
        //workouts.setText(workout);
        List<String> workoutList= expert.getWorkouts( workout );
        StringBuilder workoutsFormatted = new StringBuilder(  );
        for(String work:workoutList)
        {
            workoutsFormatted.append( work ).append('\n');
        }
        workouts.setText(workoutsFormatted);
    }
}
