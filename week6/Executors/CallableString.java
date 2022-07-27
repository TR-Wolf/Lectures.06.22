package Executors;

import java.util.concurrent.Callable;

public class CallableString implements Callable {
    @Override
    public String call() {
        System.out.println(Thread.currentThread().getName() + " is responsible for this call");

        StringBuilder sb = new StringBuilder();
        StringBuilder spaces = new StringBuilder();
        for(char ch = 'a'; ch <= 'z'; ch++){
            spaces.append(" ");
            sb.append(spaces.toString() + ch + "\n");
        };
        // a
        //   b
        //     c
        return sb.toString();
    }
}
