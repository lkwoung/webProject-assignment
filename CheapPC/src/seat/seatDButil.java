package seat;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletContext;

public class seatDButil {
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static Connection connection = null;
	
	public static Boolean[] getUseSeatList(ServletContext sc){
		connection = (Connection) sc.getAttribute("DBconnection");
		String sql = "select seat_use from food";
		
		Boolean[] useList = new Boolean[5]; 
		int i = 0;
		
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				useList[i] = rs.getBoolean("seat_use");
				i++;
			}
			rs.close();
			
		}catch(Exception e){
			System.out.println("DButil.java : seatDB() - db selete");
			e.printStackTrace();
			System.out.println(e.getMessage());
			return null;
		}		
		return useList;
		
	}

		public static ArrayList<seatUserBean> getSeatUserList(ServletContext sc){
			connection = (Connection) sc.getAttribute("DBconnection");
			ArrayList<seatUserBean> seatUserList = new ArrayList<seatUserBean>();
			
			String sql = "SELECT user.name, user.time, seat.seat_id \r\n"
					+ "FROM user iNNER JOIN seat\r\n"
					+ "ON seat_user = user.num\r\n"
					+ "ORDER BY seat.seat_id";
			
			try {
				stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					seatUserBean seatUser = new seatUserBean();
					seatUser.setName(rs.getString("user.name"));
					seatUser.setTime(rs.getString("user.time"));
					seatUser.setSeat_id(rs.getInt("seat.seat_id"));
					
					seatUserList.add(seatUser);
				}
				rs.close();
				
			}catch(Exception e){
				System.out.println("DButil.java : seatDB() - db selete");
				e.printStackTrace();
				System.out.println(e.getMessage());
				return null;
			}		
			return seatUserList;	
		}

}
