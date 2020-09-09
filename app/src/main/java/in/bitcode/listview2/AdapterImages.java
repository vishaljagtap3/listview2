package in.bitcode.listview2;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class AdapterImages extends BaseAdapter {

    private Context mContext;
    private int [] mArrImageIds;

    public AdapterImages( Context context, int [] arrImageIds ){
        mContext = context;
        mArrImageIds = arrImageIds;
    }

    @Override
    public int getCount() {

        Log.e("listview2", "getcount called");

        return mArrImageIds.length;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        Log.e("listview2", "getView called for " + position);

        ImageView imageView = new ImageView( mContext );
        imageView.setLayoutParams( new ListView.LayoutParams( 400 , 200 ) );
        imageView.setPadding(20, 10, 20, 10);

        imageView.setImageResource( mArrImageIds[position] );

        return imageView;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
}
