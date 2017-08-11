package freshmanspecial.mredrock.com.newstudents.Bean;

/**
 * Created by Tecmry on 2017/8/9.
 */

public class CreativeData
{
    public String left_name;
    public String right_name;
    public int left;
    public int right;
    private String left_uri;
    private String right_uri;
    public void setLeft_name(String left_name) {
        this.left_name = left_name;
    }

    public String getLeft_name() {
        return left_name;
    }

    public void setRight_name(String right_name) {
        this.right_name = right_name;
    }

    public String getRight_name() {
        return right_name;
    }

    public int getLeft() {
        return left;
    }

    public int getRight() {
        return right;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setLeft_uri(String left_uri) {
        this.left_uri = left_uri;
    }

    public String getLeft_uri() {
        return left_uri;
    }

    public void setRight_uri(String right_uri) {
        this.right_uri = right_uri;
    }

    public String getRight_uri() {
        return right_uri;
    }
}
