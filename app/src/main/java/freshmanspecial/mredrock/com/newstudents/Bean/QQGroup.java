package freshmanspecial.mredrock.com.newstudents.Bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by king on 2017/8/5.
 */

public class QQGroup {


    private String GroupName_Number;

    public QQGroup() {

    }

    public String getGroupName() {
        return GroupName_Number;
    }

    public void setGroupName(String groupName) {
        this.GroupName_Number = groupName;
    }


    public QQGroup(String GroupName_Number){
        this.GroupName_Number=GroupName_Number;
    }

    /*public List<DataBean> getData() {
        return Data;
    }

    public void setData(List<DataBean> Data) {
        this.Data = Data;
    }

    public static class DataBean {
        *//**
         * GroupName : 贵州
         * Number : 601631814
         *//*

        @SerializedName("GroupName")
        private String GroupNameX;
        @SerializedName("Number")
        private String NumberX;

        public String getGroupNameX() {
            return GroupNameX;
        }

        public void setGroupNameX(String GroupNameX) {
            this.GroupNameX = GroupNameX;
        }

        public String getNumberX() {
            return NumberX;
        }

        public void setNumberX(String NumberX) {
            this.NumberX = NumberX;
        }
    }*/
}
