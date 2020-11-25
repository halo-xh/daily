package test;

import java.sql.*;

/**
 * Created by Xiao Hong on 2020-05-25
 */
public class Test1 {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//          Class.forName("oracle.jdbc.driver.OracleDriver");
//        Connection connection = DriverManager
//                .getConnection("jdbc:oracle:thin:@192.168.206.105:1521/ORCL","PRIMASDDL","pass123");
//        String sql = "select * from tbl_aa_resources where rownum in (?)";
//        int[] qs = new int[]{1,2,3,4};
//        String format = String.format(sql.replace("?", "%s"), convertArgs2Str(new String[]{"1","2","5","7"}));
//        PreparedStatement preparedStatement = connection.prepareStatement(sql);
//        System.out.println(format);
//        ResultSet resultSet = preparedStatement.executeQuery(format);
//        while (resultSet.next()){
//            System.out.println(resultSet.getString(1));
//        }
//        preparedStatement.close();
//        connection.close();
        String aa = "SSaaa";
        rmS(aa);
        System.out.println(aa);
        //System.out.println(convertArgs2Str(new String[]{"1","2","5","7"}));
    
    }
    private static String convertArgs2Str(String[] arg){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < arg.length; i++) {
            if (i != arg.length -1){
                res.append(arg[i]).append(",");
            }else {
                res.append(arg[i]);
            }
        }
        return res.toString();
    }
    
    private static String rmS(String s){
        return s.replace("S", "");
    }
}
