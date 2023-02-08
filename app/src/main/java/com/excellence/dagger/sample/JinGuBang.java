package com.excellence.dagger.sample;

import javax.inject.Inject;

/**
 * <pre>
 *     author : VeiZhang
 *     blog   : http://tiimor.cn
 *     time   : 2023/2/7
 *     desc   :
 * </pre> 
 */
public class JinGuBang {

    @Inject
    public JinGuBang() {
    }

    public String use() {
        return "use Jing gu bang";
    }
}
