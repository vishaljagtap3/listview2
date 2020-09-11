package in.bitcode.listview2;

import android.content.Context;
import android.graphics.Color;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class AdapterImages extends BaseAdapter {

    private Context mContext;
    private int [] mArrImageIds;
    private boolean [] mArrImageStates;

    public AdapterImages( Context context, int [] arrImageIds, boolean [] arrImageStates  ){
        mContext = context;
        mArrImageIds = arrImageIds;
        mArrImageStates = arrImageStates;
    }

    @Override
    public int getCount() {
        Log.e("listview2", "getcount called");
        return mArrImageIds.length;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ImageView imageView;

        if( convertView == null ) {
            //create new ImageView
            Log.e("listview2", "new view created for " + position);
            imageView = new ImageView( mContext );
            imageView.setLayoutParams( new ListView.LayoutParams( 400 , 200 ) );
            imageView.setPadding(20, 10, 20, 10);
        }
        else {
            //Reuse the convert view
            Log.e("listview2", "convert view reused for " + position);
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mArrImageIds[position]);
        if( mArrImageStates[position] == true ) {
            imageView.setBackgroundColor(Color.rgb(200, 100, 100));
        }
        else {
            imageView.setBackgroundColor( Color.rgb(255, 255, 255));
        }


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
