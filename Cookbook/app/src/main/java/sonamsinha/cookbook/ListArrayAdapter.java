package sonamsinha.cookbook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by sonamsinha on 3/2/16.
 */
public class ListArrayAdapter<String> extends ArrayAdapter<String> {
    private final String[] values;
    private final Integer[] image_array;

    public ListArrayAdapter(Context context, int resource, int textViewResourceId, String[] objects, Integer[] images) {
        super(context, resource, textViewResourceId, objects);
        this.values = objects;
        this.image_array = images;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.list_item_layout, parent, false);
        TextView textView = (TextView)rowView.findViewById(R.id.text);
        ImageView imageView = (ImageView)rowView.findViewById(R.id.thumb);
        textView.setText((CharSequence)values[position]);
        imageView.setImageResource(image_array[position]);
        return rowView;
    }
}
