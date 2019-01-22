package rsa.codelovertechnology.com.rsaclt.Fragments;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import rsa.codelovertechnology.com.rsaclt.Adapters.NewsListViewAdapter;
import rsa.codelovertechnology.com.rsaclt.Models.NewsListModel;
import rsa.codelovertechnology.com.rsaclt.R;
import rsa.codelovertechnology.com.rsaclt.RsaInterface.ApiForNews;

public class NewsListFragment  extends Fragment {

    View v;
    private RecyclerView recyclerNewsView;
    private List<NewsListModel> listModelList;

    public NewsListFragment()
    {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.news_list_fragment,container,false);
        return v;
    }


    /*@Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       v=inflater.inflate(R.layout.news_list_fragment,container,false);
        recyclerNewsView= (RecyclerView) v.findViewById(R.id.News_List);
      NewsListViewAdapter newsViewAdapter = new NewsListViewAdapter(getContext(),listModelList);
        recyclerNewsView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerNewsView.setAdapter(newsViewAdapter);
       return v;
    }*/

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        listModelList = new ArrayList<NewsListModel>();
        listModelList.add(new NewsListModel(
                1,
                "Text", 5,
                "This is Text Api Calling",
                "This is Sub text Heading by Rahul Kumar ",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                "Delhi",
                20,
                "Rahul Kumar",
                "31-12-2018",
                "Rahul Kuar",
                "30-12-2018",
                true,
                1,
                1,
                "National",
                "National"));
        listModelList.add(new NewsListModel(
                        1,
                        "Text", 3,
                        "This is Text 23 Api Calling",
                        "This is Sub text Heading by Rahul Kumar ",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        "Delhi Mumbai",
                        20,
                        "Rahul Kumar",
                        "31-12-2018",
                        "Rahul Kuar",
                        "30-12-2018",
                        true,
                        1,
                        1,
                        "National",
                        "National"
                )
        );
        listModelList.add(new NewsListModel(
                        1,
                        "Text", 3,
                        "This is Text 23 Api Calling",
                        "This is Sub text Heading by Rahul Kumar ",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        "Delhi Mumbai",
                        20,
                        "Rahul Kumar",
                        "31-12-2018",
                        "Rahul Kuar",
                        "30-12-2018",
                        true,
                        1,
                        1,
                        "National",
                        "National"
                )
        );
        listModelList.add(new NewsListModel(
                        1,
                        "Text", 3,
                        "This is Text 23 Api Calling",
                        "This is Sub text Heading by Rahul Kumar ",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        "Delhi Mumbai",
                        20,
                        "Rahul Kumar",
                        "31-12-2018",
                        "Rahul Kuar",
                        "30-12-2018",
                        true,
                        1,
                        1,
                        "National",
                        "National"
                )
        );
        listModelList.add(new NewsListModel(
                        1,
                        "Text", 3,
                        "This is Text 23 Api Calling",
                        "This is Sub text Heading by Rahul Kumar ",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        "Delhi Mumbai",
                        20,
                        "Rahul Kumar",
                        "31-12-2018",
                        "Rahul Kuar",
                        "30-12-2018",
                        true,
                        1,
                        1,
                        "National",
                        "National"
                )
        );
        listModelList.add(new NewsListModel(
                        1,
                        "Text", 3,
                        "This is Text 23 Api Calling",
                        "This is Sub text Heading by Rahul Kumar ",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        "Delhi Mumbai",
                        20,
                        "Rahul Kumar",
                        "31-12-2018",
                        "Rahul Kuar",
                        "30-12-2018",
                        true,
                        1,
                        1,
                        "National",
                        "National"
                )
        );
        listModelList.add(new NewsListModel(
                        1,
                        "Text", 3,
                        "This is Text 23 Api Calling",
                        "This is Sub text Heading by Rahul Kumar ",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        "Delhi Mumbai",
                        20,
                        "Rahul Kumar",
                        "31-12-2018",
                        "Rahul Kuar",
                        "30-12-2018",
                        true,
                        1,
                        1,
                        "National",
                        "National"
                )
        );
        listModelList.add(new NewsListModel(
                        1,
                        "Text", 3,
                        "This is Text 23 Api Calling",
                        "This is Sub text Heading by Rahul Kumar ",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        "Delhi Mumbai",
                        20,
                        "Rahul Kumar",
                        "31-12-2018",
                        "Rahul Kuar",
                        "30-12-2018",
                        true,
                        1,
                        1,
                        "National",
                        "National"
                )
        );
        listModelList.add(new NewsListModel(
                        1,
                        "Text", 3,
                        "This is Text 23 Api Calling",
                        "This is Sub text Heading by Rahul Kumar ",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        "Delhi Mumbai",
                        20,
                        "Rahul Kumar",
                        "31-12-2018",
                        "Rahul Kuar",
                        "30-12-2018",
                        true,
                        1,
                        1,
                        "National",
                        "National"
                )
        );
        listModelList.add(new NewsListModel(
                        1,
                        "Text", 3,
                        "This is Text 23 Api Calling",
                        "This is Sub text Heading by Rahul Kumar ",
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        null,
                        "Delhi Mumbai",
                        20,
                        "Rahul Kumar",
                        "31-12-2018",
                        "Rahul Kuar",
                        "30-12-2018",
                        true,
                        1,
                        1,
                        "National",
                        "National"
                )
        );
        /*if(listModelList.size()==0) {
            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    listModelList = GetNewsList();
                }
            }, 3000);
        }*/

    }

  /*  public List<NewsListModel> GetNewsList()
    {
        final List<NewsListModel> listNewsWebApiData = new ArrayList<NewsListModel>();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://rashtriyasamanadhikar.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ApiForNews jsonPlaceHolderApiForNews = retrofit.create(ApiForNews.class);
        Call<List<NewsListModel>> call = jsonPlaceHolderApiForNews.Get_News_MastersList();
        call.enqueue(new Callback<List<NewsListModel>>() {
            @Override
            public void onResponse(Call<List<NewsListModel>> call, Response<List<NewsListModel>> response) {
                if (!response.isSuccessful()) {
                    *//*text_View_Result.setText("Code : " + response.code());*//*
                }
                List<NewsListModel> NewsList = response.body();
                Log.d("NewsList  " , "NewsList : " + NewsList);
                for (NewsListModel t_news_masters : NewsList) {
                    //newsImages.setImageURI("http://rashtriyasamanadhikar.com/"+ t_news_masters.getImg1());
                    listNewsWebApiData.add(t_news_masters);
                }
              }

            @Override
            public void onFailure(Call<List<NewsListModel>> call, Throwable t) {
                Log.d("onFailure  " , "getMessage() : " + t.getMessage());
                *//*text_View_Result.setText(t.getMessage());*//*
            }
        });
        return listNewsWebApiData;
    }*/
}
