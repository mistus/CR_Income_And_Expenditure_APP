package mistus.cr_income_and_expenditure_app;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by msi-1 on 2017/4/5.
 */

    //RecyclerViewAdapter実装,
    public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

        private int[] imageId;
        private int[] digital;

        //1
        public static class ViewHolder extends RecyclerView.ViewHolder {
            private CardView cardView;
            ViewHolder(CardView view) {
                super(view);
                cardView = view;
            }
        }

        //2建構子
        public RecyclerViewAdapter(int[] imaeId, int[] digital){
            this.imageId = imaeId;
            this.digital = digital;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


            CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_income_and_expenditure, parent, false);

            return new ViewHolder(cardView);

        }


        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {

            CardView cardView = holder.cardView;
           // TextView textView = (TextView)cardView.findViewById(R.id.act52);

           // textView.setText("666666666");

        }

        @Override
        public int getItemCount() {

            return imageId.length;
        }

    }


