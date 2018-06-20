package smartcampus.edata.com.myapplication;

import java.io.Serializable;

/**
 * 项目名：
 * 创建人：JiangYQ
 * 创建时间：2018/6/8
 * 修改日期：
 * 备注：
 */
public class Time implements Serializable{
    private int startnum;
    private int endnum;
    private String content;
    private String lesson;
    private String week;
    public  Time(int startnum,int endnum,String content,String lesson, String week){
        this.startnum=startnum;
        this.endnum=endnum;
        this.content=content;
        this.lesson=lesson;
        this.week=week;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public int getStartnum() {
        return startnum;
    }

    public void setStartnum(int startnum) {
        this.startnum = startnum;
    }

    public int getEndnum() {
        return endnum;
    }

    public void setEndnum(int endnum) {
        this.endnum = endnum;
    }

    @Override
    public String toString() {
        return "Time{" +
                "startnum=" + startnum +
                ", endnum=" + endnum +
                ", content='" + content + '\'' +
                ", lesson='" + lesson + '\'' +
                ", week='" + week + '\'' +
                '}';
    }
}
