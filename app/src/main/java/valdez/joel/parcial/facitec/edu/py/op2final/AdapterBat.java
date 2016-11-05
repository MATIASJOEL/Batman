package valdez.joel.parcial.facitec.edu.py.op2final;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Usuario on 02/11/2016.
 */
public class AdapterBat extends BaseAdapter {

    private List<Batman> batman;
    private Context context;

    public AdapterBat(List<Batman> batman , Context context){

        this.batman = batman;
        this.context = context;

    }
    @Override
    public int getCount() { return batman.size(); }

    @Override
    public Object getItem(int position) { return  batman.get(position); }

    @Override
    public long getItemId(int position) { return batman.get(position).getId(); }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;


        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_batman, null);
        }

        Batman a = this.batman.get(position);

        TextView textViewTitle = (TextView) view.findViewById(R.id.textViewTitle);
        TextView textViewYear = (TextView) view.findViewById(R.id.textViewYear);
        TextView textViewType = (TextView) view.findViewById(R.id.textViewType);
        ImageView PosterImageView = (ImageView) view.findViewById(R.id.imageViewPoster);

        Picasso.with(this.context).load(a.getPoster()).into(PosterImageView);

        textViewTitle.setText(a.getTitle());
        textViewYear.setText(a.getYear());
        textViewType.setText(a.getType());


        return view;
    }
}
