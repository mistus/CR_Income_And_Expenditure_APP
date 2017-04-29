package mistus.cr_income_and_expenditure_app;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class RecordPageFragment extends Fragment {

    //餘額
    int playerBalance = 0;

    //RecyclerView
    private RecyclerView RecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Context Context = getActivity();
        //RecyclerView = (RecyclerView)container.findViewById(R.id.recycler_view);


        LinearLayout view = (LinearLayout)inflater.inflate(R.layout.fragment_record_page, container, false);


        //View view = inflater.inflate(R.layout.fragment_record_page, container, false);

        //View view = inflater.inflate(R.layout.layout_test, container, false);
       RecyclerView = (RecyclerView)view.findViewById(R.id.recycler_view);

       // RecyclerView = (RecyclerView)inflater.inflate(R.layout.fragment_record_page, container,false);
        //RecyclerView = (RecyclerView)inflater.inflate(R.layout.fragment_record_page, container,false);
        //inflater.inflate(R.layout.fragment_record_page, container,false).findViewById(R.layout.fragment_record_page, container,false)
       // RecyclerView.setLayoutManager(new LinearLayoutManager(Context));
        //LinearLayoutManager lmr = new LinearLayoutManager(getActivity());


        int[] test = new int[]{0,0,0,0,0,0,0,0,0,0,0,0};
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(test, test);
        LinearLayoutManager layoutManager = new LinearLayoutManager(Context);
        RecyclerView.setLayoutManager(layoutManager);
        RecyclerView.setAdapter(adapter);

        return view;
        //return inflater.inflate(R.layout.fragment_record_page, container, false);
    }







}
