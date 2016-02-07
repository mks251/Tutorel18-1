import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main1 {

private static ArrayList<Profile1> profiles = new ArrayList<Profile1>();
private static Profile1 profile;

@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//profiles = (ArrayList<Profile1>) diserData("profiles");
		System.out.println(profiles.size());
		Profile1 profile = new Profile1();
		profile.setName(JOptionPane.showInputDialog(null, "¬ведите ваше им€"));
		profile.setSurname(JOptionPane.showInputDialog(null, "¬ведите вашу фамилию"));
		profile.setPatronymic(JOptionPane.showInputDialog(null, "¬ведите ваше отчество"));
		profile.setAddress(JOptionPane.showInputDialog(null, "¬ведите ваш адрес"));
		profiles.add(profile);
		for (Profile1 p : profiles) {
			
			System.out.println(p.getName()+" "+p.getSurname()+" "+p.getPatronymic()+" "+p.getAddress());
		
		
	}
		System.out.println(profiles.size());
		serData("profiles", profiles);
		
}
	
	private static Object diserData(String file_name){
			
		Object retObject = null;
		try{
			FileInputStream fileIn = new FileInputStream(file_name+".ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			retObject = in.readObject();
			fileIn.close();
			in.close();
		}catch (FileNotFoundException e) {
			System.out.println("‘айл не найден");
			System.exit(1);
		} catch (IOException e) {
			System.out.println("ќшибка ввода/вывода");
			System.exit(2);
		}catch (ClassNotFoundException e) {
		System.out.println(" ласс не найден");
		System.exit(3);
		}
		return retObject;
	}
		
	private static void serData(String file_name, Object obj) {
		try{
		FileOutputStream fileOut = new FileOutputStream(file_name+".ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(obj);
		fileOut.close();
		out.close();
	}catch (FileNotFoundException e) {
		System.out.println("‘айл не найден");
		System.exit(1);
	} catch (IOException e) {
		System.out.println("ќшибка ввода/вывода");
		System.exit(2);
	}
}
	}
