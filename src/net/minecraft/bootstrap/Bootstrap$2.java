package net.minecraft.bootstrap;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

final class Bootstrap$2 extends Authenticator {

   // $FF: synthetic field
   final PasswordAuthentication val$auth;


   Bootstrap$2(PasswordAuthentication var1) {
      this.val$auth = var1;
   }

   protected PasswordAuthentication getPasswordAuthentication() {
      return this.val$auth;
   }
}
