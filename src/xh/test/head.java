package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by Xiao Hong on 2020-05-22
 */
public class head implements Comparator<head> {
    private String date;

    private String time;

    private String net;

    private String plan;

    public head() {
    }

    public head(String date, String time, String net, String plan) {
        this.date = date;
        this.time = time;
        this.net = net;
        this.plan = plan;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNet() {
        return net;
    }

    public void setNet(String net) {
        this.net = net;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "head{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", net='" + net + '\'' +
                ", plan='" + plan + '\'' +
                '}';
    }


    private static Date convertDateAdd2Date(String dateAdd) throws ParseException {
        return new SimpleDateFormat("dd/mm/yy").parse(dateAdd);
    }

    private static Date convertTimeAdd2Time(String timeAdd) throws ParseException {
        return new SimpleDateFormat("HH:MM:SS").parse(timeAdd);
    }

    @Override
    public int compare(head o1, head o2) {
        try {
            Date date1 = convertDateAdd2Date(o1.getDate());
            Date date2 = convertDateAdd2Date(o2.getDate());
            Date time1 = convertTimeAdd2Time(o1.getTime());
            Date time2 = convertTimeAdd2Time(o2.getTime());
            if (date1.before(date2)){
                return 1;
            }else if (date1.equals(date2)){
                if (time1.before(time2)){
                    return 1;
                }else if (time1.equals(time2)){
                    return 0;
                }else {
                    return -1;
                }
            }else {
                return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

//    @Override
//    public int compareTo(head o) {
//        try {
//            head o11 =this;
//            Date date1 = convertDateAdd2Date(o11.getDate());
//            Date date2 = convertDateAdd2Date(o.getDate());
//            Date time1 = convertTimeAdd2Time(o11.getTime());
//            Date time2 = convertTimeAdd2Time(o.getTime());
//            if (date1.before(date2)){
//                return 1;
//            }else if (date1.equals(date2)){
//                if (time1.before(time2)){
//                    return 1;
//                }else if (time1.equals(time2)){
//                    return 0;
//                }else {
//                    return -1;
//                }
//            }else {
//                return -1;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return -1;
//        }
//    }


}
