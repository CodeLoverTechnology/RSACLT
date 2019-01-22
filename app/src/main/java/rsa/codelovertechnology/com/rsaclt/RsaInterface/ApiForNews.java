package rsa.codelovertechnology.com.rsaclt.RsaInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import rsa.codelovertechnology.com.rsaclt.Models.NewsListModel;

public interface ApiForNews {
    @GET("api/T_News_Masters")
    Call<List<NewsListModel>> Get_News_MastersList();

    @GET("api/T_News_Masters/id")
    Call<List<NewsListModel>> Get_News_Details();
}
