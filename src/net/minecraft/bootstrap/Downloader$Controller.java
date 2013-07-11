package net.minecraft.bootstrap;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public class Downloader$Controller {

   public final CountDownLatch foundUpdateLatch = new CountDownLatch(1);
   public final AtomicBoolean foundUpdate = new AtomicBoolean(false);
   public final CountDownLatch hasDownloadedLatch = new CountDownLatch(1);


}
