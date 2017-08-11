package freshmanspecial.mredrock.com.newstudents.Bean;

import android.graphics.drawable.Drawable;

public class BeautifulData
{
    public Drawable drawable;
    public String Title;
    public String News;

    public  Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
       Title = title;
    }

    public String getNews() {
        return News;
    }

    public void setNews(String news) {
        News = news;
    }
}
