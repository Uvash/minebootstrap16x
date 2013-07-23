package net.minecraft.bootstrap;

import java.io.File;

public class Util {

    public static final String APPLICATION_NAME = "mcuw16x";

    public static int getPlatform() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            return 3;
        }
        if (osName.contains("mac")) {
            return 4;
        }
        if (osName.contains("linux")) {
            return 2;
        }
        if (osName.contains("unix")) {
            return 2;
        }
        return 0;
    }

    public static File getWorkingDirectory() {
        String userHome = System.getProperty("user.home", ".");
        File workingDirectory;
        switch (getPlatform()) {

            case 2:
                workingDirectory = new File(userHome, "." + APPLICATION_NAME +"/");
                break;
            case 3:
                String applicationData = System.getenv("APPDATA");
                String folder = applicationData != null ? applicationData : userHome;
                workingDirectory = new File(folder, "." + APPLICATION_NAME +"/");
                break;
            case 4:
                workingDirectory = new File(userHome, "Library/Application Support/" + APPLICATION_NAME);
                break;
            default:
                workingDirectory = new File(userHome, APPLICATION_NAME +"/");
        }

        return workingDirectory;
    }
}