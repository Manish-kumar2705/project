import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
 
public class LockedMe {
	
	public static String currentDir;
	public  File folderName;
	
	void startDisplay(){
		
		System.out.println();
		System.out.println("|*****************************************************|");
		System.out.println("|***************|   LockedMe.com   |******************|");
		System.out.println("|***************|                  |******************|");
		System.out.println("|***************|@dev: Manish kumar|******************|");
		System.out.println("|*****************************************************|");
		System.out.println();
	}
	
public void exitDisplay() {
		
		System.out.println();
		System.out.println("*************************************************");
		System.out.println("*                   THANK YOU                   *");
		System.out.println("*************************************************");
		System.out.println();	
		
	}
	
	public void mainMenuDisplay() {
		
		System.out.println();
		System.out.println("  Select any one of the following:  ");
	    System.out.println("  1 - List ALL Files                ");
	    System.out.println("  2 - Business level Operation      ");
	    System.out.println("  3 - Exit                          ");
	    System.out.println();
	}
	
	public void subMenuDisplay() {
		
		System.out.println();
		System.out.println("	Select Operation:           ");
	    System.out.println("	a - Add a file              ");
	    System.out.println("	b - Delete a file           ");
	    System.out.println("	c - Search a file           ");
	    System.out.println("	d - Go Back To Main Menu    ");
	    System.out.println("	e -  Exit                   ");
	    System.out.println();
	    
	}
	
	void mainMenu() {
		do {
        mainMenuDisplay();
        
        try {
            Scanner sc = new Scanner(System.in);
            int option = Integer.parseInt(sc.nextLine());
            
            switch (option) {
                case 1: {	//display all files.
                    	ListAllFiles();
                    mainMenu();
                    
                }
                case 2: {
                    subMenu();
                    
                }
                case 3: {
                    System.out.println("Thank You");
                    System.exit(0);
                }
                default:
                    System.out.println("\n Invalid input \n please enter from 1  2  3");
                	mainMenu();
            }
            
            sc.close();
        } catch (Exception e) {
            System.out.println("\n Invalid input \n please enter from 1  2  3");
            mainMenu();
        }
		}while(true);
    }
	
	public void subMenu() {
		subMenuDisplay();
		try {
		    Scanner sc = new Scanner(System.in);
		    char option = sc.nextLine().toLowerCase().charAt(0);
		    switch (option) {
		    case 'a': {
		    	System.out.print("Enter a file name to add: ");
		    	String fileName = sc.next().trim().toLowerCase();
		    	addFile(fileName);
		    	break;
		    }
		    case 'b': {
		    	System.out.print("Enter a file name to delete: ");
		    	String filename = sc.next().trim(); //next -because it reads till the space char.
		    	deleteFile(filename);
		    	break;
		    }
		    case 'c': {
		    	System.out.print("Enter file name to search: ");
		    	String filename = sc.next().trim();
		    	searchFile(filename);
		    	break;
		    }
		    case 'd': {
		    	System.out.println("Back to Main Menu");
		    	mainMenu();
		    	break;
		    }
		    case 'e': {
                System.out.println("Thank You");
                System.exit(0);
		    }
		    default:
		    	System.out.println("\n Invalid input \n Please enter from  a, b, c, d");
		    }
		    subMenu();
		} catch (Exception e) {
			System.out.println("\n Invalid input \n Please enter a, b, c, d");
			subMenu();
		}
	}	
	
	public void ListAllFiles() {
		if(folderName.exists()) {			//
			String[] files = folderName.list();
			if(files!= null && files.length>0) {
				Set<String> file = new TreeSet<>(Arrays.asList(files));
				for(String i : file) {
					System.out.println(i);
				}
			}
			else{
				System.out.println("Folder is empty");
			}
		}
		else{
			throw new NullPointerException("Directory doesnt exist");
		}
		
	}
	
	void addFile(String fileName) throws IOException {
		if(fileName == null || fileName.isEmpty()) {
			throw new NullPointerException("Invalid file name");
		}
        File filepath = new File(folderName + File.separator + fileName);
        
        if(filepath.createNewFile()) {
        	System.out.println( fileName + " is created at: " + folderName);
        }
        else {
        	System.out.println( fileName + " already exists at " + folderName);
       }
      
	}	
    
	void deleteFile(String fileName) throws IOException {
		if(fileName == null || fileName.isEmpty()) {
			throw new NullPointerException("Invalid file name");
		}
        File filepath = new File(folderName + File.separator + fileName);
        
        if(filepath.delete()) {
        	System.out.println( fileName + " is deleted from:" + folderName);
        }
        else {
        	System.out.println( fileName + " files not found" +"\n"+ "operation unsucccessful." );
       }
      
	}
	
	void searchFile(String fileName) {
        String[] files = folderName.list();// reurns files names in the dir  if exists or null if they doesnt.
        Arrays.sort(files);
        for (String i : files) {
            if (i.equals(fileName)) {
                System.out.println( fileName + " found at " + folderName);
                return;
            }
        }
        System.out.println("File Not found");
    }
	static String dir;
	public LockedMe(){
		currentDir= System.getProperty("user.dir");
		folderName = new File(currentDir+File.separator+"lockedMeFolder");
		if(folderName.exists()) {
			dir = folderName.getAbsolutePath();
			}
		else {
			folderName.mkdirs();
		}
	}
	
	public static void main(String[] args) throws Exception {	
		// TODO Auto-generated method stub
		
		LockedMe obj = new LockedMe();
		
		obj.startDisplay();
		System.out.println("Working dir: "+dir);
        obj.mainMenu();
		
	}
	
}
