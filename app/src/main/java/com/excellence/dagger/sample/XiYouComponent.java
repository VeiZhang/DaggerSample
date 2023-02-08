package com.excellence.dagger.sample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * <pre>
 *     author : VeiZhang
 *     blog   : http://tiimor.cn
 *     time   : 2023/2/7
 *     desc   : 注入中间件，用@Component表示这个接口是一个连接器，能用@Component注解的只能是interface或者抽象类
 *              https://zhuanlan.zhihu.com/p/24454466
 *
 *              https://www.jianshu.com/p/dc930653239c
 *
 * </pre> 
 */
@Component(modules = {XiYouProvidesModule.class})
@Singleton
public interface XiYouComponent {

    /**
     * 注意传参的类型匹配必须是注入的类型，否则出现空指针
     */
    void inject(MainActivity a);

    void inject(Wukong wk);
}
