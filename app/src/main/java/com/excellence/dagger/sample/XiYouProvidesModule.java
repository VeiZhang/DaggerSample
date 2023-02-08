package com.excellence.dagger.sample;

import dagger.Module;
import dagger.Provides;

/**
 * <pre>
 *     author : VeiZhang
 *     blog   : http://tiimor.cn
 *     time   : 2023/2/7
 *     desc   : 依赖提供者：提供相关的依赖
 * </pre> 
 */
@Module
public class XiYouProvidesModule {

    @Provides
    public Wukong provideWukong() {
        return new Wukong();
    }

    @Provides
    public JinGuBang provideJinGuBang() {
        return new JinGuBang();
    }

}
