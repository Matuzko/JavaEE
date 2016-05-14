package enterprise1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter logWriter = null;
        Collection collMass []= {new ArrayList<>(), new LinkedList<>(), new HashSet<>(), new TreeSet<>()};
        int sizeOfCollections [] = {10000,100000,1000000};
        System.out.println();
        try {
            logWriter = new FileWriter("src/outputLog.txt");
            for (int i = 0; i < collMass.length; i++) {
                for (int j = 0; j < sizeOfCollections.length; j++) {
                    if (i < 2) {
                        ReportBuilder reportBuilder = CollectionTester.collectionsTester((List) collMass[i], sizeOfCollections[j]);
                        logWriter.write(reportBuilder.writeReport());
                    } else {
                        ReportBuilder reportBuilder = CollectionTester.collectionsTester((Set) collMass[i], sizeOfCollections[j]);
                        logWriter.write(reportBuilder.writeReport());
                    }
                }
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (logWriter != null) {
                logWriter.close();
            }
        }



    }
}
