package application.Bluemarble.Server;

import java.util.Vector;

public class Room {
    Vector<ConnectUser> connectUsers;
    String title;
    int userCnt;

    Room(){
        connectUsers = new Vector<>();
    }

}
