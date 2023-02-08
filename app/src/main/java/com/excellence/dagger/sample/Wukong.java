package com.excellence.dagger.sample;

import javax.inject.Inject;

/**
 * <pre>
 *     author : VeiZhang
 *     blog   : http://tiimor.cn
 *     time   : 2023/2/7
 *     desc   : 相对{@link JinGuBang}，它是依赖使用者
 *              相对{@link XiYouProvidesModule}，他是被依赖者
 * </pre> 
 */
public class Wukong {

    @Inject
    JinGuBang jinGuBang;

    @Inject
    public Wukong() {
    }

    public String useJinGuBang() {
        return jinGuBang.use();
    }
}
