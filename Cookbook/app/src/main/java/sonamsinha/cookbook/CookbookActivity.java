package sonamsinha.cookbook;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


public class CookbookActivity extends ListActivity{

    private final Integer[] image_array = {
            R.mipmap.pic1,
            R.mipmap.pic2,
            R.mipmap.pic3,
            R.mipmap.pic4,
            R.mipmap.pic5,
            R.mipmap.pic6,
            R.mipmap.pic7
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookbook);

        String[] recipe_array = getResources().getStringArray(R.array.recipe_list);
        this.setListAdapter(new ListArrayAdapter<String>(this, R.layout.list_item_layout, R.id.text, recipe_array, image_array));
        setTitle("Cookbook");

        ListView listView = getListView();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView txtView = (TextView)view.findViewById(R.id.text);
                String item = txtView.getText().toString();
                Log.w("CookbookActivity:", "The item selected is "+item);
                Intent intent = new Intent(getApplicationContext(),DetailsActivity.class);
                intent.putExtra("recipe", item);
                intent.putExtra("description", item);
                startActivity(intent);
            }
        });

    }


}
