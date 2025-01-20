package java_esi.db;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBase db =DataBase.getDBInstance(2);
		db.connect("esi_db","localhost", 3306, "root", "password");
		db.executeQuery("select * from students");
		db.printTables();
		DataBase db1 =DataBase.getDBInstance(2);
		DataBase db2 =DataBase.getDBInstance(2);


	}

}
