package net.minecraft.bootstrap;

import java.io.File;

public class Util {

   public static final String APPLICATION_NAME = "minecraft";


   public static Util.OS getPlatform() {
      String osName = System.getProperty("os.name").toLowerCase();
      return osName.contains("win")?Util.OS.WINDOWS:(osName.contains("mac")?Util.OS.MACOS:(osName.contains("linux")?Util.OS.LINUX:(osName.contains("unix")?Util.OS.LINUX:Util.OS.UNKNOWN)));
   }

   public static File getWorkingDirectory() {
      String userHome = System.getProperty("user.home", ".");
      File workingDirectory;
      switch(Util$1.$SwitchMap$net$minecraft$bootstrap$Util$OS[getPlatform().ordinal()]) {
      case 1:
      case 2:
         workingDirectory = new File(userHome, ".mcuw161/");
         break;
      case 3:
         String applicationData = System.getenv("APPDATA");
         String folder = applicationData != null?applicationData:userHome;
         workingDirectory = new File(folder, ".mcuw161/");
         break;
      case 4:
         workingDirectory = new File(userHome, "Library/Application Support/mcuw161");
         break;
      default:
         workingDirectory = new File(userHome, "mcuw161/");
      }

      return workingDirectory;
   }

   // $FF: synthetic class
   static class Util$1 {

      // $FF: synthetic field
      static final int[] $SwitchMap$net$minecraft$bootstrap$Util$OS = new int[Util.OS.values().length];


      static {
         try {
            $SwitchMap$net$minecraft$bootstrap$Util$OS[Util.OS.LINUX.ordinal()] = 1;
         } catch (NoSuchFieldError var4) {
            ;
         }

         try {
            $SwitchMap$net$minecraft$bootstrap$Util$OS[Util.OS.SOLARIS.ordinal()] = 2;
         } catch (NoSuchFieldError var3) {
            ;
         }

         try {
            $SwitchMap$net$minecraft$bootstrap$Util$OS[Util.OS.WINDOWS.ordinal()] = 3;
         } catch (NoSuchFieldError var2) {
            ;
         }

         try {
            $SwitchMap$net$minecraft$bootstrap$Util$OS[Util.OS.MACOS.ordinal()] = 4;
         } catch (NoSuchFieldError var1) {
            ;
         }

      }
   }

   public static enum OS {

      WINDOWS("WINDOWS", 0),
      MACOS("MACOS", 1),
      SOLARIS("SOLARIS", 2),
      LINUX("LINUX", 3),
      UNKNOWN("UNKNOWN", 4);
      // $FF: synthetic field
      private static final Util.OS[] $VALUES = new Util.OS[]{WINDOWS, MACOS, SOLARIS, LINUX, UNKNOWN};


      private OS(String var1, int var2) {}

   }
}
