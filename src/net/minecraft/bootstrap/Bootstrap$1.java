package net.minecraft.bootstrap;

import javax.swing.JScrollBar;
import net.minecraft.bootstrap.Bootstrap;

class Bootstrap$1 implements Runnable {

   // $FF: synthetic field
   final JScrollBar val$scrollBar;
   // $FF: synthetic field
   final Bootstrap this$0;


   Bootstrap$1(Bootstrap var1, JScrollBar var2) {
      this.this$0 = var1;
      this.val$scrollBar = var2;
   }

   public void run() {
      this.val$scrollBar.setValue(Integer.MAX_VALUE);
   }
}
