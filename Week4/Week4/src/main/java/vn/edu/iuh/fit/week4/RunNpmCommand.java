package vn.edu.iuh.fit.week4;

import java.io.File;
import java.io.IOException;

public class RunNpmCommand {
    public static void main(String[] args) {
        // Đường dẫn đến thư mục gốc của dự án
        String projectDir = "D:/Hoc_tap/Ktruc&TkePhanMem/ThucHanh/Week4/Week4/jdepend-ui";

        // Đường dẫn đến tệp XML báo cáo
        String xmlReportPath = "../reports/report.xml";
        // Tiền tố của gói
        String packagePrefix = "vn.edu.iuh.week4";

        // Xây dựng lệnh npm run jdepend-ui
        String npmCommand = "npm run jdepend-ui " + xmlReportPath + " " + packagePrefix;

        try {
            // Di chuyển đến thư mục gốc của dự án
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", npmCommand);
            processBuilder.directory(new File(projectDir));

            // Thực thi lệnh npm bằng cách sử dụng ProcessBuilder
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
