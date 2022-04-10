package utilities;

import pojos.Registrant;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTxt {

//    public static void saveRegistrantData(Registrant registrant, String fileName){
//
//        try {
//
//            FileWriter fileWriter = new FileWriter(fileName, true);
//            //src/resource/feature/testdata/PatientData
//
//            BufferedWriter writer = new BufferedWriter(fileWriter);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    public static void saveRegistrantData(Registrant registrant){

        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("registrantFile"), true);


            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(registrant.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void saveRegistrantApiData(Registrant registrant){

        try {
            FileWriter fileWriter = new FileWriter(ConfigurationReader.getProperty("registrantApiFile"), true);


            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(registrant.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}