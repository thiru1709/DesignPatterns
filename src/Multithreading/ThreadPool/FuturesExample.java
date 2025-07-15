package Multithreading.ThreadPool;

import java.util.concurrent.*;

public class FuturesExample {

    public static void main(String[] args) {
        Future<Integer> future;
        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            future = executorService.submit(() -> {
                try {
                    Thread.sleep(2000);
                    return 42;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }

        try {
            Integer i = future.get();
            System.out.println("Task completed " + i);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 22;

        }).thenAccept(result -> System.out.println("Task completed with result " + result));


        System.out.println("Doing other work...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        completableFuture.join();


    }
}
