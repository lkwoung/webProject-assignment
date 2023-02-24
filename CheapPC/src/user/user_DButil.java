package user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletContext;

public class user_DButil {
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static Connection connection = null;

	public static boolean insertDB(ServletContext sc, userBean new_User) {
		connection = (Connection) sc.getAttribute("DBconnection");
		int num=0;
		String sql = "SELECT MAX(num) from user";
		
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				num = rs.getInt("MAX(num)")+1;
			}
			rs.close();
			System.out.println(num);
		}catch(Exception e) {
			System.out.println("numDButil.java : insertDB() - db insert");
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
		
		sql = "insert into user(num, user_id, user_pw, name, birth, contract, gender) "
				+ "values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			pstmt = connection.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.setString(2, new_User.getUser_id());
			pstmt.setString(3, new_User.getUser_pw());
			pstmt.setString(4, new_User.getName());
			pstmt.setString(5, new_User.getBirth());
			pstmt.setString(6, new_User.getContract());
			pstmt.setString(7, new_User.getGender());
			pstmt.executeUpdate();

			System.out.println("user db insert");
		} catch (Exception e) {
			System.out.println("userDButil.java : insertDB() - db insert");
			e.printStackTrace();
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public static ArrayList<userBean> getUserList(ServletContext sc){
		connection =(Connection) sc.getAttribute("DBconnection");
		ArrayList<userBean> user_List = new ArrayList<userBean>();
		
		String sql = "select * from user";
		
		try {
			stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				userBean user = new userBean();
				user.setNum(rs.getInt("num"));
				user.setName(rs.getString("name"));
				user.setUser_id(rs.getString("user_id"));
				user.setUser_pw(rs.getString("user_pw"));	
				user.setBirth(rs.getString("birth"));
				user.setTime(rs.getString("time"));
				user.setContract(rs.getString("contract"));
				user.setGender(rs.getString("gender"));
				
				user_List.add(user);
			}
			rs.close();
			
		}catch(Exception e){
			System.out.println("DButil.java : seleteDB() - db selete");
			e.printStackTrace();
			System.out.println(e.getMessage());
			return null;
		}
		
		return user_List;
		
	}
	
	public int login(ServletContext sc, String userID, String userPassword) {
		connection =(Connection) sc.getAttribute("DBconnection");
		
		String SQL = "SELECT user_pw FROM user WHERE user_id = ?";
		
		try {
			pstmt = connection.prepareStatement(SQL);
			pstmt.setString(1, userID);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString(1).equals(userPassword)) {
					System.out.println("�α��� ����");
					return 1; //�α��� ����
				}
				else
					System.out.println("�α��� ����");
					return 0; //��й�ȣ ����ġ
			}
			rs.close();
			return -1; //���̵� ����
		}catch(Exception e) {
			System.out.println("DButil.java : loginDB() - db login");
			e.printStackTrace();
		}
		return -2; //�����ͺ��̽� ����
	}

	public static boolean checkID(ServletContext sc, userBean new_User) {
		connection =(Connection) sc.getAttribute("DBconnection");
		
		String sql = "SELECT user_id FROM user";
		String user_Id = new_User.getUser_id();
		
		try {
			pstmt = connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				if(rs.getString(1).equals(user_Id)) {
					System.out.println("���̵� �ߺ�");
					return false; //���̵� �ߺ�
				}
			}
			rs.close();
		}catch(Exception e) {
			System.out.println("DButil.java : loginDB() - db login");
			e.printStackTrace();
		}
		System.out.println("���̵� �ߺ�X");
		return true; //���̵� �ߺ�x
	}

}
