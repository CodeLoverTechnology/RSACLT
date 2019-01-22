package rsa.codelovertechnology.com.rsaclt.Models;

public class NewsListModel {
    private int NewsID=0;
    private String NewsType=null;
    private int NewsSubCategoryID=0;
    private String NewsHeading=null;
    private String SubHeading=null;
    private String Para1=null;
    private String Para2=null;
    private String Para3=null;
    private String Para4=null;
    private String Para5=null;
    private String Img1=null;
    private String Img2=null;
    private String Img3=null;
    private String Img4=null;
    private String Img5=null;
    private String  Remarks=null;
    private String Location=null;
    private int NoOfNewsViews=0;
    private String CreatedBy=null;
    private String  CreatedDate=null;
    private String ModifiedBy=null;
    private String  ModifiedDate=null;
    private boolean Active=false;
    private int  NewsTypeID =0;
    private int NewsCategoryID=0;
    private String NewsCategory=null;
    private String NewsSubCategory=null;

    public NewsListModel(int newsID, String newsType, int newsSubCategoryID, String newsHeading, String subHeading, String para1, String para2, String para3, String para4, String para5, String img1, String img2, String img3, String img4, String img5, String remarks, String location, int noOfNewsViews, String createdBy, String createdDate, String modifiedBy, String modifiedDate, boolean active, int newsTypeID, int newsCategoryID, String newsCategory, String newsSubCategory) {
        NewsID = newsID;
        NewsType = newsType;
        NewsSubCategoryID = newsSubCategoryID;
        NewsHeading = newsHeading;
        SubHeading = subHeading;
        Para1 = para1;
        Para2 = para2;
        Para3 = para3;
        Para4 = para4;
        Para5 = para5;
        Img1 = img1;
        Img2 = img2;
        Img3 = img3;
        Img4 = img4;
        Img5 = img5;
        Remarks = remarks;
        Location = location;
        NoOfNewsViews = noOfNewsViews;
        CreatedBy = createdBy;
        CreatedDate = createdDate;
        ModifiedBy = modifiedBy;
        ModifiedDate = modifiedDate;
        Active = active;
        NewsTypeID = newsTypeID;
        NewsCategoryID = newsCategoryID;
        NewsCategory = newsCategory;
        NewsSubCategory = newsSubCategory;
    }

    public NewsListModel() {
    }

    public void setNewsID(int newsID) {
        NewsID = newsID;
    }

    public void setNewsType(String newsType) {
        NewsType = newsType;
    }

    public void setNewsSubCategoryID(int newsSubCategoryID) {
        NewsSubCategoryID = newsSubCategoryID;
    }

    public void setNewsHeading(String newsHeading) {
        NewsHeading = newsHeading;
    }

    public void setSubHeading(String subHeading) {
        SubHeading = subHeading;
    }

    public void setPara1(String para1) {
        Para1 = para1;
    }

    public void setPara2(String para2) {
        Para2 = para2;
    }

    public void setPara3(String para3) {
        Para3 = para3;
    }

    public void setPara4(String para4) {
        Para4 = para4;
    }

    public void setPara5(String para5) {
        Para5 = para5;
    }

    public void setImg1(String img1) {
        Img1 = img1;
    }

    public void setImg2(String img2) {
        Img2 = img2;
    }

    public void setImg3(String img3) {
        Img3 = img3;
    }

    public void setImg4(String img4) {
        Img4 = img4;
    }

    public void setImg5(String img5) {
        Img5 = img5;
    }

    public void setRemarks(String remarks) {
        Remarks = remarks;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setNoOfNewsViews(int noOfNewsViews) {
        NoOfNewsViews = noOfNewsViews;
    }

    public void setCreatedBy(String createdBy) {
        CreatedBy = createdBy;
    }

    public void setCreatedDate(String createdDate) {
        CreatedDate = createdDate;
    }

    public void setModifiedBy(String modifiedBy) {
        ModifiedBy = modifiedBy;
    }

    public void setModifiedDate(String modifiedDate) {
        ModifiedDate = modifiedDate;
    }

    public void setActive(boolean active) {
        Active = active;
    }

    public void setNewsTypeID(int newsTypeID) {
        NewsTypeID = newsTypeID;
    }

    public void setNewsCategoryID(int newsCategoryID) {
        NewsCategoryID = newsCategoryID;
    }

    public void setNewsCategory(String newsCategory) {
        NewsCategory = newsCategory;
    }

    public void setNewsSubCategory(String newsSubCategory) {
        NewsSubCategory = newsSubCategory;
    }

    public int getNewsID() {
        return NewsID;
    }

    public String getNewsType() {
        return NewsType;
    }

    public int getNewsSubCategoryID() {
        return NewsSubCategoryID;
    }

    public String getNewsHeading() {
        return NewsHeading;
    }

    public String getSubHeading() {
        return SubHeading;
    }

    public String getPara1() {
        return Para1;
    }

    public String getPara2() {
        return Para2;
    }

    public String getPara3() {
        return Para3;
    }

    public String getPara4() {
        return Para4;
    }

    public String getPara5() {
        return Para5;
    }

    public String getImg1() {
        return Img1;
    }

    public String getImg2() {
        return Img2;
    }

    public String getImg3() {
        return Img3;
    }

    public String getImg4() {
        return Img4;
    }

    public String getImg5() {
        return Img5;
    }

    public String getRemarks() {
        return Remarks;
    }

    public String getLocation() {
        return Location;
    }

    public int getNoOfNewsViews() {
        return NoOfNewsViews;
    }

    public String getCreatedBy() {
        return CreatedBy;
    }

    public String getCreatedDate() {
        return CreatedDate;
    }

    public String getModifiedBy() {
        return ModifiedBy;
    }

    public String getModifiedDate() {
        return ModifiedDate;
    }

    public boolean isActive() {
        return Active;
    }

    public int getNewsTypeID() {
        return NewsTypeID;
    }

    public int getNewsCategoryID() {
        return NewsCategoryID;
    }

    public String getNewsCategory() {
        return NewsCategory;
    }

    public String getNewsSubCategory() {
        return NewsSubCategory;
    }
}
