package rsa.codelovertechnology.com.rsaclt.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.net.URL;
import java.util.List;

import rsa.codelovertechnology.com.rsaclt.Models.NewsListModel;
import rsa.codelovertechnology.com.rsaclt.R;

public class NewsListViewAdapter extends RecyclerView.Adapter<NewsListViewAdapter.NewsHolder> {
    Context context;
    List<NewsListModel> mNewsList;
    String URL_Base="http://rashtriyasamanadhikar.com/";

    public NewsListViewAdapter(Context context, List<NewsListModel> mNewsList) {
        this.context = context;
        this.mNewsList = mNewsList;
    }



    @NonNull
    @Override
    public NewsHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v;
        v= LayoutInflater.from(context).inflate(R.layout.display_news_list,viewGroup,false);
        NewsHolder newsHolder = new NewsHolder(v);
        return newsHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull NewsHolder newsHolder, int i) {
        /*newsHolder.newsImages.setImageResource();*/
        newsHolder.tv_textHeadline.setText(mNewsList.get(i).getNewsHeading());
        newsHolder.tv_textCreatedDate.setText(mNewsList.get(i).getCreatedDate());
        newsHolder.tv_textLocation.setText(mNewsList.get(i).getLocation());
        newsHolder.text_SubHeading.setText(mNewsList.get(i).getSubHeading());
        /*newsHolder.tv_textViewCount.setText(mNewsList.get(i).getNoOfNewsViews());*/
    }

    @Override
    public int getItemCount() {
        return mNewsList.size();
    }

    public static class NewsHolder extends RecyclerView.ViewHolder{
        private TextView tv_textHeadline;
        private ImageView tv_newsImages;
        private TextView tv_textLocation;
        private  TextView tv_textViewCount;
        private TextView tv_textCreatedDate;
        private TextView text_SubHeading;

        public NewsHolder(@NonNull View itemView) {
            super(itemView);
            tv_newsImages = (ImageView) itemView.findViewById(R.id.newsImages);
            tv_textHeadline = (TextView) itemView.findViewById(R.id.textHeadline);
            tv_textLocation = (TextView)itemView.findViewById(R.id.textLocation);
            text_SubHeading = (TextView)itemView.findViewById(R.id.text_SubHeading);
            //tv_textViewCount = (TextView)itemView.findViewById(R.id.textViewCount);
            tv_textCreatedDate =(TextView) itemView.findViewById(R.id.textCreatedDate);
        }
    }
}
