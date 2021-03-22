package databases;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import org.bouncycastle.util.Arrays;

import java.util.ArrayList;

public class UnitTestConnectDB {

    public static void main(String[] args) {
        User user = new User();
        user.setStName("john");
        System.out.println(user.getStName());
        user.setStID("345");
        System.out.println(user.getStID());
        user.setStDOB("13-2-1995");
        System.out.println(user.getStDOB());
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();



    }
}
