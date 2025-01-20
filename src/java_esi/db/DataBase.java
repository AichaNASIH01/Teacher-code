package java_esi.db;

import java.sql.*;

public class DataBase {
	public static final int ODBC=0;
	public static final int ORACLE=1;
	public static final int MYSQL=2;
	
	private static final String mysqlBridge= "jdbc:mysql:";
	private static final String mysqlDriver= "com.mysql.cj.jdbc.Driver";
	
	private static final String oracleBridge= "jdbc:oracle:thin:";
	private static final String oracleDriver= "oracle.jdbc.OracleDriver";
	
	private String driver, bridge, dbName;
	private Connection con;
	private DatabaseMetaData dbm;
	
	
	
	private static DataBase db;
	public static DataBase getDBInstance(int type) {
		if(db==null) {
			db = new DataBase(type);
		}
		
	return db;	
	}
	private DataBase(int type) {
		switch(type) {
		case ORACLE : 
			driver = oracleDriver;
			bridge = oracleBridge;
			break;
		case MYSQL :
			driver = mysqlDriver;
			bridge = mysqlBridge;
			break;
		}
		
		try {
			System.out.println(driver);
			Class.forName(driver);
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
	public void connect(String name, String host, int port, String login, String pwd) {
		
		this.dbName=name;
		String url = bridge + "//" + host +":"+port+"/" + dbName;
		try {
			con = DriverManager.getConnection(url, login, pwd);
			System.out.println("connection etablie...");
			dbm = con.getMetaData();
			printInfo();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void printInfo() {
		try {
			System.out.println("DriverName = " + dbm.getDriverName());
			System.out.println("DriverVersion = " + dbm.getDriverVersion());
			System.out.println("catalog = " + con.getCatalog());
		}
		catch(Exception e) {}
	}
	public void executeQuery(String q) {
		try {
			System.out.println("debut");
			//
			Statement sql = con.createStatement();
			//
			ResultSet rs = sql.executeQuery(q);
			ResultSetMetaData rsm = rs.getMetaData();
			int n = rsm.getColumnCount();
			for (int i=1; i<=n; i++) System.out.print(rsm.getColumnName(i) + "\t");
			System.out.println();
			while (rs.next()) {
				for (int i=1; i<=n; i++)
					System.out.print(rs.getString(i) + "\t");
				System.out.println();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public void insert(String[] champs, String[] values, String table) {
		
	}
	
	public String[][] select(String table, String[] champs, String condition){
	return null;	
	}
	
	
	public void printTables() {
		try  {
			ResultSet rs = dbm.getTables(null, null, null, new String[]{"TABLE", "VIEW"});
			while (rs.next()) {
				System.out.println(rs.getString(3));
			}
		}
		catch(Exception e) {}
	}

}
