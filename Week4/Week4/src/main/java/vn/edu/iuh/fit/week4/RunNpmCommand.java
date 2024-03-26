package vn.edu.iuh.fit.week4;

import java.io.File;
import java.io.IOException;

public class RunNpmCommand {
    public static void main(String[] args) {
        String projectDir = "D:/Hoc_tap/Ktruc&TkePhanMem/ThucHanh/Week4/Week4/jdepend-ui";

        String xmlReportPath = "../reports/report.xml";
        String packagePrefix = "vn.edu.iuh.week4";

        String npmCommand = "npm run jdepend-ui " + xmlReportPath + " " + packagePrefix;

        try {
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", npmCommand);
            processBuilder.directory(new File(projectDir));

            Process process = processBuilder.inheritIO().start();
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Command executed successfully.");
            } else {
                System.out.println("Command failed with error code: " + exitCode);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
