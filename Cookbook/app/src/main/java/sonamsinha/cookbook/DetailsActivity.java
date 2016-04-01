package sonamsinha.cookbook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

public class DetailsActivity extends Activity {
    TextView description;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        description = (TextView)findViewById(R.id.recipeDetails);
        description.setMovementMethod(new ScrollingMovementMethod());

        Intent i = getIntent();
        String recipe = i.getStringExtra("recipe");
        String desc = i.getStringExtra("description");
        desc = desc.replace(" ", "_");
        String recipe_detail = "";
        if("Lasgna_Fritta".equalsIgnoreCase(desc)){
            recipe_detail = getResources().getString(R.string.Lasgna_Fritta);
        }
        if("Cheese_Founduta".equalsIgnoreCase(desc)){
            recipe_detail = getResources().getString(R.string.Cheese_Fonduta);
        }
        if("Chicken_65".equalsIgnoreCase(desc)){
            recipe_detail = getResources().getString(R.string.Chicken_65);
        }
        if("Gulab_Jamun".equalsIgnoreCase(desc)){
            recipe_detail = getResources().getString(R.string.Gulab_Jamun);
        }
        if("Dynamite_Shrimp".equalsIgnoreCase(desc)){
            recipe_detail = getResources().getString(R.string.Dynamite_Shrimp);
        }
        if("Kadhai_Paneer".equalsIgnoreCase(desc)){
            recipe_detail = getResources().getString(R.string.Kadhai_Paneer);
        }
        if("Dan_Dan_Noodles".equalsIgnoreCase(desc)){
            recipe_detail = getResources().getString(R.string.Dan_Dan_Noodles);
        }


        description.setText(recipe + recipe_detail);
    }
}
