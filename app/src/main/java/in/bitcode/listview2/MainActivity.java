package in.bitcode.listview2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView mListViewImages;
    private int [] mArrImageIds = {
            R.drawable.img1,R.drawable.img2,R.drawable.img3,
            R.drawable.img2,R.drawable.img5,R.drawable.img6,
            R.drawable.img3,R.drawable.img8,R.drawable.img9,
            R.drawable.img1,R.drawable.img2,R.drawable.img3,
            R.drawable.img2,R.drawable.img5,R.drawable.img6,
            R.drawable.img3,R.drawable.img8,R.drawable.img9,
            R.drawable.img1,R.drawable.img2,R.drawable.img3,
            R.drawable.img2,R.drawable.img5,R.drawable.img6,
            R.drawable.img3,R.drawable.img8,R.drawable.img9
    };
    private boolean [] mArrImageStates = new boolean[ mArrImageIds.length ];

    private AdapterImages mAdapterImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        mAdapterImages = new AdapterImages( this, mArrImageIds, mArrImageStates );
        mListViewImages.setAdapter( mAdapterImages );

        mListViewImages.setOnItemClickListener( new MyOnImageClickListener() );

    }

    private void init() {
        mListViewImages = findViewById( R.id.listViewImages );

    }

    private class MyOnImageClickListener implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

            if( mArrImageStates[position] == true ) {
                mArrImageStates[position] = false;
                view.setBackgroundColor( Color.WHITE );
            }
            else {
                mArrImageStates[position] = true;
                view.setBackgroundColor( Color.rgb(200, 100, 100 ) );
            }



        }
    }
}