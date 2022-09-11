package FileCopying;
import java.io.*;
import java.util.Scanner;


public class CopyFile {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        File  file1;
        FileReader fileReader;

        try {
                file1 = new File("output.txt");
                in = new FileInputStream("input.txt");
                out = new FileOutputStream("OutFile.txt");
                fileReader = new FileReader(file1);


                System.out.println("File has been created: "+file1.createNewFile());

                if (file1.createNewFile()){

                    System.out.println("File created successfully: "+ file1.getName());
                }else {
                    System.out.println("File already exists, with this name: " +file1.getName());
                }

                System.out.println("Can the file be read: "+file1.canRead());
                System.out.println("Is the file ready: "+fileReader.ready());
                System.out.println("Writing the file... " +fileReader.ready());


                FileWriter fw = new FileWriter("output.txt");
                String content = "\"I am a good fit for this role because the diverse set of skills and qualities I already have match the job description.\" +\n" +
                        "\"I am a solid communicator who understands the importance of communicating with customers, clients, and team members with clarity and professionalism.\" +\n" +
                        "\"I am also a good fit for this job  I will always collaborate with team members in a manner that is focused on the team core objective and I will always put the needs of the team above everything else. \" +\n" +
                        "\"i am a good fit because I am a positive person who embraces change, who takes on challenges with confidence, and who will seek ways to help your business grow.\" +\n" +
                        "\"i am also a good fit because I am trustworthy, dependable an d flexible. if you need me to help out at short notice, take an extra duties, or stay behind late, then I always will do.\" +\n" +
                        "\"finally, I am a good fit for this role because I am both goal oriented and a resourceful person. i will always  focus on moving forward, and I will take responsibilityfor challenges and problems as and when they occur.\n";

                fw.write(content);
                fw.close();
                
                int c;

                while ((c = in.read()) != -1){

                         out.write(c);

                     }

            Scanner myReader =  new Scanner(file1);
            System.out.println("READING FILE...");
                while (myReader.hasNextLine()){
                    String data = myReader.nextLine();
                    System.out.println(data);
                }
                for(int i = 0; i<=100;i++){
                    System.out.print("=");
                }

            }finally {
                if (in != null){
                    in.close();
                    System.out.println("\nin file is closed");
                }
                if (out!= null){
                    System.out.println("out file is closed");
                    out.close();
            }
        }
    }
}
