import java.io.File;
import java.io.IOException;

public class CanvasDownloadAssistant
{
   public static void main(String[] args) throws IOException
   {
      if(args.length>0)
      {
         //Path to Extracted Assignments Is the Parameter
         File labFolder = new File(args[0]);
         
         //Gets all files at that path
         File[] files = labFolder.listFiles();
         
         //foreach loop through the files
         for(File f: files)
         {
            //get the original name of the file
            String fileName = f.getName();
            
            //set temp value for studentFolder
            File studentFolder = labFolder;
   
            //edge case check if directory contains folders
            if(fileName.indexOf("_") != -1)
            {
               //set a path for folder to hold student's files (uses the LastnameFirstname part
               //of Canvas's naming convention
               studentFolder = new File(labFolder + "\\" + fileName.substring(0,fileName.indexOf("_")));
            }
                        
            //see if the folder has already been created
            if(!studentFolder.exists())
            {
               //create the folder if it does not exist
               studentFolder.mkdir();
            }
            
            //remove the canvas naming convention from the front  
            fileName = fileName.replaceAll("^.*_\\d+_\\d+_","");
            
            //remove any number at the end of the class, appears when
            //student has multiple submissions with same file name
            fileName = fileName.replaceAll("-\\d+","");      
            
            //---Clean File Names are Left at this point---     
   
            //move the file into the student's folder and use the clean file name
            File newName = new File(studentFolder + "\\" + fileName);
            f.renameTo(newName);
         }
      }
      else
      {
         System.out.println("Please include path arg");
      }
   }
}
