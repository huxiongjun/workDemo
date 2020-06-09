package com.imooc.spring.reactive.reactor;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

/**
 * Flux 示例
 *
 * @author 小马哥
 * @since 2018/6/22
 */
public class FluxDemo {

    public static void main(String[] args) {

        println("运行...");
        Flux.just("A", "B", "C") // 发布 A -> B -> C
//                .publishOn(Schedulers.elastic()) // 线程池切换
                .map(value -> "+" + value) // "A" -> "+" 转换
//                .subscribe(
//                        FluxDemo::println, // 数据消费 = onNext(T)
//                        FluxDemo::println, // 异常处理 = onError(Throwable)
//                        () -> { // 完成回调 = onComplete()
//                            println("完成操作！");
//                        },
//                        subscription -> { // 背压操作 onSubscribe(Subscription)
//                            subscription.cancel(); // 取消上游传输数据到下游
//                            subscription.request(Integer.MAX_VALUE); // n 请求的元素数量
//                        }
//                )
                .subscribe(new Subscriber<String>() {

                    private Subscription subscription;

                    private int count = 0;

                    @Override
                    public void onSubscribe(Subscription s) {
                        subscription = s;
                        subscription.request(1);
                    }

                    @Override
                    public void onNext(String s) {
                        if(count==2){
                            throw new RuntimeException("故意抛异常！");
                        }
                        println(s);
                        count++;
                        subscription.request(1);
                    }

                    @Override
                    public void onError(Throwable t) {
                        println(t.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        println("完成操作！");
                    }
                })
        ;

    }

    private static void println(Object object) {
        String threadName = Thread.currentThread().getName();
        System.out.println("[线程：" + threadName + "] " + object);
    }
}
