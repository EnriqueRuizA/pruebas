
public class PuebaReadAndWriteServlet {

	public static void main(String[] args) {

		User userBorja = new User("Borja", "123");
		User UserMario = new User("Mario", "321");


////////////Write objects to file////////////
		try {
			FileOutputStream writeLocation = new FileOutputStream(new File("falseDatabase.dat"));
			ObjectOutputStream writeObject = new ObjectOutputStream(writeLocation);


			writeObject.writeObject(userBorja);
			writeObject.writeObject(UserMario);

//			System.out.println("< The object has been saved correctly >");
//			System.out.println("");

			writeObject.close();
			writeLocation.close();

			FileInputStream readLocation = new FileInputStream(new File("falseDatabase.dat"));
			ObjectInputStream readObject = new ObjectInputStream(readLocation);

////////////Read objects////////////
			User pr1 = (User) readObject.readObject();
			User pr2 = (User) readObject.readObject();

			System.out.println("Username: "+pr1.getUserName());
			System.out.println("Password: "+pr1.getPassword());
			System.out.println("");
			System.out.println("Username: "+pr2.getUserName());
			System.out.println("Pasword: "+pr2.getPassword());
//			System.out.println("");
//			System.out.println("< The object has been readed correctly >");


			readObject.close();
			readLocation.close();

////////////EXCEPTIONS////////////
		} catch (FileNotFoundException e) {
			System.out.println("Banana Error: File not found");
		} catch (IOException e) {
			System.out.println("Banana Error: Class not found");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
