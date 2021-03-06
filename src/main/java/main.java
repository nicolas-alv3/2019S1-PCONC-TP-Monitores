import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

class main {

    public static void main(String[] args) throws InterruptedException {
        /***Prueba para Buffer*/
      /*  Buffer buffer = new Buffer<Integer>(1000000000);
        Productor p1 = new Productor(buffer);
        Productor p2 = new Productor(buffer);
        Consumidor c1 = new Consumidor(buffer);
        Consumidor c2 = new Consumidor(buffer);
        p1.start();
        p2.start();
        c1.start();
        c2.start();*/

        /***Prueba para Worker*/
    /*    Buffer<Runnable>  runnableBuffer = new Buffer<Runnable>(10);
        Productor productor = new TaskProductor(runnableBuffer);
        Productor productor2 = new TaskProductor(runnableBuffer);
        Worker worker = new Worker(runnableBuffer);
        runnableBuffer.enqueue(new DummyTask("Usain Bolt"));
        runnableBuffer.enqueue(new DummyTask("Rayo Mcqueen"));
        runnableBuffer.enqueue(new DummyTask("Dani"));
        runnableBuffer.enqueue(new DummyTask("Nico"));
        runnableBuffer.enqueue(new DummyTask("Paulo Londra"));
        runnableBuffer.enqueue(new DummyTask("Fredy Mercury"));
        runnableBuffer.enqueue(new DummyTask("Aristoteles"));

        productor.start();
        productor2.start();

        worker.start();
    } */
/*
        *//***Prueba para PoisonPill*//*
        Buffer<Runnable>  runnableBuffer = new Buffer<>(10);
              Productor productor = new TaskProductor(runnableBuffer);
              Productor productor2 = new TaskProductor(runnableBuffer);
              Worker worker = new Worker(runnableBuffer);
              runnableBuffer.enqueue(new DummyTask("Usain Bolt"));
              runnableBuffer.enqueue(new DummyTask("Rayo Mcqueen"));
              runnableBuffer.enqueue(new PoisonPill());
              runnableBuffer.enqueue(new DummyTask("Dani"));
              runnableBuffer.enqueue(new DummyTask("Nico"));

              productor.start();
              productor2.start();

              worker.start();*/

      /**Prueba para ThreadPool*/
          /*ThreadPool threadPool = new ThreadPool(8,10);
          ThreadPoolTaskProductor productor = new ThreadPoolTaskProductor(threadPool);

          productor.start();
          Thread.sleep(4000);
          threadPool.stop();
          productor.stopThread();*/
        /**Prueba RadixSort*/

          Long time = new Date().getTime();
          ConcurRadixSort concurRadixSort = new ConcurRadixSort(1000);
          List<Integer> array = new ArrayList<>();
          for(int i = 0;i < 100000;i++) {
            array.add((int)(Math.random() * 2147483647) + 0);
          }
          System.out.println(concurRadixSort.radixSortConcur(array));
          System.out.println("El proceso tardo " + (new Date().getTime() - time) + " milisegundos");
//        ConcurRadixSort concurRadixSort = new ConcurRadixSort(200);
//        List<Integer> array = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//            array.add((int)(Math.random() * 2147483647) + 0);
//        }
//        System.out.println(concurRadixSort.radixSortConcur(array));

    }

}



