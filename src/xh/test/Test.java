package test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
//       tStaticVar t1=  new tStaticVar();
//       tStaticVar t2=  new tStaticVar();
//       tStaticVar t3=  new tStaticVar();

//       tStaticVar.setAa(12);
//        System.out.println(t1.getAa());
//        System.out.println(t2.getAa());
//        System.out.println(t3.getAa());

//        AssertTest assertTest = new AssertTest(null);
        List<String> strings = Arrays.asList("09/01/13", "19/03/18", "10/01/13", "19/07/08");

        List<String> collect = strings.stream().sorted((x1,x2)->{
            try {
                return new SimpleDateFormat("DD/MM/YY").parse(x1)
                        .compareTo(new SimpleDateFormat("DD/MM/YY").parse(x2));
            }catch (Exception e){
                e.printStackTrace();
            }
            return 0;
        }).sorted().collect(Collectors.toList());
        //System.out.println(collect);

        List<String> strings1 = Arrays.asList("17:55:37", "18:40:35", "18:14:26");
        List<String> collect1 = strings1.stream().sorted((t1, t2) -> {
            try {
                return new SimpleDateFormat("HH:mm:ss").parse(t1).compareTo(new SimpleDateFormat("HH:mm:ss").parse(t2));
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }).sorted().collect(Collectors.toList());
        //System.out.println(collect1);
        List<head> heads = Arrays.asList(new head("16/01/15", "14:29:16", null, null),
                new head("24/02/15", "18:14:26", null, null),
                new head("13/01/15", "18:06:48", null, "----"),
                new head("24/02/15", "18:40:35", null, null),
                new head("24/02/15", "17:55:37", null, null),
                new head("20/02/15", "13:02:28", null, null),
                new head("12/02/15", "19:32:32", null, "----"));
//        heads.sort(Comparator.nullsFirst((o1, o2) -> {
//            try {
//                Date date1 = convertDateAdd2Date(o1.getDate());
//                Date date2 = convertDateAdd2Date(o2.getDate());
//                Date time1 = convertTimeAdd2Time(o1.getTime());
//                Date time2 = convertTimeAdd2Time(o2.getTime());
//                if (date1.before(date2)) {
//                    return 1;
//                } else if (date1.equals(date2)) {
//                    if (time1.before(time2)) {
//                        return 1;
//                    } else if (time1.equals(time2)) {
//                        return 0;
//                    } else {
//                        return -1;
//                    }
//                } else {
//                    return -1;
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//                return 0;
//            }
//        }));
        TreeMap<head,String> treeMap = new TreeMap<>((o1, o2) -> {
            try {
                Date date1 = convertDateAdd2Date(o1.getDate());
                Date date2 = convertDateAdd2Date(o2.getDate());
                Date time1 = convertTimeAdd2Time(o1.getTime());
                Date time2 = convertTimeAdd2Time(o2.getTime());
                if (date1.before(date2)) {
                    return 1;
                } else if (date1.equals(date2)) {
                    if (time1.before(time2)) {
                        return 1;
                    } else if (time1.equals(time2)) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        });

        heads.forEach(x->treeMap.put(x,x.getTime()));
        treeMap.keySet().forEach(System.out::println);
    }


    private static Date convertDateAdd2Date(String dateAdd) throws ParseException {
        return new SimpleDateFormat("dd/mm/yy").parse(dateAdd);
    }

    private static Date convertTimeAdd2Time(String timeAdd) throws ParseException {
        return new SimpleDateFormat("HH:MM:SS").parse(timeAdd);
    }


//    private Comparator<List<Object>> nameListComparator(){
//        return Comparator.nullsFirst((v1,v2)->{
//            try {
//                if (!v1.get(0).equals(v2.get(0))){
//                    return convertDateAdd2Date(v1.get(0).toString()).compareTo(convertDateAdd2Date(v2.get(0).toString()));
//                }else if(!v1.get(1).equals(v2.get(1))){
//                    return convertTimeAdd2Time(v1.get(1).toString()).compareTo(convertTimeAdd2Time(v2.get(1).toString()));
//                }else if(!v1.get(2).equals(v2.get(2))){
//                    return v1.get(2).toString().compareTo(v2.get(2).toString());
//                }else if(!v1.get(3).equals(v2.get(3))){
//                    return v1.get(3).toString().compareTo(v2.get(3).toString());
//                }else {
//                    return 0;
//                }
//            }catch (Exception  e){
//                e.printStackTrace();
//                return 0;
//            }
//        });
//    }



}



class tStaticVar{

    private static volatile int aa = 1;

    public static void setAa(int aa) {
        tStaticVar.aa = aa;
    }

    public tStaticVar() {
        System.out.println("const");
    }

    public int getAa() {
        return aa;
    }
}

class AssertTest{

    private String name;

    public AssertTest(String name) {
//        Assert.checkNonNull(name,"name not null");
        this.name =name;
    }
}


